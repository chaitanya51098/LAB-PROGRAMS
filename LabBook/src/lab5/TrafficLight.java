package lab5;
import java.util.Scanner;
public class TrafficLight {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Select One Option");
		System.out.println("1. Red Light");
		System.out.println("2. Yellow Light");
		System.out.println("3. Green Light");
		int opt = sc.nextInt();
		switch(opt)
		{
			case 1:	System.out.println("Stop");
					break;
			case 2: System.out.println("Ready");
					break;
			case 3: System.out.println("Go");
					break;
			default: System.out.println("Wrong Option Selected");		
		}
		
	}
}
