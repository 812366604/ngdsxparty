package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysAcl;

public interface AclMapper {
    int deleteByPrimaryKey(Integer aclId);

    int insert(SysAcl record);

    int insertSelective(SysAcl record);

    SysAcl selectByPrimaryKey(Integer aclId);

    int updateByPrimaryKeySelective(SysAcl record);

    int updateByPrimaryKey(SysAcl record);
}