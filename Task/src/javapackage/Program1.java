package javapackage;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int sumAB = a+b;
		int sumCD = c+d;
		
		if(sumAB > sumCD)
		{
			System.out.println("The sum of a and b is greater than sum of c and d");
	}
		else
		{
			System.out.println("The sum of a and b is not greater than sum of c and d");
		}
		}
}
