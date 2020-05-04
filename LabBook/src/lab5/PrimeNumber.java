package lab5;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) 
	{
		int count= 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Upto Which Integer");
		int numberRange = sc.nextInt();
		for(int i=1;i<=numberRange;i++)
		{
			count = 0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					count++;
			}
			if(count==2)
				System.out.println(i);
		}
	}
}
