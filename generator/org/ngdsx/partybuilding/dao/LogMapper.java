package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.Log;
import org.ngdsx.partybuilding.entity.LogWithBLOBs;

public interface LogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(LogWithBLOBs record);

    int insertSelective(LogWithBLOBs record);

    LogWithBLOBs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(LogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(LogWithBLOBs record);

    int updateByPrimaryKey(Log record);
}