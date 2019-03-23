package org.ngdsx.partybuilding.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ngdsx.partybuilding.entity.SysDepartment;


public interface DepartmentMapper {
	int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(SysDepartment record);

    int insertSelective(SysDepartment record);

    SysDepartment selectByPrimaryKey(@Param("id")Integer id);

    int updateByPrimaryKeySelective(SysDepartment record);

    int updateByPrimaryKey(SysDepartment record);

    List<SysDepartment> getAllDept();

    List<SysDepartment> getChildDeptListByLevel(@Param("level") String level);

    void batchUpdateLevel(@Param("sysDeptList") List<SysDepartment> sysDeptList);

    int countByNameAndParentId(@Param("parentId") Integer parentId, @Param("name") String name, @Param("id") Integer id);

    int countByParentId(@Param("deptId") int deptId);
}