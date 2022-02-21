package com.exercise5;

public class Main {
	
	static Factorial f1;

	public static void main(String[] args) {
		
		f1 = (n) -> {
			if (n == 0)
				return 1;
			else {
				return n * (f1.fact(n - 1));
			}
		};
		int i = f1.fact(9);
		System.out.println(i);
	}

}