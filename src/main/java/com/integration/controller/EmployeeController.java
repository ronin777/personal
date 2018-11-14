package com.integration.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.integration.model.Employee;
import com.integration.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author Fredy Vazquez
 * @FechaCreacion 14/11/2018
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/listEmployee")
	public Flux<Employee> allEmployee() {
		return employeeService.findAllEmployee();
	}

	@GetMapping(value = "/employee/{id}")
	public Mono<Employee> getEmployeeById(@PathVariable(value = "id") Long id) {
		return employeeService.findByIdEmployee(id);
	}

	@PostMapping(value = "createEmployee")
	public Mono<Employee> createEmploye(@Valid @RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@DeleteMapping(value = "/employeedel/{id}")
	public Mono<ResponseEntity<String>> deleteEmployee(@PathVariable(value = "id") String id) {
		Employee employee = employeeService.getById(new Long(id));
		employeeService.delete(employee);
		return Mono.just(new ResponseEntity<>("Elimicación Completa", HttpStatus.ACCEPTED));
	}

}
