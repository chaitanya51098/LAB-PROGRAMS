package lab4;
import java.util.Scanner;
public class SumofCubes 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number,sum;
		System.out.println("Enter the Number");
		number = sc.nextInt();
		sum = calculateSum(number);
		System.out.println(sum);
	}
	public static int calculateSum(int s)
	{
		int sum=0,r;
		while(s!=0)
		{
			r = s % 10;
			sum = sum + r * r * r;
			s = s / 10;
		}
		return sum;
	}
	
}