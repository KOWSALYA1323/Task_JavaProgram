package javapackage;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Before swapping numbers: "+a +" " + b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swapping numbers: " +a +" " + b);

	}

}
