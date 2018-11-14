package com.integration.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.integration.model.Employee;

/**
 * 
 * @author Fredy Vazquez
 * @FechaCreacion 14/11/2018
 *
 */
@Repository
public interface EmployeeDao {

	public List<Employee> getAllEmployee();

	public Employee createEmployee(Employee employee);

	public void deleteEmployee(Employee employee);

	public Employee getByIdEmployee(Long id);
}
