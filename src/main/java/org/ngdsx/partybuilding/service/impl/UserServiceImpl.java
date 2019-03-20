package org.ngdsx.partybuilding.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.ngdsx.partybuilding.dao.UserDao;
import org.ngdsx.partybuilding.dto.UserExecution;
import org.ngdsx.partybuilding.entity.User;
import org.ngdsx.partybuilding.enums.UserStateEnum;
import org.ngdsx.partybuilding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.ngdsx.partybuilding.cache.JedisUtil;

public class UserServiceImpl implements UserService{
	@Autowired
	private JedisUtil.Strings jedisStrings;
	@Autowired
	private JedisUtil.Keys jedisKeys;
	@Autowired
	private UserDao userDao;
	
	private static String USERLISTKEY = "userlist";
	@Override
	public List<User> getUserList() throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		String key = USERLISTKEY;
		List<User> userList = null;
		ObjectMapper mapper = new ObjectMapper();
		if (!jedisKeys.exists(key)) {
			userList = userDao.queryUser();
			String jsonString = mapper.writeValueAsString(userList);
			jedisStrings.set(key, jsonString);
		} else {
			String jsonString = jedisStrings.get(key);
			JavaType javaType = mapper.getTypeFactory().constructParametricType(ArrayList.class, User.class);
			userList = mapper.readValue(jsonString, javaType);
		}
		return userList;
	}

	@Override
	@Transactional
	public UserExecution addUser(User user) {
		// TODO Auto-generated method stub
		if (user.getUserName() != null && !"".equals(user.getUserName())) {
			user.setCreatePartyTime(new Date());			
			try {
				int effectedNum = userDao.insertUser(user);
				if(effectedNum > 0) {
					String key = USERLISTKEY;
					if(jedisKeys.exists(key)) {
						jedisKeys.del(key);
					}
					return new UserExecution(UserStateEnum.SUCCESS, user);
				} else {
					return new UserExecution(UserStateEnum.INNER_ERROR);
				}
			} catch(Exception e) {
				throw new RuntimeException("添加用户失败:" + e.toString());
			}
		} else {
			return new UserExecution(UserStateEnum.EMPTY);
		}
		
	}

	@Override
	@Transactional
	public UserExecution modifyUser(User user) {
		// TODO Auto-generated method stub
		if("".equals(user.getUserId()) && user.getUserId() > 0) {
			try {
				int effectedNum = userDao.updateUser(user);
				if(effectedNum > 0) {
					String key = USERLISTKEY;
					if(jedisKeys.exists(key)) {
						jedisKeys.del(key);
					}
					return new UserExecution(UserStateEnum.SUCCESS, user);
				} else {
					return new UserExecution(UserStateEnum.INNER_ERROR);
				}
			} catch (Exception e) {
				throw new RuntimeException("更新用户失败：" + e.toString());
			}
		} else {			
			return new UserExecution(UserStateEnum.EMPTY);
		}
	}

	@Override
	public UserExecution removeUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserExecution removeUserList(List<?> userIdList) {
		// TODO Auto-generated method stub
		return null;
	}

}
