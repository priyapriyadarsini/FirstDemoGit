package com.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class data_provide {
  @Test(dataProvider = "dp")
  public void f(Integer n, String names) {
	  System.out.println("data is"+names);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
