

import java.util.Scanner;

public class ArrayIndex {

	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array ");
		int num=s.nextInt();
	    int[] a=new int[10];
	    System.out.println("Enter the elements in an array");
	    for(int i=0;i<num;i++)
	    {
	    	a[i]=s.nextInt();
	    	}
	    System.out.println("Enter the  index of array you want to access");
        int index=s.nextInt();  
        if(index<num){                    	
        	System.out.println("The array element at index "+index+" is "+a[index]);
        	System.out.println("The array element is successfully accessed");
        	s.close();
           }
        try
        {
        	if(index>num)
        	{
        		throw new ArrayIndexOutOfBoundsException();
        	}
        
	        }
        catch(ArrayIndexOutOfBoundsException e)
	
        {
        	
		System.out.println(e);
		
        }
        
        }

}
