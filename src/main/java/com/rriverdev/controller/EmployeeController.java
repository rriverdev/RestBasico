package com.rriverdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rriverdev.dto.Employee;
import com.rriverdev.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	
	@Autowired
	public EmployeeService employServ;
	
	@RequestMapping("/getAll")
	public List<Employee> getEmployees(){		

		employServ.consultaListaCompleta().forEach(x -> System.out.println(x.toString()));
		return employServ.consultaListaCompleta();
	}
	
	@RequestMapping("/getOne")
	public List<Employee> getEmployee(){		
		/*Lambda Expression*/
		employServ.consultaListaBasica().forEach(x -> System.out.println(x.toString()));
		
		System.out.println(employServ.toString());
		return employServ.consultaListaBasica();
	}

}
