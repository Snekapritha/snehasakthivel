import java.util.Scanner;


public class Swapping {

	
	public static void main(String[] args) {
		int a,b;
		Scanner s=new  Scanner(System.in);
		System.out.println("Enter the value of a and b ");
		a=s.nextInt();
		b=s.nextInt();
		int temp;
		temp=a;
		a=b;b=temp;
		System.out.println("After Swapping ");
		System.out.println("The value of a and b is "+a+" " +b);
		s.close();
	}

}
