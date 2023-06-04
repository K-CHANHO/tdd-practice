package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

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

}