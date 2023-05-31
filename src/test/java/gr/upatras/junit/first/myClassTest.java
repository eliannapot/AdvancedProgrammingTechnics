package gr.upatras.junit.first;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MyClassTest {
	@Test
	void testSubstrack() {
		myClass tester = new myClass();
		assertEquals("POSITIVE", tester.substrack(312, 112), "312 - 112 must be POSITIVE");
	}
}

