package org.ngdsx.partybuilding.dto;

import java.util.List;

import org.ngdsx.partybuilding.entity.SysUser;
import org.ngdsx.partybuilding.enums.UserStateEnum;

public class UserExecution {
	// 结果状态
	private int state;

	// 状态标识
	private String stateInfo;

	// 用户数量
	private int count;

	// 操作的user（增删改用户的时候用）
	private SysUser user;
	
	// 获取的user列表(查询用户列表的时候用)
	private List<SysUser> userList;
	
	public UserExecution() {}
	
	//用户操作失败时使用的构造器
	public UserExecution(UserStateEnum stateEnum) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
	}
	//用户操作成功时使用的构造器
	public UserExecution(UserStateEnum stateEnum,SysUser user) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.user = user;
	}
	//用户操作成功时使用的构造器
	public UserExecution(UserStateEnum stateEnum,List<SysUser> userList) {
		this.state = stateEnum.getState();
		this.stateInfo = stateEnum.getStateInfo();
		this.userList = userList;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

	public void setStateInfo(String stateInfo) {
		this.stateInfo = stateInfo;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public SysUser getUser() {
		return user;
	}

	public void setUser(SysUser user) {
		this.user = user;
	}

	public List<SysUser> getUserList() {
		return userList;
	}

	public void setUserList(List<SysUser> userList) {
		this.userList = userList;
	}
	
}
