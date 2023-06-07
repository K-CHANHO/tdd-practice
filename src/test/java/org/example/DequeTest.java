package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

/**
 * 초기화
 * 
 *
 */
public class DequeTest {
	
	@Test
	@DisplayName("Deque 빈 값 초기화")
	@Order(1)
	public void deque_init() {
		Deque deque = new Deque();
		
		Assertions.assertEquals(0, deque.size());
	}
	
	
}
