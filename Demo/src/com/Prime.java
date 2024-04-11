package com;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
			
		}
		if(count==2)
		{
			System.out.println(num+": Number is Prime");
		}
		else {
			System.out.println(num+": Number is Not Prime");
		}

	}

}
