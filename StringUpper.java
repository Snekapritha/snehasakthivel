import java.util.Scanner;


public class StringUpper {

	public static void main(String[] args) {
		String str="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str=s.next();
		String str1=str.toUpperCase();
		System.out.println(str1);
		s.close();
		

	}

}
