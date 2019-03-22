package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.RoleUser;

public interface RoleUserMapper {
    int deleteByPrimaryKey(Integer roleUserId);

    int insert(RoleUser record);

    int insertSelective(RoleUser record);

    RoleUser selectByPrimaryKey(Integer roleUserId);

    int updateByPrimaryKeySelective(RoleUser record);

    int updateByPrimaryKey(RoleUser record);
}