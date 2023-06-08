package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(value = OrderAnnotation.class)
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
	
	@Test
	@DisplayName("Deque shift 하나")
	@Order(8)
	public void deque_shift_one_value() {
		Deque deque = new Deque();
		
		deque.shift(3);
		
		Assertions.assertEquals(1, deque.size());
		Assertions.assertEquals(3, deque.tail());
	}
	
	@Test
	@DisplayName("Deque shift 여러개")
	@Order(9)
	public void deque_shift_multi_values() {
		Deque deque = new Deque();
		
		deque.shift(2);
		deque.shift(4);
		deque.shift(6);
		deque.shift(8);
		deque.shift(10);
		
		Assertions.assertEquals(5, deque.size());
		Assertions.assertEquals(2, deque.head());
		Assertions.assertEquals(10, deque.tail());
	}
	
	@Test
	@DisplayName("빈 Deque unshift")
	@Order(10)
	public void empty_deque_unshift() {
		Deque deque = new Deque();
		
		Integer unshift_value = deque.unshift();
		
		Assertions.assertEquals(0, deque.size());
		Assertions.assertEquals(null, unshift_value);
		
	}
	
	@Test
	@DisplayName("Deque unshift 한개")
	@Order(11)
	public void filled_deque_unshift_one() {
		Deque deque = new Deque(new ArrayList<Integer>(Arrays.asList(2,4,6,8,10)));
		
		Integer unshift_value = deque.unshift();
		
		Assertions.assertEquals(4, deque.size());
		Assertions.assertEquals(10, deque.head());
		Assertions.assertEquals(4, deque.tail());
		Assertions.assertEquals(2, unshift_value);
		
	}
	
	@Test
	@DisplayName("Deque unshift 여러개")
	@Order(12)
	public void filled_deque_unshift_multi() {
		Deque deque = new Deque(new ArrayList<Integer>(Arrays.asList(2,4,6,8,10)));
		
		deque.unshift();
		deque.unshift();
		deque.unshift();
		Integer unshift_value = deque.unshift();
		
		Assertions.assertEquals(1, deque.size());
		Assertions.assertEquals(10, deque.head());
		Assertions.assertEquals(10, deque.tail());
		Assertions.assertEquals(8, unshift_value);
		
	}
}
