package lab3;
import java.util.Scanner;
public class Reversesort 
{

	public static void main(String[] args) 
	{
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the Size of the Array");
		   int n = sc.nextInt();
		   int[] a = new int[n];
		   System.out.println("Enter Array Elements");
		   for(int i=0;i<n;i++)
		     a[i] = sc.nextInt();
		   System.out.println("Reversed Array Elements in Sorted order");
		   for(int i=0;i<n;i++)
		     System.out.println(Reversesort.elementsOp(a));
    }
	static int elementsOp(int a[])
	{
	    int[] b = new int[a.length];
	    int temp=0,sum=0,n1,i=0;
	    for(i=0;i<a.length;i++)
	    {
	      n1 = a[i];
	      sum = 0;
	      while(n1!=0)
	      {
	        temp = n1 % 10;
	        sum = sum * 10 + temp;
	        n1 = n1 / 10;
		  }
		      b[i] = sum;
		 }
		 for(i=0;i<b.length-1;i++)
		    {
		      for(int j=0;j<b.length-i-1;j++)
		      {
			if(b[j]>b[j+1])
			{
			  temp = b[j];
			  b[j] = b[j+1];
			  b[j+1] = temp;
			}
		      }
		    }
		   return b[a.length-1];
		  }
		 
}


