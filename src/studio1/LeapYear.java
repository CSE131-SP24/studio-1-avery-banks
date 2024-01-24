package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean c1=false;
		boolean c2=false;
		boolean c3=false;
		boolean finalcheck=false;
		System.out.println("Give a year to test if it is a leapyear or not");
		int year = in.nextInt();
		c1 = (year%4==0);
		c2 = (year%100==0);
		c3=(year%400==0);
		finalcheck=((c1&&!c2)||(c3));
	}

}
