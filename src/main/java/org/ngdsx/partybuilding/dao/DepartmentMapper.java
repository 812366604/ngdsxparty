package org.ngdsx.partybuilding.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ngdsx.partybuilding.entity.Department;


public interface DepartmentMapper {
	int deleteByPrimaryKey(@Param("id") Integer id);

    int insert(Department record);

    int insertSelective(Department record);

    Department selectByPrimaryKey(@Param("id")Integer id);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);

    List<Department> getAllDept();

    List<Department> getChildDeptListByLevel(@Param("level") String level);

    void batchUpdateLevel(@Param("sysDeptList") List<Department> sysDeptList);

    int countByNameAndParentId(@Param("parentId") Integer parentId, @Param("name") String name, @Param("id") Integer id);

    int countByParentId(@Param("deptId") int deptId);
}