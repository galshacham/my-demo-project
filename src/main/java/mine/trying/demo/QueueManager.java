package mine.trying.demo;

import jdk.jfr.Name;
import org.springframework.context.annotation.Bean;

import javax.inject.Named;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.List;

@Named
public class QueueManager {
    HashMap<String, QueueInterface> queues = new HashMap<>();
    public boolean enqueue(String queueName, String val) {
        if(queues.get(queueName) != null) {
            return queues.get(queueName).enqueue(val);
        } else {
            queues.put(queueName, new Queue(List.of(val)));
            return true;
        }
    }

    public String dequeue(String queueName) throws NoQueueException {
        if(queues.get(queueName) != null) {
            return queues.get(queueName).dequeue();
        } else {
            throw new NoQueueException();
        }
    }

    public List<String> getSnapshot(String queueName) throws NoQueueException {
        if(queues.get(queueName) != null) {
            return queues.get(queueName).getSnapshot();
        } else {
            throw new NoQueueException();
        }
    }
}
