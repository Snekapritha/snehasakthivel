import java.util.Scanner;

public class EvenOrOdd {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number ");
		int a=s.nextInt();
		if(a%2==0){
			System.out.println("It is even");
		}
		else
		{
			System.out.println("It is odd");
		}
		s.close();
	}

}
