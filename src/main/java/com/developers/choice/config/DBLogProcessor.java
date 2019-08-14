package com.developers.choice.config;

import org.springframework.batch.item.ItemProcessor;

import com.developers.choice.model.Employee;

public class DBLogProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee employee) throws Exception {
		System.out.println("Inserting employees : "+employee);
		return employee;
	}

	
}
