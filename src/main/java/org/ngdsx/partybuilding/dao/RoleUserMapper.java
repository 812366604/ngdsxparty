package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysRoleUser;

public interface RoleUserMapper {
    int deleteByPrimaryKey(Integer roleUserId);

    int insert(SysRoleUser record);

    int insertSelective(SysRoleUser record);

    SysRoleUser selectByPrimaryKey(Integer roleUserId);

    int updateByPrimaryKeySelective(SysRoleUser record);

    int updateByPrimaryKey(SysRoleUser record);
}