package com.javawings.sampleprog;

import java.util.Scanner;

public class NoSwapping {

	public static void main(String[] args) {
		int no1,no2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Number");
		no1=sc.nextInt();
		System.out.println("Enter a second Number");
		no2=sc.nextInt();
		System.out.println("Before Swapping no is "+no1+" "+no2);
		swapNo(no1, no2);
		
		
	}
	public static void swapNo(int no1,int no2) 
	{
		no1=no1+no2;
		no2=no1-no2;
		no1=no1-no2;
		System.out.println("After Swapping no is "+no1+" "+no2);
		
		
	}

}


