package com.avercast;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.avercast.controller.MTController;

class TestMTController {

	MTController obj = new MTController();

	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSum() {
		assertEquals(25, obj.sum(10, 15));
	}
}
