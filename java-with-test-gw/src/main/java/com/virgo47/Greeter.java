package com.virgo47;

public class Greeter {

	private final String greeting;

	public Greeter(String greeting) {
		this.greeting = greeting;
	}

	public String greet(String name) {
		return greeting.replace("{name}", name);
	}
}