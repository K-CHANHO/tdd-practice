package org.example;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EratosthenesTest {
	
	static Eratosthenes eratos = new Eratosthenes(10);
	
	@Test
	@Order(1)
	public void init_array() {
		
		Assertions.assertEquals(new ArrayList<Integer>(Arrays.asList(2,3,4,5,6,7,8,9,10)), eratos.getInitArray());
	}
	
	@Test
	@Order(2)
	public void exclude_two() {
		
		Assertions.assertEquals(new ArrayList<Integer>(Arrays.asList(2,3,5,7,9)), eratos.exclude(2));
	}
	
	@Test
	@Order(3)
	public void exclude_three() {
		
		Assertions.assertEquals(new ArrayList<Integer>(Arrays.asList(2,3,5,7)), eratos.exclude(3));
	}
	
	@Test
	@Order(4)
	public void exclue_all() {
		Eratosthenes eratos_second = new Eratosthenes(20);
		
		Assertions.assertEquals(
				new ArrayList<Integer>(Arrays.asList(2,3,5,7,11,13,17,19)),
				eratos_second.getPrimNumberList());
	}
	
	@Test
	@Order(5)
	public void show_prime_number() {
		Eratosthenes eratos_hundred = new Eratosthenes(100);
		
		ArrayList<Integer> test_showing = eratos_hundred.getPrimNumberList();
		test_showing.forEach(value -> System.out.print(value + " / "));
	}

}
