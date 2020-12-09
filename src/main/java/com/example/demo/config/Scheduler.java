package com.example.demo.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/8 14:44
 */
//@Component
public class Scheduler {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	//每个两秒执行
	@Scheduled(fixedRate = 2000)
	public void testTasks(){
		System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
	}

	//每天3：05执行
	@Scheduled(cron = "0 05 03 ? * *")
	public void testTasks1() {
		System.out.println("定时任务执行时间：" + dateFormat.format(new Date()));
	}

}
