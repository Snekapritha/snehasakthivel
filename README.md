import java.util.Scanner;


public class AdditionOfOdd {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int sum=0;
		if(num%2==1){
			for(int i=1;i<=num;i=i+2){
				sum+=i;
			}
		}
		System.out.println(sum);
		s.close();
	}

}
