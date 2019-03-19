package org.ngdsx.partybuilding.entity;

public class UserRankTitle {

/**
 * 职称
 */
	private int userRankTitleId;
	private String userRankTitleName;
	private int userRankTitleParentId;
	private int userRankTitleLevel;
	public int getUserRankTitleId() {
		return userRankTitleId;
	}
	public void setUserRankTitleId(int userRankTitleId) {
		this.userRankTitleId = userRankTitleId;
	}
	public String getUserRankTitleName() {
		return userRankTitleName;
	}
	public void setUserRankTitleName(String userRankTitleName) {
		this.userRankTitleName = userRankTitleName;
	}
	public int getUserRankTitleParentId() {
		return userRankTitleParentId;
	}
	public void setUserRankTitleParentId(int userRankTitleParentId) {
		this.userRankTitleParentId = userRankTitleParentId;
	}
	public int getUserRankTitleLevel() {
		return userRankTitleLevel;
	}
	public void setUserRankTitleLevel(int userRankTitleLevel) {
		this.userRankTitleLevel = userRankTitleLevel;
	}
	
}
