package org.ngdsx.partybuilding.service.impl;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MultiMap;
import org.ngdsx.partybuilding.dao.DepartmentMapper;
import org.ngdsx.partybuilding.dto.DepartmentLevelDto;
import org.ngdsx.partybuilding.entity.SysDepartment;
import org.ngdsx.partybuilding.service.TreeService;
import org.ngdsx.partybuilding.util.LevelUtil;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

public class TreeServiceImpl implements TreeService {

	@Resource
	private DepartmentMapper departmentMapper;
	@Override
	public List<DepartmentLevelDto> departmentTree() {
		List<SysDepartment> departmentList = departmentMapper.getAllDept();
		
		List<DepartmentLevelDto> dtoList = Lists.newArrayList();
		for(SysDepartment dept : departmentList){
			DepartmentLevelDto dto = DepartmentLevelDto.adapt(dept);
			dtoList.add(dto);
		}
		return deptListToTree(dtoList);
	}
	
	public List<DepartmentLevelDto> deptListToTree(List<DepartmentLevelDto> deptLevelList){
		if (CollectionUtils.isEmpty(deptLevelList)){
			return Lists.newArrayList();
		}
		// level -> [dept1, dept2, ...] Map<String, List<Object>>
		Multimap<String, DepartmentLevelDto> levelDeptMap = ArrayListMultimap.create();
		List<DepartmentLevelDto> rootList = Lists.newArrayList();
		
		for (DepartmentLevelDto dto : deptLevelList){
			levelDeptMap.put(dto.getDepartmentLevel(), dto);
			if (LevelUtil.ROOT.equals(dto.getDepartmentLevel())){
				rootList.add(dto);
			}
		}
		
		//按照seq从小到大排序
		Collections.sort(rootList, new Comparator<DepartmentLevelDto>(){
			public int compare(DepartmentLevelDto o1, DepartmentLevelDto o2){
				return o1.getSeq() - o2.getSeq();
			}
		});
		//递归生成树
		transformDeptTree(rootList, LevelUtil.ROOT, levelDeptMap);
		return rootList;
	}
	
	public void transformDeptTree(List<DepartmentLevelDto> deptLevelList, 
			String level, Multimap<String, DepartmentLevelDto> levelDeptMap){
		for (int i = 0; i < deptLevelList.size(); i++){
			//遍历该层的每个元素
			DepartmentLevelDto deptLevelDto = deptLevelList.get(i);
			//处理当前层级的数据
			String nextLevel = LevelUtil.calculateLevel(level, deptLevelDto.getDepartmentId());
			//处理下一层
			List<DepartmentLevelDto> tempDeptList = (List<DepartmentLevelDto>)levelDeptMap.get(nextLevel);
			if (CollectionUtils.isNotEmpty(tempDeptList)){
				//排序
				Collections.sort(tempDeptList, depSeqComparator);
				//设置下一层部门
				deptLevelDto.setDepartmentList(tempDeptList);
				//进入到下一层处理
				transformDeptTree(tempDeptList, nextLevel, levelDeptMap);
			}
		}
	}
	
	public Comparator<DepartmentLevelDto> depSeqComparator = new Comparator<DepartmentLevelDto>(){
		public int compare(DepartmentLevelDto o1, DepartmentLevelDto o2){
			return o1.getSeq() - o2.getSeq(); 
		}
	};

}
