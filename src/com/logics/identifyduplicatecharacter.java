package com.logics;

public class identifyduplicatecharacter {

	public static void main(String[] args) {
		String str = "hello i m upasana";
		  int strcount = 0;
		  char[] inp = str.toCharArray();//--- converts string"hello..." into character
		  System.out.print("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     //System.out.print(inp[j]);
		     System.out.print(inp[j]);
		     strcount++;
		     break;
		    }
		   }
		  }
	}

}
 
