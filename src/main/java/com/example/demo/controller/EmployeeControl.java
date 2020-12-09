package com.example.demo.controller;

import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/8 18:51
 */
@RequestMapping("/emp")
@RestController
public class EmployeeControl {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/find/{id}")
	public Employee getEmpById(@PathVariable("id") Integer id) {
		Employee empById = employeeService.findbyid(id);
		return empById;
	}
}
