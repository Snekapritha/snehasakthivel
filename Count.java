import java.util.Scanner;


public class Count {

	
	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		number=s.nextInt();
		int count=0;
		while(number!=0)
		{
			int num=number%10;
			number=number/10;
			count++;
		}
		System.out.println("The number of digits is "+count);
		s.close();
	}

}
