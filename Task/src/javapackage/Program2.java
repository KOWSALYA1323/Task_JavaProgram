package javapackage;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		if (a % 2 == 0) {
       System.out.println("Even number");
	}
		else {
			System.out.println("Not an Even number");
		}

}}
