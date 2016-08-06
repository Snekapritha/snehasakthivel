import java.util.Scanner;


public class ReverseString {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.next();
	    reverseMethod(s1);
	    s.close();

	}
	public static void reverseMethod(String str){
		String str1="";
		for(int i=str.length()-1;i>=0;i--){
			str1=str1+str.charAt(i);
		}
		System.out.println(str1);
	}

}
