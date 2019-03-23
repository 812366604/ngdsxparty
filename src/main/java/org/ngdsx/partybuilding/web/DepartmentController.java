package org.ngdsx.partybuilding.web;

import javax.annotation.Resource;

import org.ngdsx.partybuilding.common.JsonData;
import org.ngdsx.partybuilding.param.DepartmentParam;
import org.ngdsx.partybuilding.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class DepartmentController {
	@Resource
	private DepartmentService departmentService;
	
	@RequestMapping("/save.json")
	@ResponseBody
	public JsonData saveDepartment(DepartmentParam param) {
		departmentService.save(param);
		return JsonData.success();
	}
}
