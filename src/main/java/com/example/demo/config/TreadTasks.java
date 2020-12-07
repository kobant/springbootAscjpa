package com.example.demo.config;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/7 15:19
 */
@Component
public class TreadTasks {

	@Async
	public void startMyThreadTask(){
		System.out.println("this is my async task");
	}
}
