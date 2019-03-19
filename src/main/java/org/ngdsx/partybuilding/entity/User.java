package org.ngdsx.partybuilding.entity;

import java.util.Date;

public class User {

	private int userId;
	private String userName;
	private String userPwd;//密码
	private String userSex;
	private String userImg;//照片地址
	private int userEducation;//学历
	private int userDegree;//学位
	private Date createPartyTime;
	private String userNativePlace;//籍费
	private String userAddress;//通讯地址
	private UserRankTitle userRankTitle;//职称
	private UserWorkTitle userWorkTitle;//职务
	private String userCompany;//工作单位
	private String userPost;//邮编
	private String userPhone;//手机
	private String userEmail;//邮编
	private String userResume;//个人简历
	private Department department;//所属支部
	private String userLoginIp;//最近一次登录ip
	private String userNpc;//人大政协任职情况
	private String userCheck;//是否允许登录
	private int userLevel;//个人权限
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserImg() {
		return userImg;
	}
	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
	public int getUserEducation() {
		return userEducation;
	}
	public void setUserEducation(int userEducation) {
		this.userEducation = userEducation;
	}
	public int getUserDegree() {
		return userDegree;
	}
	public void setUserDegree(int userDegree) {
		this.userDegree = userDegree;
	}
	public Date getCreatePartyTime() {
		return createPartyTime;
	}
	public void setCreatePartyTime(Date createPartyTime) {
		this.createPartyTime = createPartyTime;
	}
	public String getUserNativePlace() {
		return userNativePlace;
	}
	public void setUserNativePlace(String userNativePlace) {
		this.userNativePlace = userNativePlace;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public UserRankTitle getUserRankTitle() {
		return userRankTitle;
	}
	public void setUserRankTitle(UserRankTitle userRankTitle) {
		this.userRankTitle = userRankTitle;
	}
	public UserWorkTitle getUserWorkTitle() {
		return userWorkTitle;
	}
	public void setUserWorktitle(UserWorkTitle userWorkTitle) {
		this.userWorkTitle = userWorkTitle;
	}
	public String getUserCompany() {
		return userCompany;
	}
	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}
	public String getUserPost() {
		return userPost;
	}
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserResume() {
		return userResume;
	}
	public void setUserResume(String userResume) {
		this.userResume = userResume;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getUserLoginIp() {
		return userLoginIp;
	}
	public void setUserLoginIp(String userLoginIp) {
		this.userLoginIp = userLoginIp;
	}
	public String getUserNpc() {
		return userNpc;
	}
	public void setUserNpc(String userNpc) {
		this.userNpc = userNpc;
	}
	public String getUserCheck() {
		return userCheck;
	}
	public void setUserCheck(String userCheck) {
		this.userCheck = userCheck;
	}
	public int getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(int userLevel) {
		this.userLevel = userLevel;
	}	
}
