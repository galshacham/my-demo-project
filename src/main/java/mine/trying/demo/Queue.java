package mine.trying.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Queue implements QueueInterface {
    public LinkedList<String> queue = new LinkedList<>();

    public Queue(List<String> vals) {
        queue.addAll(vals);
    }

    @Override
    public boolean enqueue(String val) {
        queue.add(val);
        return true;
    }

    @Override
    public String dequeue() {
        return queue.pop();
    }

    @Override
    public List<String> getSnapshot() {
        return queue.stream().toList();
    }
}
