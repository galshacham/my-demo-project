package mine.trying.demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTests {

    QueueInterface queue;

    @Test
    public void GIVEN_emptyQueue_WHEN_enqueue_SHOULD_addToQueue() {
        queue = new Queue(List.of());
        String val = "qweqwe";
        Integer expectedSize = 1;

        boolean inserted = queue.enqueue(val);

        assertTrue(inserted);
        assertEquals(expectedSize, ((Queue) queue).queue.size());
        assertEquals(val, ((Queue) queue).queue.get(0));
    }

    @Test
    public void GIVEN_queueWithValues_WHEN_dequeue_SHOULD_addRemoveFromQueue() {
        String val = "qweqwe";
        Integer expectedSize = 0;

        queue = new Queue(List.of(val));

        String  popped = queue.dequeue();

        assertEquals(expectedSize, ((Queue) queue).queue.size());
        assertEquals(val, popped);
    }

    @Test
    public void GIVEN_queueWithValues_WHEN_getSnapshot_SHOULD_returnAllValsInside() {
        List<String> vals = List.of("aa", "bbb", "cccc");

        queue = new Queue(vals);

        assertArrayEquals(vals.toArray(),queue.getSnapshot().toArray());
    }
}
