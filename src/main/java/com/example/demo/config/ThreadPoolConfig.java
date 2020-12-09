package com.example.demo.config;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/9 15:45
 */
@Configuration
public class ThreadPoolConfig {
	@Bean
	public TaskExecutor taskExecutor(){
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(3);
		executor.setKeepAliveSeconds(60);
		executor.setQueueCapacity(4);
		executor.setThreadNamePrefix("async-thread");
		return executor;
	}
}
