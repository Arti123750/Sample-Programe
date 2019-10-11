package com.javawings.sampleprog;

public class FindDigitInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Arti123";
		char s2[]=s1.toCharArray();
		for(char c:s2)
		{
			if(Character.isDigit(c))
			{
				System.out.print(c);
			}
		}
		}
	}
