package practicelogic;

import java.util.Scanner;

public  final class paliStr {
	public static void main(String[] args) {
		String rev="";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter name");
			String orig=sc.nextLine();
		for(int i=orig.length()-1;i>=0;i--) {
			rev=rev+orig.charAt(i);
		}
			if(orig.equals(rev)) {
			System.out.println("palin");
		}else {
			System.out.println("not pali");
		}
		
	}
	}


