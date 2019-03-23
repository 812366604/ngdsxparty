package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.SysUserRankTitle;

public interface UserRankTitleMapper {
    int deleteByPrimaryKey(Integer userRankTitleId);

    int insert(SysUserRankTitle record);

    int insertSelective(SysUserRankTitle record);

    SysUserRankTitle selectByPrimaryKey(Integer userRankTitleId);

    int updateByPrimaryKeySelective(SysUserRankTitle record);

    int updateByPrimaryKey(SysUserRankTitle record);
}