package cn.mesie.task;

import cn.mesie.kafka.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 2019-04-23 23:26
 *
 * @author: mesie
 */
@Service
@Configuration
@EnableScheduling
public class KafkaTaskService {

    @Autowired
    KafkaProducerService service;

    private final static String TOPIC = "test";

    @Scheduled(fixedDelay = 1000)
    public void testKafka() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        String date = sdf.format(new Date());
        String obj = "当前测试消息时间是：\t" + date;
        service.produce(TOPIC, obj);
    }
}
