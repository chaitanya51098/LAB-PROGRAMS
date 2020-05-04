package lab6;

import java.util.Scanner;

public class Registering {
	Boolean validate(String s) {
		s.contains("_job");
		int a = s.lastIndexOf("_job");
		String s1 = "";
		for (int i = a; i < s.length(); i++) {
			s1 += s.charAt(i);
		}
		if (s.length() > 12 && s1.contains("_job")) {
			return true;

		} else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Username should always end with _job\n"
				+ "there should be at least minimum of 8 characters to the left of _job");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		Registering p = new Registering();
		System.out.println(p.validate(s));
	}

}

