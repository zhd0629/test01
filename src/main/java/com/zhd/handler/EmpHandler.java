package com.zhd.handler;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhd.bean.Employee;
import com.zhd.bean.Workhistory;
import com.zhd.service.EmpService;

@Controller
public class EmpHandler {

	
	@Autowired
	private EmpService empse;
	
	
	@RequestMapping("/getAllEmp")
	public String getAllEmp(Map<String, Object> map) {
		List<Employee> allEmp = empse.getAllEmp();
		map.put("allEmp", allEmp);
		return "home";
	}
	
	@RequestMapping("/addWork")
	public String addWork(Workhistory workhistory) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String format = sdf.format(date);
		workhistory.setChangeDate(format);
		empse.addWork(workhistory);
		return "redirect:getAllEmp.zhd";
	}
	
	@RequestMapping("/getEno")
	public String getEno(Map<String, Object> map,Integer eno) {
		map.put("eno", eno);
		

		return "submit";
	}
	
	
	@RequestMapping("/getAllWork")
	public String getAllWork(Map<String, Object> map,Integer eno) {
		List<Workhistory> allWork = empse.getAllWork(eno);
		map.put("allwork", allWork);
		return "work";
	}
	
	
	
	
	
	
}
