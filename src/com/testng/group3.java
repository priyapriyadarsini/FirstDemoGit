package com.testng;

import org.testng.annotations.Test;

public class group3 {
	@Test(groups="A")
	public void seven() {
		System.out.println("7");
	}
	@Test(groups="B")
	public void eight() {
		System.out.println("8");
	}
	@Test(groups="C")
	public void nine() {
		System.out.println("9");
	}
}
