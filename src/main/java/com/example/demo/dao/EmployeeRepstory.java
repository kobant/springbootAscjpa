package com.example.demo.dao;

import com.example.demo.pojo.Employee;
import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/8 18:31
 */
public interface EmployeeRepstory extends JpaRepository<Employee, Integer>, JpaSpecificationExecutor<Employee> {
}
