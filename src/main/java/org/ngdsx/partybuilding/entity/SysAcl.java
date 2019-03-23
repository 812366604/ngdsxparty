package org.ngdsx.partybuilding.entity;

import java.util.Date;

public class SysAcl {
    private Integer aclId;

    private String aclCode;

    private String aclName;

    private Integer aclModuleId;

    private String aclUrl;

    private Integer aclType;

    private Integer aclStatus;

    private Integer aclSeq;

    private String aclRemark;

    private String operator;

    private Date operatorTime;

    private String operatorIp;

    public Integer getAclId() {
        return aclId;
    }

    public void setAclId(Integer aclId) {
        this.aclId = aclId;
    }

    public String getAclCode() {
        return aclCode;
    }

    public void setAclCode(String aclCode) {
        this.aclCode = aclCode == null ? null : aclCode.trim();
    }

    public String getAclName() {
        return aclName;
    }

    public void setAclName(String aclName) {
        this.aclName = aclName == null ? null : aclName.trim();
    }

    public Integer getAclModuleId() {
        return aclModuleId;
    }

    public void setAclModuleId(Integer aclModuleId) {
        this.aclModuleId = aclModuleId;
    }

    public String getAclUrl() {
        return aclUrl;
    }

    public void setAclUrl(String aclUrl) {
        this.aclUrl = aclUrl == null ? null : aclUrl.trim();
    }

    public Integer getAclType() {
        return aclType;
    }

    public void setAclType(Integer aclType) {
        this.aclType = aclType;
    }

    public Integer getAclStatus() {
        return aclStatus;
    }

    public void setAclStatus(Integer aclStatus) {
        this.aclStatus = aclStatus;
    }

    public Integer getAclSeq() {
        return aclSeq;
    }

    public void setAclSeq(Integer aclSeq) {
        this.aclSeq = aclSeq;
    }

    public String getAclRemark() {
        return aclRemark;
    }

    public void setAclRemark(String aclRemark) {
        this.aclRemark = aclRemark == null ? null : aclRemark.trim();
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