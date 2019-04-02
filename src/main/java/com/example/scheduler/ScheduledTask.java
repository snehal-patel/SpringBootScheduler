package com.example.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTask {

	Logger logger = LoggerFactory.getLogger(ScheduledTask.class);
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

//	@Scheduled(fixedDelay = 2000) // after 2 sec
//	@Scheduled(cron="0 * * * * MON-FRI") // every min 
	@Scheduled(cron="* * * ? * *") //every second
	public void reportCurrentTime() {
		logger.info("The time is now {}", dateFormat.format(new Date()));

	}

}
