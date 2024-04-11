package com;

import java.util.Scanner;

public class Even {
	public static void main(String[] args)
	{
	   System.out.println("Enter the number");
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   
		if(num%2==0)
		{
			System.out.println(num+" :is even number");
		}
		else {
		System.out.println(num+": is odd number");
		}
	}

}
