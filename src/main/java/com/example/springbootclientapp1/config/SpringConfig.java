package com.example.springbootclientapp1.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableScheduling
//@EnableAsync
public class SpringConfig {


    @Scheduled(fixedDelay = 10, timeUnit = TimeUnit.SECONDS, initialDelay = 10) // dawkebis DelayfixedRate
  //  @Async
    public void currentTime(){
        System.out.println("time = "+System.currentTimeMillis() / 1000);
    } // 10 wamshu ertxel dabewdavs.  ro dasruldeba mashun distartos 10 wamshi   fixedDelay = 10,
    //thread.sleep
    // async   @EnableAsync   class-ს da @Async მეთოდს.

//    @Scheduled(cron = "0 15 10 15 *", zone = "Asia/Tbilisi")
//    public void currentDate(){
//        System.out.println();
//    } // 10:
}
