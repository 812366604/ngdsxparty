package org.ngdsx.partybuilding.dao;

import java.util.List;

import org.ngdsx.partybuilding.entity.User;

public interface UserDao {
	/**
	 * 列出区域
	 * @return
	 */
	List<User> queryUser();
	
	/**
	 * 新增区域
	 * @param user
	 * @return
	 */
	int insertUser(User User);
	
	/**
	 * 更新区域
	 * @param user
	 * @return
	 */
	int updateUser(User user);
	
	/**
	 * 删除区域
	 * @param user
	 * @return
	 */
	int deleteUser(User user);
	
	/**
	 * 批量删除区域
	 * @param userList
	 * @return
	 */
	int batchDeleteUser(List<Long> userList);
}
