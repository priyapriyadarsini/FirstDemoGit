package com.logics;

public class IntPali {
public static void main(String[] args) {
	int no=121;
	int temp=no;
	int r,sum=0;
	while (no>0) {
		r=no%10;
		sum=(sum*10)+r;
		no=no/10;
	}
	if(temp==sum) {
		System.out.println("pali");
	}else {
		System.out.println("not pali");
	}
}
}
