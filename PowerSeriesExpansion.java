package Programs;

import java.util.Scanner;

public class PowerSeriesExpansion {

	public static void main(String[] args) {
		
		System.out.println("Enter the number whose sine value to be found out");
		System.out.println(Math.sin(new Scanner(System.in).nextDouble()));
		
		System.out.println("Enter the number whose exponential to be found out");
		System.out.println(Math.exp(new Scanner(System.in).nextDouble()));
		
		System.out.println("Enter the number whose square root to be found out");
		System.out.println(Math.sqrt(new Scanner(System.in).nextDouble()));
		
		System.out.println("Enter the number whose log to be found out");
		System.out.println(Math.log(new Scanner(System.in).nextDouble()));
	}

}
