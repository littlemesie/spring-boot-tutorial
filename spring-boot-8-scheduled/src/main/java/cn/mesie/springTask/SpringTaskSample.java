package cn.mesie.springTask;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * Created by 2019-04-21 21:49
 * 简单的使用
 * @author: mesie
 */
@Configuration
@EnableScheduling
public class SpringTaskSample {
    /**
     * 每10秒打印一次:时间取决于运行系统时间
     */
    @Scheduled(cron = "0/10 * * * * *")
    public void task1(){
        System.out.println(getClass() + "--task1" + new Date());
    }

    /**
     * 每1分钟打印一次:时间取决于运行系统时间
     */
    @Scheduled(cron = "0 0/1 * * * *")
    public void task2(){
        System.out.println(getClass() + "--task2" + new Date());
    }
}
