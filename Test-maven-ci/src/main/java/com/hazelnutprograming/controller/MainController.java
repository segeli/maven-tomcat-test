package com.hazelnutprograming.controller;

public class MainController {

	public int sum(int x, int y) {
		// the following is just an example
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x + y;
	}

}
