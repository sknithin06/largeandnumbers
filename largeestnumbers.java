package Java;

import java.util.Scanner;

public class largeestnumbers {
	public static void main(String[] args) {
		System.out.println("Welcome to BasicCoreProgram");
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter a value of a-");  
		double a=sc.nextDouble();  
		System.out.print("Enter a value of b-");  
		double b=sc.nextDouble();  
		System.out.print("Enter a value of c-");  
		double c= sc.nextDouble();  
		
		if( a > b && a > c) {
			System.out.println("the largest value is:"+a);
		}
		else if (b > c &&  b > c) {
			System.out.println("the largest value is:"+b);
		}
		else {
			System.out.println("the largest value is"+c);
		}
	}
}

