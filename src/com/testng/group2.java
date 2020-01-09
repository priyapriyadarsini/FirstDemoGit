package com.testng;

import org.testng.annotations.Test;

public class group2 {
	@Test(groups="A",enabled = false)
	public void four() {
		System.out.println("4");
	}
	@Test(groups="B")
	public void five() {
		System.out.println("5");
	}
	@Test(groups="C")
	public void six() {
		System.out.println("6");
	}
}
