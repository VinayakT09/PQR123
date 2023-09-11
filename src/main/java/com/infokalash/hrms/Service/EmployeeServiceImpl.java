package com.infokalash.hrms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infokalash.hrms.Model.Employee;
import com.infokalash.hrms.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl  implements EmployeeService{

	@Autowired
	EmployeeRepository repository;
	
	
	@Override
	public Employee create(Employee employee) {
		return repository.save(employee);
	}


	@Override
	public Employee getemp(Long empId) {
		return repository.findById(empId).orElse(null);
	}

	
	
	
	
}
