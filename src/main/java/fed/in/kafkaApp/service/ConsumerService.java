package fed.in.kafkaApp.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @KafkaListener(topics = "${app.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public  void consumer(String message){
        System.out.println("received message :"+message);
    }
}
