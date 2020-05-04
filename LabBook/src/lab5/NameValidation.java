package lab5;
import java.util.Scanner;
public class NameValidation {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		String firstName = sc.nextLine();
		System.out.println("Enter Last Name");
		String lastName = sc.nextLine();
		try
		{
			if(firstName == "" || lastName == "")
				throw new NameNotNullException();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
}
