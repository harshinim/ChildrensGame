package com.irexchange.interview;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChildrensGameTest {

	@Test
	void test() {
		assertEquals(2,ChildrensGame.play(7, 4));
	}

}
