import java.util.Scanner;


public class AddFirstLast {

	public static void main(String[] args) {
	 int num;
	 Scanner s=new Scanner(System.in);
	 num=s.nextInt();
	 int first=num%10;
	 while(num>10){
		 num=num/10;
		 
	 }
	 int total=num+first;
	 System.out.println(total);
	 s.close();

	}

}
