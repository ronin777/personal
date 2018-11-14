package com.integration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.integration.dao.EmployeeDao;
import com.integration.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * 
 * @author Fredy Vazquez
 * @FechaCreacion 14/11/2018
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Flux<Employee> findAllEmployee() {
		return Flux.fromIterable(employeeDao.getAllEmployee());
	}

	@Override
	public Mono<Employee> findByIdEmployee(Long id) {
		return Mono.just(employeeDao.getByIdEmployee(id));
	}

	@Override
	public Mono<Employee> createEmployee(Employee employee) {
		return Mono.just(employeeDao.createEmployee(employee));
	}

	@Override
	public void delete(Employee employe) {
		employeeDao.deleteEmployee(employe);
	}

	@Override
	public Employee getById(Long id) {
		return employeeDao.getByIdEmployee(id);
	}

}
