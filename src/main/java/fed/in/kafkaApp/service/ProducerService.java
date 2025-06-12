package fed.in.kafkaApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    @Value("${app.kafka.topic.name}")
private String topicName;

    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;

    public void  sendMessageByClient(String message){
    kafkaTemplate.send(topicName, message);
        System.out.println("Sent Message"+message);
    }
}
