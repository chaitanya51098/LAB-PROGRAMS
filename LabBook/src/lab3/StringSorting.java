package lab3;
import java.util.Scanner;
class Sortstringarray
{
  public static void main(String args[])
  {
    String[] s = {"hello","welcome","bye"};
    Sortstringarray.stringSort(s);
    for(String s1 : s)
      System.out.println(s1);
  }
  public static void stringSort(String[] s)
  {
    for(int i=0;i<s.length-1;i++)
    {
      for(int j=i+1;j<s.length;j++)
      {
	if(s[i].compareTo(s[j])>0)
	{
	  String temp = s[i];
          s[i] = s[j];
	  s[j] = temp;
	}
      }
    }
  }
}