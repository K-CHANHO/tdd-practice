package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * 요구사항
 * 초기화(빈 배열, 초기값 설정 가능하게) v
 * 사이즈 조회 v
 * First In, Last Out (pop, push)
 * head 정보 조회
 */

class StackTest {

    @Test
    public void stack_init() {
        // Arrange, Act
        Stack stack = new Stack();

        // Assert
        Assertions.assertEquals(0, stack.size());
        Assertions.assertEquals(null, stack.head());

    }

    @Test
    public void stack_init_with_values() {
        // Arrange, Act
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(5,6,7)));

        // Assert
        Assertions.assertEquals(3, stack.size());
        Assertions.assertEquals(7, stack.head());

    }

    @Test
    public void stack_push_one_value() {
        // Arrange
        Stack stack = new Stack();

        // Act
        stack.push(3);

        // Assertion
        Assertions.assertEquals(3, stack.head());
        Assertions.assertEquals(1, stack.size());
    }

    @Test
    public void stack_push_many_values() {
        // Arrange
        Stack stack = new Stack();

        // Act
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // Assertion
        Assertions.assertEquals(6, stack.head());
        Assertions.assertEquals(4, stack.size());
    }

    @Test
    public void empty_stack_pop() {
        // Arrange
        Stack stack = new Stack();

        // Act
        Integer pop_value = stack.pop();

        // Assert
        Assertions.assertEquals(null, pop_value);

    }

    @Test
    public void filled_stack_pop() {
        // Arrange
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(5,6,7)));

        // Act
        Integer pop_value = stack.pop();

        // Assert
        Assertions.assertEquals(7, pop_value);

    }

    @Test
    public void stack_pop_one_value() {
        // Arrange
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(5,6,7)));

        // Act
        Integer pop_value = stack.pop();

        // Assert
        Assertions.assertEquals(7, pop_value);
        Assertions.assertEquals(2, stack.size());

    }

    @Test
    public void stack_pop_many_value() {
        // Arrange
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(5,6,7)));

        // Act
        stack.pop();
        stack.pop();
        Integer pop_value = stack.pop();

        // Assert
        Assertions.assertEquals(5, pop_value);
        Assertions.assertEquals(0, stack.size());

    }

    @Test
    public void stack_pop_more_than_size() {
        // Arrange
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(5,6,7)));

        // Act
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        Integer pop_value = stack.pop();

        // Assert
        Assertions.assertEquals(null, pop_value);
        Assertions.assertEquals(0, stack.size());

    }



}