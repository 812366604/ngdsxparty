package org.ngdsx.partybuilding.entity;

import java.util.Date;

/**
 * 角色用户关联表
 * @author jaogun
 *
 */
public class RoleUser {

	private int roleUserId;
	private Role roleId; //角色id
	private User userId; //用户id
	private String operator;
	private Date operatorTime;
	private String operatorIp;
	public int getRoleUserId() {
		return roleUserId;
	}
	public void setRoleUserId(int roleUserId) {
		this.roleUserId = roleUserId;
	}
	public Role getRoleId() {
		return roleId;
	}
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
	public User getUserId() {
		return userId;
	}
	public void setUserId(User userId) {
		this.userId = userId;
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
