package practicelogic;

public class Armstrong { // this is armstrong
public static void main(String[] args) {
		int no=153;
	int tempno=no;
	int r,sum=0;
	while(no>0) {
		r=no%10;
		no=no/10;
		sum=sum+r*r*r;
	}
		if(tempno==sum) {
			System.out.println("armstrong");
		}else {
			System.out.println("not armstrong");
		}
	}
}

