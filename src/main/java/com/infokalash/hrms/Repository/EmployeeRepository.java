package com.infokalash.hrms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infokalash.hrms.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository <Employee , Long> {

	public Employee save(Employee employee);

	
	
}
