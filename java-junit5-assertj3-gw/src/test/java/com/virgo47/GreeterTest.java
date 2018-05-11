package com.virgo47;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class GreeterTest {

	@Test
	public void namePlaceholderIsProperlyReplaced() {
		Greeter greeter = new Greeter("Ahoj, {name}!");

		assertThat(greeter.greet("Virgo")).isEqualTo("Ahoj, Virgo!");
		assertThat(greeter.greet("")).isEqualTo("Ahoj, !");
	}

	@Test
	public void patternWithoutNamePlaceholderIgnoresNameParameter() {
		Greeter greeter = new Greeter("Ahoj!");

		assertThat(greeter.greet("Virgo")).isEqualTo("Ahoj!");
		assertThat(greeter.greet("someone else")).isEqualTo("Ahoj!");
	}
}
