package lab5;
import java.util.Scanner;
public class FibonacciR {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range");
		int n = sc.nextInt();
		int element = FibonacciR.recursive(n);
		System.out.println(element);
	}
	public static int recursive(int n)
	{
		int firstNumber = 1,secondNumber = 1,nextNumber = 0;
		nextNumber = firstNumber + secondNumber;
		return recursive(n-2) + recursive(n-1);
	}
}
