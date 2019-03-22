package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.RoleAcl;

public interface RoleAclMapper {
    int deleteByPrimaryKey(Integer roleAclId);

    int insert(RoleAcl record);

    int insertSelective(RoleAcl record);

    RoleAcl selectByPrimaryKey(Integer roleAclId);

    int updateByPrimaryKeySelective(RoleAcl record);

    int updateByPrimaryKey(RoleAcl record);
}