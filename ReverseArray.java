import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int array[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=s.nextInt();
		}
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);
			System.out.print(" ");
		}
		s.close();
	}

}
