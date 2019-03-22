package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.AclModule;

public interface AclModuleMapper {
    int insert(AclModule record);

    int insertSelective(AclModule record);
}