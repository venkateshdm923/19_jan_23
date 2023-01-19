package com.bridgelabz.secondpack;


///
	import java.util.Scanner;  
	public class AddTwoNumbers {
	public static void main(String args[]){  
	int num1, num2, sum;  
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");  
	num1 = sc.nextInt();  
	System.out.print("Enter the second number: ");  
	num2 = sc.nextInt();  
	sum = sum(num1, num2);  //sum is method
	System.out.println("The sum of two numbers number1 and number2 is: " + sum);  
	}  
	public static int sum(int num1, int num2)  //method that calculates the sum
	{  
	int sum = num1 + num2;  
	return sum;  
	}  
	}  
	
