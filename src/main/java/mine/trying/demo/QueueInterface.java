package mine.trying.demo;


import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface QueueInterface {
    boolean enqueue(String val);

    String dequeue();

    List<String > getSnapshot();
}
