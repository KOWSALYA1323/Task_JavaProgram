package javapackage;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
int a=sc.nextInt();
int f=1;
for(int i=1;i<=a;i++) {f=f*i;
	}
System.out.println("Factorial of the number: "+f);

}}
