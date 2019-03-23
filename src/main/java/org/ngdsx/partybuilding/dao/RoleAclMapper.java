package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysRoleAcl;

public interface RoleAclMapper {
    int deleteByPrimaryKey(Integer roleAclId);

    int insert(SysRoleAcl record);

    int insertSelective(SysRoleAcl record);

    SysRoleAcl selectByPrimaryKey(Integer roleAclId);

    int updateByPrimaryKeySelective(SysRoleAcl record);

    int updateByPrimaryKey(SysRoleAcl record);
}