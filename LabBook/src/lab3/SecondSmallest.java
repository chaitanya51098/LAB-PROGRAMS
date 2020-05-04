package lab3;
import java.util.Scanner;
public class SecondSmallest 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Elements of the Array");
		for(int i=0;i<a.length;i++)
			a[i] = sc.nextInt();
		System.out.println("Second Smallest Number is "+SecondSmallest.getSecondSmallest(a));
	}
	static int getSecondSmallest(int a[])
	{
	    int t;
	    for(int i=0;i<a.length-1;i++)
	    {
	    	for(int j=0;j<a.length-i-1;j++)
	    	{
	    		if(a[j]>a[j+1])
	    		{
	    			t=a[j];
	    			a[j]=a[j+1];
	    			a[j+1]=t;
	    		}
	    	}
	    }
		return a[1];
   }
}


