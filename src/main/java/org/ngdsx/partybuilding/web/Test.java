package org.ngdsx.partybuilding.web;


import org.ngdsx.partybuilding.common.ApplicationContextHelper;
import org.ngdsx.partybuilding.common.JsonData;
import org.ngdsx.partybuilding.dao.UserRankTitleMapper;
import org.ngdsx.partybuilding.entity.UserRankTitle;
import org.ngdsx.partybuilding.util.JsonMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/test")
@Slf4j
public class Test {

	@RequestMapping("/hello.json")
	@ResponseBody
	public JsonData hello() {
		UserRankTitleMapper m = ApplicationContextHelper.popBean(UserRankTitleMapper.class);
		UserRankTitle t = m.selectByPrimaryKey(1);
		System.out.print(JsonMapper.obj2String(t));		
		return JsonData.success("good afternoon");		
	}
}
