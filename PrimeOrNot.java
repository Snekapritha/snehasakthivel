import java.util.Scanner;


public class PrimeOrNot {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number ");
		n=s.nextInt();
		int k=0;
		for(int i=2;i<=n/2;i++)
		{
		
			if(n%i==0){
				k=1;
			}}
			if(k==0){
				System.out.println("a prime");
			}
				
			else
			{
				
			  System.out.println("Not a Prime");
		} 
			s.close();
		}
	}
