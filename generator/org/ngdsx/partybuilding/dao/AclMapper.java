package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.Acl;

public interface AclMapper {
    int deleteByPrimaryKey(Integer aclId);

    int insert(Acl record);

    int insertSelective(Acl record);

    Acl selectByPrimaryKey(Integer aclId);

    int updateByPrimaryKeySelective(Acl record);

    int updateByPrimaryKey(Acl record);
}