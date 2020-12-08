package com.example.demo.config;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.User;
import com.example.demo.dao.UserRepstory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/8 15:23
 */
@Component
public class timerPullAllData {

	@Autowired
	private UserRepstory userRepstory;

	@Scheduled(fixedRate = 7000)
	public void test(){
		List<User> all = userRepstory.findAll();
		System.out.println(JSON.toJSONString(all));
	}
}