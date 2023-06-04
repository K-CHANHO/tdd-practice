import org.example.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class QueueTest {

    @Test
   public void Queue_Init() {
        // Arrange, Act
        Queue queue = new Queue();

        // Assert
        Assertions.assertEquals(queue.size(), 0);

    }

}
