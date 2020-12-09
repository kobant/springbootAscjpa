package com.example.demo.Test;

import com.example.demo.config.SyncTask;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * @Description:
 * @Author: liaocongcong
 * @Date: 2020/12/9 15:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SyncTaskTest {

	@Autowired
	private SyncTask syncTask;

	@Test
	public void test() throws Exception{
		Future<String> one = syncTask.doTaskOne();
		Future<String> two = syncTask.doTaskTwo();
		Future<String> three = syncTask.doTaskThree();
		Future<String> four = syncTask.doTaskFour();
		while (true) {
			if (one.isDone() && two.isDone() && three.isDone() && four.isDone()) {
				break;
			}
		}
	}

}
