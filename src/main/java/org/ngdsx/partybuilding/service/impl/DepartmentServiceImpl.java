package org.ngdsx.partybuilding.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.ngdsx.partybuilding.dao.DepartmentMapper;
import org.ngdsx.partybuilding.entity.SysDepartment;
import org.ngdsx.partybuilding.param.DepartmentParam;
import org.ngdsx.partybuilding.service.DepartmentService;
import org.ngdsx.partybuilding.util.BeanValidator;
import org.ngdsx.partybuilding.exception.ParamException;
import org.ngdsx.partybuilding.util.LevelUtil;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.base.Preconditions;


public class DepartmentServiceImpl implements DepartmentService{
	@Resource
	private DepartmentMapper departmentMapper;
	@Override
	public void save(DepartmentParam param) {
		BeanValidator.check(param);	
		if(checkExist(param.getParentId(), param.getName(), param.getId())) {
            throw new ParamException("同一层级下存在相同名称的部门");
        }
		SysDepartment department = SysDepartment.builder().departmentName(param.getName())
				.parentId(param.getParentId()).seq(param.getSeq())
				.remark(param.getRemark()).build();
		
		department.setDepartmentLevel(LevelUtil.calculateLevel(
				getLevel(param.getParentId()), param.getParentId()));
		department.setOperator("system"); //TODO:
		department.setOperatorIp("127.0.0.1"); //TODO:
		department.setOperatorTime(new Date()); //TODO:
		departmentMapper.insertSelective(department);
	}

	@Override
	public void update(DepartmentParam param) {
		BeanValidator.check(param);	
		if(checkExist(param.getParentId(), param.getName(), param.getId())) {
			throw new ParamException("同一层级下存在相同名称的部门");
		}
		SysDepartment before = departmentMapper.selectByPrimaryKey(param.getId());
		Preconditions.checkNotNull(before,"待更新的部门不存在");
		if(checkExist(param.getParentId(), param.getName(), param.getId())) {
			throw new ParamException("同一层级下存在相同名称的部门");
		}
		SysDepartment after = SysDepartment.builder().id(param.getId()).departmentName(param.getName())
				.parentId(param.getParentId()).seq(param.getSeq())
				.remark(param.getRemark()).build();
		after.setDepartmentLevel(LevelUtil.calculateLevel(getLevel(param.getParentId()), param.getParentId()));
		after.setOperator("system"); //TODO:
		after.setOperatorIp("127.0.0.1"); //TODO:
		after.setOperatorTime(new Date()); //TODO:
		
		updateWithChild(before, after);
	}
	@Transactional
	private void updateWithChild(SysDepartment before, SysDepartment after){
		String newLevelPrefix = after.getDepartmentLevel();
		String oldLevelPrefix = before.getDepartmentLevel();
		if (!after.getDepartmentLevel().equals(before.getDepartmentLevel())){
			List<SysDepartment> deptList = departmentMapper.getChildDeptListByLevel(before.getDepartmentLevel());
			if (CollectionUtils.isNotEmpty(deptList)){
				for (SysDepartment dept : deptList) {
					String level = dept.getDepartmentLevel();
					if (level.indexOf(oldLevelPrefix) == 0){
						level = newLevelPrefix + level.substring(oldLevelPrefix.length());
						dept.setDepartmentLevel(level);
					}
				}
				departmentMapper.batchUpdateLevel(deptList);
			}
		}
		
		departmentMapper.updateByPrimaryKey(after);
	}
	
	private boolean checkExist(Integer parentId, String deptName, Integer deptId) {
        return departmentMapper.countByNameAndParentId(parentId, deptName, deptId) > 0;
    }
	
	private String getLevel(Integer departmentId) {
		SysDepartment department = departmentMapper.selectByPrimaryKey(departmentId);
		if(department == null) {
			return null;
		}
		return department.getDepartmentLevel();
	}

}
