package com.hazelnutprograming.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hazelnutprograming.controller.MainController;

public class MainControllerTest {

	@Test
	public void testSum() {
		MainController controller = new MainController();
		assertEquals("5 + 6 must be 11", 11, controller.sum(5, 6));
	}

}
