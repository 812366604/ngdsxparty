package org.ngdsx.partybuilding.entity;
import java.util.Date;

/**
 * 角色权限表
 * @author jaogun
 *
 */
public class RoleAcl {

	private int roleAclId;
	private Role roleId;//角色id
	private Acl aclId;//权限id
	private String operator;
	private Date operatorTime;
	private String operatorIp;
	public int getRoleAclId() {
		return roleAclId;
	}
	public void setRoleAclId(int roleAclId) {
		this.roleAclId = roleAclId;
	}
	public Role getRoleId() {
		return roleId;
	}
	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
	public Acl getAclId() {
		return aclId;
	}
	public void setAclId(Acl aclId) {
		this.aclId = aclId;
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
