import java.util.Scanner;

public class StringReverse {

	
	public static void main(String[] args) {
	   String str="",rev="";
	   Scanner s=new Scanner(System.in);
	   System.out.println("Enter the String");
	   str=s.nextLine();
	   int len=str.length();
	   for(int i=len-1;i>=0;i--)
	   {
		   rev=rev+str.charAt(i);
	   }
	   System.out.println("The reversed string is "+rev);
       s.close();
	}

}
