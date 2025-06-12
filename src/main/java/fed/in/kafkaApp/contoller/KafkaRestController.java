package fed.in.kafkaApp.contoller;

import fed.in.kafkaApp.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaRestController {

    @Autowired
    private ProducerService producerService;
    @GetMapping("/publish")
    public String getPublishMessageByClient(@RequestParam(value = "message", required = false) String message) {
        if (message == null || message.isEmpty()) {
            return "Message parameter is missing!";
        }
        producerService.sendMessageByClient(message);
        return "Message has published";
    }
}
