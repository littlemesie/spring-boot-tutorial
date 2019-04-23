package cn.mesie.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by 2019-04-23 23:26
 *
 * @author: mesie
 */
@Service
public class KafkaProducerService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void produce(String topic,String message){
        try {
            kafkaTemplate.send(topic,message);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
