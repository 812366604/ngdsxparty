package org.ngdsx.partybuilding.entity;

import java.util.Date;

/**
 * 权限相关更新记录表
 * @author jaogun
 *
 */
public class Log {

	private int logId;
	private int logType;//权限更新的类型：1部门2用户3权限模块4权限5角色6角色用户关系7角色权限关系
	private int targetId;//基于type后指定的对象id，比如用户、权限、角色等表的主键
	private String oldValue;//旧值
	private String newValue;//新值
	private String operator;
	private Date operatorTime;
	private String operatorIp;
	private int logStatus;//当前是否复原过，0没有1复原过
	public int getLogId() {
		return logId;
	}
	public void setLogId(int logId) {
		this.logId = logId;
	}
	public int getLogType() {
		return logType;
	}
	public void setLogType(int logType) {
		this.logType = logType;
	}
	public int getTargetId() {
		return targetId;
	}
	public void setTargetId(int targetId) {
		this.targetId = targetId;
	}
	public String getOldValue() {
		return oldValue;
	}
	public void setOldValue(String oldValue) {
		this.oldValue = oldValue;
	}
	public String getNewValue() {
		return newValue;
	}
	public void setNewValue(String newValue) {
		this.newValue = newValue;
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
	public int getLogStatus() {
		return logStatus;
	}
	public void setLogStatus(int logStatus) {
		this.logStatus = logStatus;
	}
}
