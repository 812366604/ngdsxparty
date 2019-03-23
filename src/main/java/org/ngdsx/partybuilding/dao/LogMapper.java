package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysLog;
import org.ngdsx.partybuilding.entity.SysLogWithBLOBs;

public interface LogMapper {
    int deleteByPrimaryKey(Integer logId);

    int insert(SysLogWithBLOBs record);

    int insertSelective(SysLogWithBLOBs record);

    SysLogWithBLOBs selectByPrimaryKey(Integer logId);

    int updateByPrimaryKeySelective(SysLogWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SysLogWithBLOBs record);

    int updateByPrimaryKey(SysLog record);
}