package org.ngdsx.partybuilding.service.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.ngdsx.partybuilding.dao.DepartmentMapper;
import org.ngdsx.partybuilding.entity.SysDepartment;
import org.ngdsx.partybuilding.param.DepartmentParam;
import org.ngdsx.partybuilding.service.DepartmentService;
import org.ngdsx.partybuilding.util.BeanValidator;
import org.ngdsx.partybuilding.exception.ParamException;
import org.ngdsx.partybuilding.util.LevelUtil;


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
