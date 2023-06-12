package org.example;import java.util.ArrayList;

public class Eratosthenes {

	private ArrayList<Integer> array = new ArrayList<>();


	public Eratosthenes(int i) {
		
		for(int k=2; k<=i; k++) {
			this.array.add(k);
		}
			
	}

	
	public ArrayList<Integer> getInitArray() {
		return this.array;
	}


	public ArrayList<Integer> exclude(int i) {
		
		/**
		 * ConcurrentModificationException 발생
		 * 삭제하는 과정에 index가 변경되기 때문.
		 
		for(Integer value : array) {
			if(value != i && value % i == 0) {
				array.remove(i);
			}
		}
		
		*/
		
		array.removeIf(value -> value != i && value % i == 0);
		
		
		return this.array;
	}


	public ArrayList<Integer> getPrimNumberList() {
		int init_size = this.array.size();
		
		for(int k=2; k*k<init_size; k++) {
			this.exclude(k);
		}
		
		return this.array;
	}
	

}
