package org.ngdsx.partybuilding.service;

import java.io.IOException;
import java.util.List;

import org.ngdsx.partybuilding.dto.UserExecution;
import org.ngdsx.partybuilding.entity.User;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;



public interface UserService {
	/**
	 * 
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	List<User> getUserList() throws JsonParseException, JsonMappingException,IOException;
	/**
	 * 
	 * @param user
	 * @return
	 */
	UserExecution addUser(User user);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	UserExecution modifyUser(User user);
	/**
	 * 
	 * @param userId
	 * @return
	 */
	UserExecution removeUser(int userId);
	/**
	 * 
	 * @param userIdList
	 * @return
	 */
	UserExecution removeUserList(List<?> userIdList);
}
