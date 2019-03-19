package org.ngdsx.partybuilding.entity;
import java.util.Date;

public class RoleAccess {

	private int roleAccessId;
	private Role role;
	private Access access;
	private Date createTime;
	private Date updateTime;
	public int getRoleAccessId() {
		return roleAccessId;
	}
	public void setRoleAccessId(int roleAccessId) {
		this.roleAccessId = roleAccessId;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Access getAccess() {
		return access;
	}
	public void setAccess(Access access) {
		this.access = access;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
