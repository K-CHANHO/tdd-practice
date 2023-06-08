package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
	
	@Test
	public void first_fibo() {
		Fibonacci fibo = new Fibonacci();
		
		Assertions.assertEquals(0, fibo.get(1));
	}
	
	@Test
	public void second_fibo() {
		Fibonacci fibo = new Fibonacci();
		
		Assertions.assertEquals(1, fibo.get(2));
	}
	
	@Test
	public void third_fibo() {
		Fibonacci fibo = new Fibonacci();
		
		Assertions.assertEquals(1, fibo.get(3));
	}

	@Test
	public void fibo_first_to() {
		Fibonacci fibo = new Fibonacci();
		
		int[] fibo_array = {0,1,1,2,3,5,8,13,21,34};
		
		Assertions.assertArrayEquals(fibo_array, fibo.show(10));
	}
}
