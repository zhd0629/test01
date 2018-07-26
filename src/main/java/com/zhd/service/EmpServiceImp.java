package com.zhd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhd.bean.Employee;
import com.zhd.bean.Workhistory;
import com.zhd.dao.EmpDao;

@Repository("empse")
public class EmpServiceImp implements EmpService{

	@Autowired
	private EmpDao empdao;
	
	@Override
	public List<Employee> getAllEmp() {
		List<Employee> allEmp = empdao.getAllEmp();
		return allEmp;
	}



	@Override
	public void addWork(Workhistory workhistory) {
		empdao.addWork(workhistory);
		
	}

	@Override
	public List<Workhistory> getAllWork(Integer eno) {
		List<Workhistory> allWork = empdao.getAllWork(eno);
		return allWork;
	}


}
