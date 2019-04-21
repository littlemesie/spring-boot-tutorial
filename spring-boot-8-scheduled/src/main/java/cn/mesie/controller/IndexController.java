package cn.mesie.controller;

import cn.mesie.springTask.SpringTaskRunnable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ScheduledFuture;

/**
 * Created by 2019-04-21 22:05
 * 动态添加定时任务
 * @author: mesie
 */
@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ThreadPoolTaskScheduler taskScheduler;

    private ScheduledFuture<?> future;

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler(){
        return new ThreadPoolTaskScheduler();
    }

    SpringTaskRunnable springTaskRunnable = new SpringTaskRunnable();

    @GetMapping("/start")
    public String start(){
        future = threadPoolTaskScheduler().schedule(springTaskRunnable, new CronTrigger("*/1 * * * * * "));
        return "";
    }

}
