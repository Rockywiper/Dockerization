package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.employee.model.Employee;

@Service
public class EmployeeService{
	
	List<Employee> list=new ArrayList();
	
	Employee emp1=new Employee(1,"prasanth",20,"developer");
	Employee emp2=new Employee(2,"sriram",21,"tester");
	
	
	public List<Employee> findAll() {
		list.add(emp1);
		list.add(emp2);
		
		return list;
	}

	public Employee findById(Long id) 
	{
		Employee emp=list.stream().filter(e->e.getId()==(id)).findAny().orElse(null);
		return emp;
	}

	public Employee save(Employee emp) 
	{
		System.out.println("at service");
		list.add(emp);
		return emp;
	}

}
