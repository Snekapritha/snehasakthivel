public class PalindromeOrNot {

	
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int num1=0;
		int sum=0;
		int sum1=num;
		for(int i=0;i<sum1;i++)
		{
		 	 num1=sum1%10;
			 sum1=sum1/10;
			 sum=sum*10+num1;
		}
			if(num==sum)
		{
			System.out.println(num+ " is a palindrome");
		}
		else
			System.out.println(num +" is not a palindrome");

	}

}
