package lab1;
import java.util.Scanner;
public class PowerofTwo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the Number");
	    int number = sc.nextInt();
	    System.out.println(PowerofTwo.checkNumber(number));
	}
	  static boolean checkNumber(int n)
	  { 
	    int x=1;
	    for(int i=1;x<=n;i++)
	    {
	      x = x * 2;
	      if(x==n)
	        break;
	    }
	    if(x==n)
	      return true;
	    else
	      return false;
	  }
}
