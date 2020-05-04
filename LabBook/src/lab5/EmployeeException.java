package lab5;

public class EmployeeException extends Exception 
{
	public EmployeeException()
	{
		super("Salary Less than 3000");
	}
}
