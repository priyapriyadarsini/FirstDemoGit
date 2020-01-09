package practicelogic;

public class paliInt {
	public static void main(String[] args) {
		
int no=111;
int tempno=no;
int r,sum=0;
while(no>0) {
	r=no%10;
	sum=(sum*10)+r;
	no=no/10;
}
if(tempno==sum) {
	System.out.println("palindrome");
}else {
	System.out.println("not pallindrome");
}
}
}
