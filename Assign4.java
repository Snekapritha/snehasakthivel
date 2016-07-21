import java.util.Scanner;


public class Assign4 {

	
	private static Scanner s;

	public static void main(String[] args) {
		int fact=1;
		int n;
		System.out.println("Enter the number to calculate its factorial ");
		s = new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+n+ " is "+fact);
		
	}

}
