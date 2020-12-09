package com.example.demo.service.Impl;

import com.example.demo.dao.EmployeeRepstory;
import com.example.demo.pojo.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/8 18:47
 */
@CacheConfig(cacheNames = "emp")
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepstory employeeRepstory;

	@Override
	@Cacheable(cacheNames = {"emp"})
	public Employee findbyid(Integer id) {
		Employee byId = employeeRepstory.getOne(id);
		return byId;
	}
}
