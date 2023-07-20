package mine.trying.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class QueueControllerTests {

    @Inject
    QueueController queue;

    @Test
    public void GIVEN_emptyQueue_WHEN_enqueue_SHOULD_addToQueue() {
        String val = "qweqwe";
        String queueName = "one";

        boolean inserted = queue.enqueue(queueName, val);

        assertTrue(inserted);
        assertTrue(inserted);
    }

    @Test
    public void GIVEN_queueWithValues_WHEN_dequeue_SHOULD_addRemoveFromQueue() {
        String val = "qweqwe";

        boolean inserted = queue.enqueue(val);

        assertTrue(inserted);

    }
}
