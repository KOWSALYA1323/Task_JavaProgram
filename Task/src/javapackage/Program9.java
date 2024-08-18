package javapackage;

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		if(age >=60)
		{
			System.out.println("The person is a senior citizen");
		}
		
		else
		{
			System.out.println("The person is not a senior citizen");
		}


	}

}
