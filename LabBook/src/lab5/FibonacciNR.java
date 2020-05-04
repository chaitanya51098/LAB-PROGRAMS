package lab5;
import java.util.Scanner;
public class FibonacciNR {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int firstNumber = 1,secondNumber = 1,nextNumber = 0;
		System.out.println("Enter Range");
		int n = sc.nextInt();
		for(int i=0;i<n-2;i++)
		{
			nextNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}
		System.out.println(n+" Element is "+nextNumber);
	}
}
