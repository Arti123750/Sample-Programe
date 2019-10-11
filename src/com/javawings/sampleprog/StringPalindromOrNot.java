package com.javawings.sampleprog;

import java.util.Scanner;
public class StringPalindromOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Or Number ");
		s1=sc.nextLine();
		isStringPalindrom(s1);
	}

	public static void isStringPalindrom(String s1)
	{
	String s2 = "";
	int len=s1.length();
	for(int i=len-1;i>=0;i--)
		s2=s2+s1.charAt(i);
	
	if(s1.equals(s2))
	{
		System.out.println("String or Number is Palindrom");
	}
	else
	{
		System.out.println("String Number is not Palindrom");
	}
		}
		}
	

  