package cn.mesie.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by 2019-04-23 23:26
 *
 * @author: mesie
 */
@Service
public class KafkaConsumerService {

    @KafkaListener(topics = {"test"})
    public void consume(String message){
        System.out.println(message);
    }
}
