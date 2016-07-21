import java.util.Scanner;


public class Leap {

	
	public static void main(String[] args) {
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an year");
		number=s.nextInt();
		if(number%4==0)
		{
			System.out.println("The given year is an leap year");
		}
		else
			System.out.println("The given year is not an leap year");
		s.close();
	}

}
