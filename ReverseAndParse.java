import java.util.Scanner;


public class ReverseAndParse {

	
	public static void main(String[] args) {
		String str="";
		Scanner s=new Scanner(System.in);
		str=s.next();
		char[] rev=new char[str.length()];
		for(int i=0;i<str.length();i++){
			rev[i]=str.charAt(i);
		}
		
		for(int i=0;i<rev.length;i++){
			System.out.print(rev[i]+"-");
		
		}
		
		s.close();
	}

}
