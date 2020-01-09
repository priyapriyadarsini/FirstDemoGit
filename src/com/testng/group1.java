package com.testng;

import org.testng.annotations.Test;

public class group1 {
@Test(groups="A")
public void one() {
	System.out.println("one");
}
@Test(groups="B")
public void two() {
	System.out.println("two");
}
@Test(groups="C")
public void three() {
	System.out.println("three");
}
}
