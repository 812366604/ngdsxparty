package org.ngdsx.partybuilding.entity;

public class UserRankTitle {
    private Integer userRankTitleId;

    private String userRankTitleName;

    private Integer userRankTitleParentId;

    private Integer userRankTitleLevel;

    public Integer getUserRankTitleId() {
        return userRankTitleId;
    }

    public void setUserRankTitleId(Integer userRankTitleId) {
        this.userRankTitleId = userRankTitleId;
    }

    public String getUserRankTitleName() {
        return userRankTitleName;
    }

    public void setUserRankTitleName(String userRankTitleName) {
        this.userRankTitleName = userRankTitleName == null ? null : userRankTitleName.trim();
    }

    public Integer getUserRankTitleParentId() {
        return userRankTitleParentId;
    }

    public void setUserRankTitleParentId(Integer userRankTitleParentId) {
        this.userRankTitleParentId = userRankTitleParentId;
    }

    public Integer getUserRankTitleLevel() {
        return userRankTitleLevel;
    }

    public void setUserRankTitleLevel(Integer userRankTitleLevel) {
        this.userRankTitleLevel = userRankTitleLevel;
    }
}