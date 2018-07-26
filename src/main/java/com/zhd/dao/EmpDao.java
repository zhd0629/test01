package com.zhd.dao;

import java.util.List;

import com.zhd.bean.Employee;
import com.zhd.bean.Workhistory;

public interface EmpDao{
	public List<Employee> getAllEmp();
	public void addWork(Workhistory workhistory);
	
	public List<Workhistory> getAllWork(Integer eno);	

}
