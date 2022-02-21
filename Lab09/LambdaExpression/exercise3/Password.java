package com.exercise3;

public class Password {

	public static void main(String[] args) {

		String name = "SanketDhanokar";
		String pass = "sankyy@05";
		CheckPassword p = ((username, password) -> {
			
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		
		System.out.println(p.checkIdentity("SanketDhanokar", "sankyy@05"));
	}
}
