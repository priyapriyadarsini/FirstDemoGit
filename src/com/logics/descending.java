package com.logics;

public class descending {
public static void main(String[] args) {
	int[]a= {2,8,5,6,4,1};
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("order is "+a[i]);
	}
}
}
