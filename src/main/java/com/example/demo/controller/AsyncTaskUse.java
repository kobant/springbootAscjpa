package com.example.demo.controller;

import com.example.demo.config.TreadTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/7 15:21
 */

@RestController
public class AsyncTaskUse {

	@Autowired
	private TreadTasks TreadTasks;

	@GetMapping("/startMysync")
	public void useMySyncTask() {
		TreadTasks.startMyThreadTask();
	}
}
