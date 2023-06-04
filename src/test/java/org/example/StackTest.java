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
    }

    @Test
    public void stack_init_with_values() {
        // Arrange, Act
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        // Assert
        Assertions.assertEquals(3, stack.size());
    }

    @Test
    public void empty_stack_head() {
        // Arrange, Act
        Stack stack = new Stack();

        // Asssert
        Assertions.assertEquals(null, stack.head());
    }

    @Test
    public void filled_stack_head() {
        // Arrange, Act
        Stack stack = new Stack(new ArrayList<Integer>(Arrays.asList(1,2,3)));

        // Asssert
        Assertions.assertEquals(3, stack.head());
    }



}