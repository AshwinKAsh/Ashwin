package Programs;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scanner.nextInt();
		int factorial=1;
		
		if(num==0||num==1)
			System.out.println(factorial);
		else{
			for(int i=1;i<=num;i++){
				factorial=factorial*i;
			}
			System.out.println(factorial);
		}
	}
}
