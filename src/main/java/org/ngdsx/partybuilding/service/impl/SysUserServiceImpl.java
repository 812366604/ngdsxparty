package org.ngdsx.partybuilding.service.impl;

import javax.annotation.Resource;

import org.ngdsx.partybuilding.dao.UserMapper;
import org.ngdsx.partybuilding.entity.SysUser;
import org.ngdsx.partybuilding.exception.ParamException;
import org.ngdsx.partybuilding.param.UserParam;
import org.ngdsx.partybuilding.service.SysUserService;
import org.ngdsx.partybuilding.util.BeanValidator;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

	@Resource
	private UserMapper sysUserMapper;
	@Override
	public void save(UserParam param) {
		BeanValidator.check(param);
		if(checkTelephoneExist(param.getTelephone(), param.getId())){
			throw new ParamException("电话已被占用");
		}
		if(checkEmailExist(param.getMail(), param.getId())){
			throw new ParamException("邮箱已被占用");
		}
		String password = "123456";
		SysUser sysUser = SysUser.builder().userName(param.getUsername()).build();//这里没有写完
	}

	public boolean checkEmailExist(String mail, Integer userId){
		return false;
	}
	public boolean checkTelephoneExist(String telephone, Integer userId){
		return false;
	}
}
