package lab1;

import java.util.Scanner;
class Difference
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Range");
    int n = sc.nextInt();
    System.out.println("Difference is "+Difference.calculateDifference(n));
  }
  static int calculateDifference(int n)
  {
    int s1 = 0,s2 = 0,s3;
    for(int i=1;i<=n;i++)
      s1 = s1 + (i * i);
    for(int i=1;i<=n;i++)
      s2 = s2 + i;
    s2 = s2 * s2;
    s3 = s1 - s2;
    return s3;
  }
} 
    