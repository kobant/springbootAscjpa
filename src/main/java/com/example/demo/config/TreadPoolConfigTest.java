package com.example.demo.config;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.aop.interceptor.SimpleAsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/7 14:59
 */
@Configuration
@EnableAsync
public class TreadPoolConfigTest implements AsyncConfigurer {

	public Executor getAsynxExcutor(){
		// TODO Auto-generated method stub
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		//核心线程池数量，方法: 返回可用处理器的Java虚拟机的数量。
		executor.setCorePoolSize(Runtime.getRuntime().availableProcessors());
		//最大线程数量
		executor.setMaxPoolSize(Runtime.getRuntime().availableProcessors()*5);
		//线程池的队列容量
		executor.setQueueCapacity(Runtime.getRuntime().availableProcessors()*2);
		//线程名称的前缀
		executor.setThreadNamePrefix("this-excutor-");
		// setRejectedExecutionHandler：当pool已经达到max size的时候，如何处理新任务
		// CallerRunsPolicy：不在新线程中执行任务，而是由调用者所在的线程来执行
		//executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		executor.initialize();
		return executor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		// TODO Auto-generated method stub
		return new SimpleAsyncUncaughtExceptionHandler();
	}
}
