import java.util.*;
import java.io.*;

class UniqueElement
{
 public static void main(String[] args)
 {
   int count=0;
   System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
   Scanner s=new Scanner(System.in);
   int n=s.nextInt();
   int[] arr=new int[n];
   UniqueElement obj=new UniqueElement();
   System.out.println("ENTER THE ELEMENTS:");
   for(int i=0;i<n;i++)
    {
     arr[i]=s.nextInt();
    }
    Arrays.sort(arr);
    
   System.out.println("UNIQUE ELEMENT:"+obj.method(Arr,n));
 } 
 public int method(int[] arr,int n)
   {
     int temp=0,count=0;
    for(int i=0;i<n-1;i+=2)
     {
       if(arr[i]!=arr[i+1])
         {  
          temp=arr[i];
          count=1;
          break;
         }
    }
    if(count==0)
    {
    temp=arr[arr.length-1];
    }
      return temp;
  }
}        
