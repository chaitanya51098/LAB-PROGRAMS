package lab6;
import java.util.Scanner;
public class StringMirror 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer s = new StringBuffer();
		System.out.println("Enter the String");
		s.append(sc.nextLine());
		StringBuffer s2 =new StringBuffer();
		s2 = s;
		System.out.print(s2);
		s= StringMirror.getImage(s);
		System.out.println("|"+s);
	}
	public static StringBuffer getImage(StringBuffer s)
	{
		s.reverse();
		return s;
	}
}
