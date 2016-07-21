import java.util.Scanner;


public class Natural {

	public static void main(String[] args) {
		int num;
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a number");
		 num=s.nextInt();
		 int sum=0;
		 for(int i=1;i<=num;i++)
		 {
			 sum=sum+i;
		 }
		 System.out.println("Sum is "+sum);
		 s.close();

	}

}
