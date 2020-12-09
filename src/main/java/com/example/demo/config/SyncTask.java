package com.example.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/9 15:07
 */
@Component
@Slf4j
public class SyncTask {
	public static Random random =new Random();

	@Async
	public Future<String> doTaskOne() throws Exception{
       String threadName = Thread.currentThread().getName();
       log.info("{}开始做任务一",threadName);
       long start = System.currentTimeMillis();
       Thread.sleep(random.nextInt(1000));
       long end  = System.currentTimeMillis();
       log.info("{}完成任务一，耗时：{}毫秒",threadName,(end - start));
       return new AsyncResult<>("one done");
	}

	@Async
	public Future<String> doTaskTwo() throws Exception {
		String threadName = Thread.currentThread().getName();
		log.info("{}开始做任务二",threadName);
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		log.info("{}完成任务二，耗时：{}毫秒",threadName,(end - start));
		return new AsyncResult<>("one done");
	}

	@Async
	public Future<String> doTaskThree() throws Exception {
		String threadName = Thread.currentThread().getName();
		log.info("{}开始做任务三",threadName);
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		log.info("{}完成任务三，耗时：{}毫秒",threadName,(end - start));
		return new AsyncResult<>("one done");
	}

	@Async
	public Future<String> doTaskFour() throws Exception {
		String threadName = Thread.currentThread().getName();
		log.info("{}开始做任务四",threadName);
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end = System.currentTimeMillis();
		log.info("{}完成任务四，耗时：{}毫秒",threadName,(end - start));
		return new AsyncResult<>("one done");
	}
}
