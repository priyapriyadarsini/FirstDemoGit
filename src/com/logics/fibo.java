package com.logics;

public class fibo {
public static void main(String[] args) {
	int num=10, num1=0, num2=1;
	for(int i=0;i<num;i++) {
		System.out.println("fibo series are:::"+num1);
		int sumoftwo=num1+num2;
		num1=num2;
		num2=sumoftwo;
	 
	}
	
}
}
