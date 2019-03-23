package org.ngdsx.partybuilding.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.ngdsx.partybuilding.BaseTest;
import org.ngdsx.partybuilding.entity.SysDepartment;
import org.ngdsx.partybuilding.entity.SysUser;
import org.ngdsx.partybuilding.entity.SysUserRankTitle;
import org.springframework.beans.factory.annotation.Autowired;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoTest extends BaseTest{

	@Autowired
	private UserMapper userDao;
	
	@Test
	public void testinsertUser() throws Exception{
		SysUser user = new SysUser();
		SysUserRankTitle userRankTitle = new SysUserRankTitle();
		userRankTitle.setUserRankTitleId(1);
		userRankTitle.setUserRankTitleLevel(0);
		userRankTitle.setUserRankTitleName("中级");
		userRankTitle.setUserRankTitleParentId(1);
		SysDepartment department = new SysDepartment();
		department.setDepartmentId(1);
		user.setUserName("张三");
		user.setUserPwd("111111");
		user.setUserSex("男");
		user.setUserImg("");
		user.setUserEducation(0);
		user.setUserDegree(0);
		user.setCreatePartyTime(new Date());
		user.setUserNativePlace("山西太原");
		user.setUserAddress("山西省太原市");
		user.setUserCompany("山西公司 ");
		user.setUserPost("030000");
		user.setUserPhone("13003510000");
		user.setUserEmail("0351@qq.com");
		user.setUserResume("个人简历");
		user.setUserLoginIp("192.168.1.1");
		user.setUserNpc("是");
		user.setUserCheck("是");		
		int result = userDao.insert(user);
		assertEquals(1,result);
	}
}
