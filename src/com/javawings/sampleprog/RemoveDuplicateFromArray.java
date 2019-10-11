package com.javawings.sampleprog;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer>a1=new ArrayList<>();
		
		a1.add(58);
		a1.add(98);
		a1.add(10);
		a1.add(15);
		a1.add(10);
		a1.add(25);
		a1.add(20);
		a1.add(98);
		System.out.println("Before Removing Duplicates the list is :: "+a1);
		
		Set<Integer>s1=new HashSet(a1);
		System.out.println("After removing Duplicates the list is :: "+s1);
	}

}
