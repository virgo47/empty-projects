package com.virgo47;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GreeterTest {

	@Test
	public void patternWithoutNamePlaceholder() {
		Greeter greeter = new Greeter("Ahoj, {name}!");

		Assertions.assertEquals("Ahoj, Virgo!", greeter.greet("Virgo"));
	}
}
