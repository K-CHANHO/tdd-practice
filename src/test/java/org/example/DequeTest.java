package org.example;

import java.util.ArrayList;
import java.util.Arrays;

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
	@DisplayName("Deque 빈 값 초기화, 머리, 꼬리 조회")
	@Order(1)
	public void deque_init() {
		Deque deque = new Deque();
		
		Assertions.assertEquals(0, deque.size());
		Assertions.assertEquals(null, deque.head());
		Assertions.assertEquals(null, deque.tail());
	}
	
	@Test
	@DisplayName("Deque 값 초기화, 머리, 꼬리 조회")
	@Order(2)
	public void deque_init_with_param() {
		Deque deque = new Deque(new ArrayList<Integer>(Arrays.asList(1,2,3)));
		
		Assertions.assertEquals(3, deque.size());
		Assertions.assertEquals(3, deque.head());
		Assertions.assertEquals(1, deque.tail());
	}
	
	@Test
	@DisplayName("Deque push 하나")
	@Order(3)
	public void deque_push_one_value() {
		Deque deque = new Deque();
		
		deque.push(5);
		
		Assertions.assertEquals(1, deque.size());
		Assertions.assertEquals(5, deque.head());
		Assertions.assertEquals(5, deque.tail());
	}
	
	@Test
	@DisplayName("Deque push 여러개")
	@Order(4)
	public void deque_push_multi_values() {
		Deque deque = new Deque();
		
		deque.push(5);
		deque.push(1);
		deque.push(3);
		deque.push(2);
		deque.push(4);
		
		Assertions.assertEquals(5, deque.size());
		Assertions.assertEquals(4, deque.head());
		Assertions.assertEquals(5, deque.tail());
	}
	
	@Test
	@DisplayName("빈 Deque pop")
	@Order(5)
	public void empty_deque_pop() {
		Deque deque = new Deque();
		
		Integer pop_value = deque.pop();
		
		Assertions.assertEquals(0, deque.size());
		Assertions.assertEquals(null, pop_value);
	}
	
	@Test
	@DisplayName("Deque pop one time")
	@Order(6)
	public void filled_deque_pop_one() {
		Deque deque = new Deque(new ArrayList<Integer>(Arrays.asList(3,5,7,9,11)));
		
		Integer pop_value = deque.pop();
		
		Assertions.assertEquals(4, deque.size());
		Assertions.assertEquals(11, pop_value);
	}
	
	@Test
	@DisplayName("Deque pop multi time")
	@Order(7)
	public void filled_deque_pop_multi() {
		Deque deque = new Deque(new ArrayList<Integer>(Arrays.asList(3,5,7,9,11)));
		
		deque.pop();
		deque.pop();
		Integer pop_value = deque.pop();
		
		Assertions.assertEquals(2, deque.size());
		Assertions.assertEquals(7, pop_value);
	}
	
}
