package org.ngdsx.partybuilding.web;

import java.util.List;

import javax.annotation.Resource;

import org.ngdsx.partybuilding.common.JsonData;
import org.ngdsx.partybuilding.dto.DepartmentLevelDto;
import org.ngdsx.partybuilding.param.DepartmentParam;
import org.ngdsx.partybuilding.service.DepartmentService;
import org.ngdsx.partybuilding.service.TreeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class SysDepController {
	@Resource
	private DepartmentService departmentService;
	@Resource
	private TreeService treeService;
	
	@RequestMapping("/dept.page")
	public ModelAndView page(){
		return new ModelAndView("dept");
	}
	
	@RequestMapping("/save.json")
	@ResponseBody
	public JsonData saveDepartment(DepartmentParam param) {
		departmentService.save(param);
		return JsonData.success();
	}
	@RequestMapping("/tree.json")
	@ResponseBody
	public JsonData tree(){
		List<DepartmentLevelDto> dtoList = treeService.departmentTree();
		return JsonData.success(dtoList);
	}
	@RequestMapping("/update.json")
	@ResponseBody
	public JsonData updateDepartment(DepartmentParam param) {
		departmentService.update(param);;
		return JsonData.success();
	}
}
