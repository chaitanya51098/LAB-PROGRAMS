package lab5;
import java.util.Scanner;
public class EmployeeValidate {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Salary of the Employee");
		double salary = sc.nextDouble();
		try
		{
			if(salary<3000)
				throw new EmployeeException();
			else
				System.out.println("Salary is above 3000");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
