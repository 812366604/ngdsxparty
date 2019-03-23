package org.ngdsx.partybuilding.dto;

import java.util.List;

import org.ngdsx.partybuilding.entity.SysDepartment;
import org.springframework.beans.BeanUtils;

import com.google.common.collect.Lists;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class DepartmentLevelDto extends SysDepartment{
	
	private List<DepartmentLevelDto> departmentList =  Lists.newArrayList();
	
	public static DepartmentLevelDto adapt(SysDepartment dept){
		DepartmentLevelDto dto = new DepartmentLevelDto();
		BeanUtils.copyProperties(dept, dto);
		return dto;		
	}
}
