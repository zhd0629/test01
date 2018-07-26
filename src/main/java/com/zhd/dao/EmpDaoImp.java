package com.zhd.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zhd.bean.Employee;
import com.zhd.bean.Workhistory;
import com.zhd.mapper.EmpMapper;


@Repository("empdao")
public class EmpDaoImp implements EmpDao{

	@Autowired
	private EmpMapper mapper;
	
	@Override
	public List<Employee> getAllEmp() {
		List<Employee> allEmp = mapper.getAllEmp();
		return allEmp;
	}

	@Override
	public void addWork(Workhistory workhistory) {
		mapper.addWork(workhistory);
		
	}

	@Override
	public List<Workhistory> getAllWork(Integer eno) {
		List<Workhistory> allWork = mapper.getAllWork(eno);
		return allWork;
	}


}
