package org.example;

import java.util.ArrayList;
import java.util.List;

public class Deque {
	
	ArrayList<Integer> deque = new ArrayList<>();

	public Deque(List<Integer> init_values) {
		for(Integer value : init_values) {
			deque.add(value);
		}
	}

	public Deque() {}

	public Integer size() {
		return deque.size();
	}

	public Integer head() {
		if(deque.size() == 0) return null;
		
		return deque.get(deque.size() - 1);
	}

	public Integer tail() {
		if(deque.size() == 0) return null;
		
		return deque.get(0);
	}
	
	
}
