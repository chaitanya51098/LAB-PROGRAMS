package lab5;
public class UnderAgeException extends Exception 
{
	public UnderAgeException()
	{
		super("Age Should be Above 15");
	}
}
