package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.pojo.MessagePojo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/7 10:23
 */
@RestController
@Slf4j
public class MessageController {
	@RequestMapping(value = "/send_message",produces = "text/json;charset=UTF-8")
	public String send_message(MessagePojo pojo){
		log.info("执行了controller.send_message方法");
		return JSON.toJSONString(pojo);
	}


}
