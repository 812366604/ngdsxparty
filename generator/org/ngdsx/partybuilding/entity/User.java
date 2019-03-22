package org.ngdsx.partybuilding.entity;

import java.util.Date;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private String userSex;

    private String userImg;

    private Integer userEducation;

    private Integer userDegree;

    private Date createPartyTime;

    private String userNativePlace;

    private String userAddress;

    private Integer userRankTitle;

    private Integer userWorkTitle;

    private String userCompany;

    private String userPost;

    private String userPhone;

    private String userEmail;

    private String userResume;

    private Integer departmentId;

    private String userLoginIp;

    private String userNpc;

    private String userCheck;

    private String operator;

    private Date operatorTime;

    private String operatorIp;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg == null ? null : userImg.trim();
    }

    public Integer getUserEducation() {
        return userEducation;
    }

    public void setUserEducation(Integer userEducation) {
        this.userEducation = userEducation;
    }

    public Integer getUserDegree() {
        return userDegree;
    }

    public void setUserDegree(Integer userDegree) {
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
        this.userNativePlace = userNativePlace == null ? null : userNativePlace.trim();
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress == null ? null : userAddress.trim();
    }

    public Integer getUserRankTitle() {
        return userRankTitle;
    }

    public void setUserRankTitle(Integer userRankTitle) {
        this.userRankTitle = userRankTitle;
    }

    public Integer getUserWorkTitle() {
        return userWorkTitle;
    }

    public void setUserWorkTitle(Integer userWorkTitle) {
        this.userWorkTitle = userWorkTitle;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany == null ? null : userCompany.trim();
    }

    public String getUserPost() {
        return userPost;
    }

    public void setUserPost(String userPost) {
        this.userPost = userPost == null ? null : userPost.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserResume() {
        return userResume;
    }

    public void setUserResume(String userResume) {
        this.userResume = userResume == null ? null : userResume.trim();
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getUserLoginIp() {
        return userLoginIp;
    }

    public void setUserLoginIp(String userLoginIp) {
        this.userLoginIp = userLoginIp == null ? null : userLoginIp.trim();
    }

    public String getUserNpc() {
        return userNpc;
    }

    public void setUserNpc(String userNpc) {
        this.userNpc = userNpc == null ? null : userNpc.trim();
    }

    public String getUserCheck() {
        return userCheck;
    }

    public void setUserCheck(String userCheck) {
        this.userCheck = userCheck == null ? null : userCheck.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getOperatorTime() {
        return operatorTime;
    }

    public void setOperatorTime(Date operatorTime) {
        this.operatorTime = operatorTime;
    }

    public String getOperatorIp() {
        return operatorIp;
    }

    public void setOperatorIp(String operatorIp) {
        this.operatorIp = operatorIp == null ? null : operatorIp.trim();
    }
}