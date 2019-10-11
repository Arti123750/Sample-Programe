package com.javawings.sampleprog;

import java.util.Scanner;

public class EvenOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no;
		System.out.println("Enter no: ");
		no=sc.nextInt();
		if(isEvenOrOdd(no))
		{
			System.out.println("No is Even");
		}
		else

		{
			System.out.println("no is Odd");
		}
	}
	public static Boolean isEvenOrOdd(int no)
	{
		if(no%2==0)
		return true;
	else 
		return false;
	
	
	}
}

