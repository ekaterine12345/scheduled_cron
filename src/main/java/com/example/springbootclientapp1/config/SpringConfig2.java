package com.example.springbootclientapp1.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class SpringConfig2 {

    @Scheduled(cron = "0 52 23 23 * *", zone = "Asia/Tbilisi")
    public void currentDate(){
        System.out.println( " is' s time " + System.currentTimeMillis() / 1000);
    }

    // წამი წუთი სააათი დღე თვე  კვირის დღე
    // * *  ნებირმიერი თვე და ნებირმიერი კვირის დღ
}
