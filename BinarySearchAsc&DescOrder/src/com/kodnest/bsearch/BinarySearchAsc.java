package com.kodnest.bsearch;

import java.util.Scanner;

public class BinarySearchAsc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User! Please enter the size of an array:");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		System.out.println("User! Please enter the stored array elements");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("The elements are:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		System.out.println("User! Please enter the target element to search for:");
		int target = sc.nextInt();
		
		Search bSearch = new Search();
		int result = bSearch.binarySearch(a, target);
		if(result != -1)
		{
			System.out.println("Element found at index: " + result);
		}
		else
		{
			System.out.println("Element not found in the array:");
		}
		sc.close();
	}
}