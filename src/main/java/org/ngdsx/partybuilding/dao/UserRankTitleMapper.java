package org.ngdsx.partybuilding.dao;

import org.ngdsx.partybuilding.entity.UserRankTitle;

public interface UserRankTitleMapper {
    int deleteByPrimaryKey(Integer userRankTitleId);

    int insert(UserRankTitle record);

    int insertSelective(UserRankTitle record);

    UserRankTitle selectByPrimaryKey(Integer userRankTitleId);

    int updateByPrimaryKeySelective(UserRankTitle record);

    int updateByPrimaryKey(UserRankTitle record);
}