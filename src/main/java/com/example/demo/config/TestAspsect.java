package com.example.demo.config;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/7 11:00
 */
@Aspect
@Component
@Slf4j
public class TestAspsect {

	//com.kzj.kzj_rabbitmq.controller 包中所有的类的所有方法切面
//@Pointcut("execution(public * com.kzj.kzj_rabbitmq.controller.*.*(..))")

//只针对 MessageController 类切面
//@Pointcut("execution(public * com.kzj.kzj_rabbitmq.controller.MessageController.*(..))")

	//统一切点,对com.kzj.kzj_rabbitmq.controller及其子包中所有的类的所有方法切面
	@Pointcut("execution(public * com.example.demo.controller..*.*(..))")
	public void Pointcut() {
	}


	//@Around：环绕通知
	@Around("Pointcut()")
	public Object Around(ProceedingJoinPoint pjp) throws Throwable {
		Map<String,Object> data = new HashMap<>();
        //获取目标类名称
		String clazzName = pjp.getTarget().getClass().getName();
        //获取目标类方法名称
		String methodName = pjp.getSignature().getName();

        //记录类名称
		data.put("clazzName",clazzName);
       //记录对应方法名称
		data.put("methodName",methodName);
        //记录请求参数
		data.put("params",pjp.getArgs());
       //开始调用时间
       // 计时并调用目标函数
		long start = System.currentTimeMillis();
		Object result = pjp.proceed();
		Long time = System.currentTimeMillis() - start;

        //记录返回参数
		data.put("result",result);

        //设置消耗总时间
		data.put("consumeTime",time);
		System.out.println(JSON.toJSONString(data));
		return result;

	}
}
