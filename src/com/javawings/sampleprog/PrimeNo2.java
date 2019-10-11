package com.javawings.sampleprog;

import java.util.Scanner;

public class PrimeNo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int no =sc.nextInt();
		PrimeNo2.isPrimeNo(no);
	}
	public static void isPrimeNo(int no)
	{
		int res=0;
		
		for(int i=2;i<=no/2;i++)
		{
		res=no%i;
		}
		if(res==0)
		{
			System.out.println(no+" No is not Prime");
		}
		else
		{
			System.out.println(no+"No is Prime");
		}
	}
}
