package com.rriverdev.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rriverdev.dto.Employee;

@Service
public class EmployeeService {

	
	public List<Employee> consultaListaCompleta(){
		List<Employee>lst =  new ArrayList<>();
		lst.add(new Employee(0,"rick", "valenz", "valencia", "mexico","2021-05-14",new Date()));
		lst.add(new Employee(0,"kcir", "znelav", "aicnelav", "ocixem","2021-05-14", new Date(1952, 12, 25, 17, 18, 46)));
		return lst;
		
	}
	public List<Employee> consultaListaBasica(){
		List<Employee>lst =  new ArrayList<>();
		lst.add(new Employee(0,"kcir", "znelav", "aicnelav", "ocixem","2021-05-14", new Date(1952, 12, 25, 17, 18, 46)));
		return lst;
		
	}	
}
