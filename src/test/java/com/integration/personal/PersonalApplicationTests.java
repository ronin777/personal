package com.integration.personal;

import java.util.HashMap;
import java.util.Map;

import org.fluttercode.datafactory.impl.DataFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import com.integration.model.Employee;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonalApplicationTests {

	String uri = "http://localhost:8101";

	@Test
	@Ignore
	public void getAllEmployees() {
		RestTemplate restTemplate = new RestTemplate();
		String resultado = restTemplate.getForObject(uri + "/listEmployee", String.class);
		System.out.println("Lista de Empleado \n\n" + resultado);
	}

	@Test
	@Ignore
	public void getOneEmployee() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "20");
		RestTemplate restTemplate = new RestTemplate();
		Employee employee = restTemplate.getForObject(uri + "/employee/{id}", Employee.class, params);
		System.out.println("Lista de Empleado \n\n" + employee.toString());
	}

	@Test
	@Ignore
	public void createEmployee() {
		Employee employee = new Employee();
		DataFactory df = new DataFactory();

		for (int i = 0; i < 100; i++) {
			employee.setEmpName(df.getName());
			employee.setEmpAlias(df.getLastName());
			employee.setEmpEmail(df.getEmailAddress());
			employee.setEmpPassword(df.getRandomText(7));
			employee.setEmpDni(df.getRandomChars(3));
		}

		RestTemplate restTemplate = new RestTemplate();
		Employee resultadoEmpleado = restTemplate.postForObject(uri + "/createEmployee", employee, Employee.class);

		System.out.println("\n\nNuevo Contacto \n\n" + resultadoEmpleado.toString() + "\n");
	}

	@Test
	@Ignore
	public void deleteEmploye() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("id", "20");
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(uri + "/employeedel/{id}", Employee.class, params);
		System.out.println("Ha Sido Completado... ");
	}

}
