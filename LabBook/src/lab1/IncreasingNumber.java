package lab1;
import java.util.Scanner;
class Increasingnumber
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number");
    int number = sc.nextInt();
    System.out.println(Increasingnumber.checkNumber(number));
  }
  static boolean checkNumber(int n)
  {
    int q = 0,t,x,n1,c = 0;
    n1 = n;
    while(n!=0)
    {
       n = n / 10;
       c++;
    }
    int[] a = new int[c];
    for(int i=a.length-1;i>=0;i--)
    {
      x = n1 % 10;
      a[i] = x;
      n1 = n1 / 10;
    }
    for(int i=0;i<a.length;i++)
      System.out.println(a[i]);
    t = a[0];
    for(int i=0;i<a.length-1;i++)
    {
      for(int j=i+1;j<a.length;j++)
      {
        if(t<=a[j])
          continue;
	else
	{
          q = 1;
	  break;
	}
      }
        t=a[i+1];
    }
    if(q==1)
      return false;
    else
      return true;
  }
}