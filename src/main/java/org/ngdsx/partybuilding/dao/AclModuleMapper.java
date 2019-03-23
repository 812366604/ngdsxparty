package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysAclModule;

public interface AclModuleMapper {
    int insert(SysAclModule record);

    int insertSelective(SysAclModule record);
}