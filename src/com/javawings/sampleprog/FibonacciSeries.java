package com.javawings.sampleprog;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no: ");
		int no=sc.nextInt();
		calFiboSeries(no);
	}
	
	public static int calFiboSeries(int no)
	{
		int a=0,b=1,c=0;
		for(int i=0;i<=no;i++) 
		{
		c=a+b;
		System.out.println(a+" + "+b+" = "+c);
		a=b;
		b=c;
		}
		
		return no;
		
	}

}
