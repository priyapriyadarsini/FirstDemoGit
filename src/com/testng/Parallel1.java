package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Parallel1 {
@Test
public void tc_1() {
	System.setProperty("webdriver.chrome.driver","E:\\2020\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com");
	System.out.println("this is test 1 ");
}
@BeforeTest
public void beforeTest() {
	System.out.println("this is before test");
}
@Test(priority=1)
public void tc_2() {
	System.out.println("this is  testcase2");
}
}
