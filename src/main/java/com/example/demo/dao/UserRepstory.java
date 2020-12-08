package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/8 15:24
 */
public interface UserRepstory extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {


}
