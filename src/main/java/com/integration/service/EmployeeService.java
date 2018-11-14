package com.integration.service;

import com.integration.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author Fredy Vazquez
 * @FechaCreacion 14/11/2018
 *
 */
public interface EmployeeService {

	public Flux<Employee> findAllEmployee();

	public Mono<Employee> findByIdEmployee(Long id);

	public Mono<Employee> createEmployee(Employee employee);

	public void delete(Employee employe);

	public Employee getById(Long id);

}
