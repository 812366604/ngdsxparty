package org.ngdsx.partybuilding.service;

import java.io.IOException;
import java.util.List;

import org.ngdsx.partybuilding.dto.UserExecution;
import org.ngdsx.partybuilding.entity.SysUser;
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
	List<SysUser> getUserList() throws JsonParseException, JsonMappingException,IOException;
	/**
	 * 
	 * @param user
	 * @return
	 */
	UserExecution addUser(SysUser user);
	
	/**
	 * 
	 * @param user
	 * @return
	 */
	UserExecution modifyUser(SysUser user);
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
