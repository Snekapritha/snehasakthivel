import java.util.Scanner;
public class Largest1 {

	
	 
	
	   public static void main(String args[])
	   {
	      int a, b, c;
	      System.out.println("Enter three integers ");
	      Scanner s = new Scanner(System.in);
	 
	      a= s.nextInt();
	      b= s.nextInt();
	      c= s.nextInt();
	 
	      if ( a >b && a > c ){
	         System.out.println("First number is largest.");
	      }
	      else if ( b> a && b > c )
	      {
	         System.out.println("Second number is largest.");
	      }
	      else
	         System.out.println("Third number is largest.");
	     
	      s.close();
	   }
	}
