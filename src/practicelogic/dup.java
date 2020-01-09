package practicelogic;

public class dup {
public static void main(String[] args) {
	String str= "upasana satapathy";
	int charCount=0;
	char[] inp=str.toCharArray();
	System.out.println(str);
	System.out.println("duplicate are");
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(inp[i]==inp[j]) {
				System.out.print(inp[j]);
				charCount++;
				break;
			}
		}
	}
}
}
