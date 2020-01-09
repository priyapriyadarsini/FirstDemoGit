package com.logics;

import java.util.Scanner;

public class StrPall {
public static void main(String[] args) {
	String rev="";
	Scanner sc = new Scanner(System.in);
	System.out.println("enter");
	String orig= sc.nextLine();
		for(int i= orig.length()-1;i>=0;i-- ) {
			rev=rev+orig.charAt(i);
		}
		if(orig.equals(rev)) {
			System.out.println("palli");
		}else {
			System.out.println("not pallin....please try again");
		}
}
}
