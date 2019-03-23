package org.ngdsx.partybuilding.entity;

import java.util.Date;

public class SysAclModule {
    private Integer aclModuleId;

    private String aclModuleName;

    private Integer aclModuleParentId;

    private String aclModuleLevel;

    private Integer aclModuleStatus;

    private Integer aclModuleSeq;

    private String aclModuleRemark;

    private String operator;

    private Date operatorTime;

    private String operatorIp;

    public Integer getAclModuleId() {
        return aclModuleId;
    }

    public void setAclModuleId(Integer aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    public String getAclModuleName() {
        return aclModuleName;
    }

    public void setAclModuleName(String aclModuleName) {
        this.aclModuleName = aclModuleName == null ? null : aclModuleName.trim();
    }

    public Integer getAclModuleParentId() {
        return aclModuleParentId;
    }

    public void setAclModuleParentId(Integer aclModuleParentId) {
        this.aclModuleParentId = aclModuleParentId;
    }

    public String getAclModuleLevel() {
        return aclModuleLevel;
    }

    public void setAclModuleLevel(String aclModuleLevel) {
        this.aclModuleLevel = aclModuleLevel == null ? null : aclModuleLevel.trim();
    }

    public Integer getAclModuleStatus() {
        return aclModuleStatus;
    }

    public void setAclModuleStatus(Integer aclModuleStatus) {
        this.aclModuleStatus = aclModuleStatus;
    }

    public Integer getAclModuleSeq() {
        return aclModuleSeq;
    }

    public void setAclModuleSeq(Integer aclModuleSeq) {
        this.aclModuleSeq = aclModuleSeq;
    }

    public String getAclModuleRemark() {
        return aclModuleRemark;
    }

    public void setAclModuleRemark(String aclModuleRemark) {
        this.aclModuleRemark = aclModuleRemark == null ? null : aclModuleRemark.trim();
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