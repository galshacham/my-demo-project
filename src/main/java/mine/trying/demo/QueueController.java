package mine.trying.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class QueueController {
    QueueManager queueManager = new QueueManager();


    @PostMapping("/enqueue")
    public boolean enqueue(@RequestParam String queueName, @RequestParam String val) {
        return queueManager.enqueue(queueName, val);
    }

    @GetMapping("/dequeue")
    public String dequeue(@RequestParam String queueName) throws NoQueueException {
        return queueManager.dequeue(queueName);
    }

    @GetMapping("/getSnapshot")
    public List<String> getSnapshot(@RequestParam String queueName) throws NoQueueException {
        return queueManager.getSnapshot(queueName);
    }
}

