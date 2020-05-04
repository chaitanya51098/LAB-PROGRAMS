package lab10;

import java.util.Scanner;
interface method_ref
{
	void show(int a);
}
public class FactorialofaNumber {
	void factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		FactorialofaNumber d=new FactorialofaNumber();
		method_ref m=d::factorial;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		m.show(a);
	}

}
