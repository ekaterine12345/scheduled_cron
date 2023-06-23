package com.example.springbootclientapp1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableAsync
public class SpringConfig3 {


    @Scheduled(fixedDelay = 10, timeUnit = TimeUnit.SECONDS, initialDelay = 5) // dawkebis DelayfixedRate
    @Async
    public void currentTime(){
        System.out.println("my time = "+System.currentTimeMillis() / 1000);
    }
}
