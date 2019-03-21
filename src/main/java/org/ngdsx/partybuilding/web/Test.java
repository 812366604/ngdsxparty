package org.ngdsx.partybuilding.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")

public class Test {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "good afternoon" + new Date();
	}
}
