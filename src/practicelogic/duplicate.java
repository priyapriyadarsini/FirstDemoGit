package practicelogic;

public class duplicate {
public static void main(String[] args) {
	String name="hello i am gud hello i am fine";
	int strCount=0;
	char[] input= name.toCharArray();
	System.out.println("string name is::"+name);
	
	for(int i=0;i<name.length();i++) {
		for(int j=i+1;j<name.length();j++) {
			if (input[i]==input[j]) {				
				//System.out.println("duplicate char is ::::" +input[j]);
				System.out.print(input[j]);
				strCount++;
				break;
			}
		}
	}
}
}
