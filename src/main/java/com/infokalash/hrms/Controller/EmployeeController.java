package com.infokalash.hrms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infokalash.hrms.Model.Employee;
import com.infokalash.hrms.Service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@PostMapping("/create")
	    public ResponseEntity<Employee> insert(@RequestBody Employee employe){
		Employee empl = service.create(employe);
		return new ResponseEntity<> (empl , HttpStatus.CREATED);
	
	
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<Employee> getemp(@PathVariable Long empId){
	Employee empl = service.getemp(empId);
	return new ResponseEntity<> (empl , HttpStatus.OK);
		
	}
}
