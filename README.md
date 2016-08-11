	import java.util.*;
	
public class LeastCommonPrefix {


	public static void main(String ar[])throws Exception
	{
	Scanner sc=new Scanner(System.in);
	int n,j;
	n=sc.nextInt();
	String a[]=new String[10];
	for(int i=0;i<n;i++)
	{
	a[i]=sc.next();
	}
	String longs = null,check;
	if(a.length>0)
	longs=a[0];
	for(int i=1;i<a.length;i++)
	{
	check=a[i];
	for(j=0;j<Math.min(longs.length(),a[i].length());j++)
	{
	if(longs.charAt(j)!=check.charAt(j))
	break;
	}
	longs=a[i].substring(0,j);
	}
	System.out.println("longest prefix is:"+longs);
	sc.close();
	}
	}


