package com.infokalash.hrms.Service;

import org.springframework.stereotype.Service;

import com.infokalash.hrms.Model.Employee;

@Service
public interface EmployeeService {

	public Employee create(Employee employee);
	
	Employee getemp(Long empId);
	
}
