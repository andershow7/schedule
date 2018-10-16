package com.schedule;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulingTask {
	
	 private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	 private static final String zoneBR = "America/Sao_Paulo";
	 private static final String everyTenSeconds = "*/10 * * * * *";
	 private static final long oneMinute = 60000;
	 
	@Scheduled(cron = everyTenSeconds, zone = zoneBR)
	public void scheduleFutureTaskOne() {
		System.out.println("Task one scheduled to now: " + dateFormat.format(new Date()));
	}
	
	@Scheduled(fixedDelay = oneMinute, zone = zoneBR)
	public void scheduleFutureTaskTwo() {
		System.out.println("Task two scheduled to now: " + dateFormat.format(new Date()));
	}
}
