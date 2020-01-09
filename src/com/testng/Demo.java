package com.testng;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Demo {
@BeforeMethod
public void beforeMethod() {
	System.out.println("this is before method");
}
@AfterMethod
public void afterMethod() {
	System.out.println("this is after method");
}
@BeforeTest
public void beforeTest() {
	System.out.println("this is before test========2============");
}
@AfterTest
public void afterTest() {
	System.out.println("this is after test============11===========");
}
@BeforeClass
public void beforeClass() {
	System.out.println("this is before class-------------3----------");
}
@Test
public void test() {
	System.out.println("this is test case ");
}
@AfterClass
public void afterClass() {
	System.out.println("this is after class----------10---------");
}
@BeforeSuite
public void beforeSuite() {
	System.out.println("this is before suite----------1---------");
}
@AfterSuite
public void afterSuite() {
	System.out.println("this is after suite-------12-----------");
}

@Test
public void test_1() {
	System.out.println("this is test case 1");
}

}
