package com.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TaskApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
		
		SchedulingTask scheduling = new SchedulingTask();
		scheduling.scheduleFutureTaskOne();
		scheduling.scheduleFutureTaskTwo();
	}
}
