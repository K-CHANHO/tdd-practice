package org.example;

public class Fibonacci {

	public int get(int i) {
		if(i ==1) return 0;
		else if(i==2) return 1;
		
		return get(i-1) + get(i-2);
	}

	public int[] show(int i) {
		
		int[] fibo_array = new int[i];
		
		for(int k=0; k<i; k++) {
			fibo_array[k] = this.get(k+1);
		}
		
		return fibo_array;
	}  

}
