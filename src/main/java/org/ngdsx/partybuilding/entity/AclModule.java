package org.ngdsx.partybuilding.entity;

import java.util.Date;

/**
 * 权限模块表
 * @author jaogun
 *
 */
public class AclModule {

	private int aclModuleId;
	private String aclModuleName;
	private int aclModuleParentId;
	private String aclModuleLevel;
	private int aclModuleStatus;
	private int aclModuleSeq;
	private String aclModuleRemark;
	private String operator;
	private Date operatorTime;
	private String operatorIp;
	public int getAclModuleId() {
		return aclModuleId;
	}
	public void setAclModuleId(int aclModuleId) {
		this.aclModuleId = aclModuleId;
	}
	public String getAclModuleName() {
		return aclModuleName;
	}
	public void setAclModuleName(String aclModuleName) {
		this.aclModuleName = aclModuleName;
	}
	public int getAclModuleParentId() {
		return aclModuleParentId;
	}
	public void setAclModuleParentId(int aclModuleParentId) {
		this.aclModuleParentId = aclModuleParentId;
	}
	public String getAclModuleLevel() {
		return aclModuleLevel;
	}
	public void setAclModuleLevel(String aclModuleLevel) {
		this.aclModuleLevel = aclModuleLevel;
	}
	public int getAclModuleStatus() {
		return aclModuleStatus;
	}
	public void setAclModuleStatus(int aclModuleStatus) {
		this.aclModuleStatus = aclModuleStatus;
	}
	public int getAclModuleSeq() {
		return aclModuleSeq;
	}
	public void setAclModuleSeq(int aclModuleSeq) {
		this.aclModuleSeq = aclModuleSeq;
	}
	public String getAclModuleRemark() {
		return aclModuleRemark;
	}
	public void setAclModuleRemark(String aclModuleRemark) {
		this.aclModuleRemark = aclModuleRemark;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
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
		this.operatorIp = operatorIp;
	}
	
}
