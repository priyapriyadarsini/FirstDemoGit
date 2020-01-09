package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel2 {
	@Test(priority=2)
	public void tc_3() {
		System.setProperty("webdriver.gecko.driver","E:\\2020\\Driver\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
System.out.println("this ia test2");
	}
	@Test(priority=1)
	public void tc_4() {
		System.out.println("******************");
	}
	
}
