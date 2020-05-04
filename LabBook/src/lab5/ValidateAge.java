package lab5;
import java.util.Scanner;
public class ValidateAge {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age of the Person");
		int age = sc.nextInt();
		try
		{
			if(age<15)
				throw new UnderAgeException();
			else
				System.out.println("Valid person");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
