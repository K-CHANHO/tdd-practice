import org.example.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 큐
 *
 * - 빈 배열로 생성 v
 * - 아이템 몇개를 넣어서 생성가능하도록 ( 맨 뒤에가 헤드) v
 * - 처음에 넣은 값이 처음에 나오도록 v
 * - 가장 머리의 녀석 확인, 꼬리녀석도 확인 가능하게 head, tail v
 * - 큐의 길이를 알고싶음 v
 * - 더 생각나면 추가
 */
public class QueueTest {

    @Test
   public void Queue_Init() {
        // Arrange, Act
        Queue queue = new Queue();

        // Assert
        Assertions.assertEquals(0,queue.size());
        Assertions.assertEquals(null, queue.head());
        Assertions.assertEquals(null, queue.tail());

    }

    @Test
    public void Queue_Init_With_Values() {
        // Arrange, Act
        Queue queue = new Queue(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        // Act
        Integer head_value = queue.head();

        // Assertion
        Assertions.assertEquals(3, queue.size());
        Assertions.assertEquals(3, head_value);
        Assertions.assertEquals(1, queue.tail());

    }

    @Test
    public void Queue_push_One_Value() {
        // Arrange
        Queue queue = new Queue();

        // Act
        queue.push(4);

        // Assert
        Assertions.assertEquals(4, queue.head());
        Assertions.assertEquals(4, queue.tail());
        Assertions.assertEquals(1, queue.size());
    }

    @Test
    public void Queue_push_Many_Values() {
        // Arrange
        Queue queue = new Queue();

        // Act
        queue.push(4);
        queue.push(5);
        queue.push(6);
        queue.push(7);
        queue.push(8);

        // Assert
        Assertions.assertEquals(4, queue.head());
        Assertions.assertEquals(8, queue.tail());
        Assertions.assertEquals(5, queue.size());
    }

    @Test
    public void Empty_Queue_pop_One_Value() {
        // Arrange
        Queue queue = new Queue();

        // Act
        Integer pop_value = queue.pop();

        // Assert
        Assertions.assertEquals(null, queue.head());
        Assertions.assertEquals(null, queue.tail());
        Assertions.assertEquals(0, queue.size());
        Assertions.assertEquals(null, pop_value);
    }

    @Test
    public void Filled_Queue_pop_One_Value() {
        // Arrange
        Queue queue = new Queue(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        // Act
        Integer pop_value = queue.pop();

        // Assert
        Assertions.assertEquals(2, queue.head());
        Assertions.assertEquals(1, queue.tail());
        Assertions.assertEquals(2, queue.size());
        Assertions.assertEquals(3, pop_value);
    }

    @Test
    public void Filled_Queue_pop_Many_Values() {
        // Arrange
        Queue queue = new Queue(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        // Act
        queue.pop();
        queue.pop();
        Integer pop_value = queue.pop();

        // Assert
        Assertions.assertEquals(null, queue.head());
        Assertions.assertEquals(null, queue.tail());
        Assertions.assertEquals(0, queue.size());
        Assertions.assertEquals(1, pop_value);
    }

}
