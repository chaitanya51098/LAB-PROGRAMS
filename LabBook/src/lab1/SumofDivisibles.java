package lab1;
import java.util.Scanner;
public class SumofDivisibles 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Range");
	    int n = sc.nextInt();
	    System.out.println("Sum is "+SumofDivisibles.calculateSum(n));
	}
	  static int calculateSum(int n)
	  {
	    int sum = 0;
	    for(int i=1;i<=n;i++)
	    {
	      if(i%3==0)
	        sum = sum + i;
	      else if(i%5==0)
	        sum = sum + i;
	    }
	    return sum;
	 }
}
