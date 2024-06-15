package com.example.EmployeeProject;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private Map<Integer, Employee> employeeRepository = new HashMap<>();
	private int currentId = 1;
	
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		employee.setEmpid(currentId++);
		employeeRepository.put(employee.getEmpid(), employee);
		return employee;
	}
	
	@GetMapping
	public Map<Integer, Employee> getAllEmployees(){
		return employeeRepository;
	}
	
	@GetMapping("/{empid}")
	public Employee getEmployeeById(@PathVariable int empid) {
		return employeeRepository.get(empid);
	}
	
	@PutMapping("/{empid}")
	public Employee updateEmployeeById(@PathVariable int empid, @RequestBody Employee employee) {
		employee.setEmpid(empid);
		employeeRepository.put(empid, employee);
		return employee;
	}
	
	@DeleteMapping("/{empid}")
	public void deleteEmployeeById(@PathVariable int empid) {
		employeeRepository.remove(empid);
	}
}
