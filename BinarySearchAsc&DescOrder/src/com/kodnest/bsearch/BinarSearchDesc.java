package com.kodnest.bsearch;

import java.util.Scanner;

public class BinarSearchDesc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("User! Please enter the size of an array:");
		int size = sc.nextInt();
		int[] a = new int[size];
		
		System.out.println("User! Please enter the elements");
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
		
		System.out.println("User! Please enter the target element:");
		int ele = sc.nextInt();
		int low=0;
		int high = a.length-1;
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if(ele == a[mid])
			{
				System.out.println("Element found at the index: " + mid);
				System.exit(0);
			}
			else if(ele > a[mid])
			{
				high = mid - 1;
				mid = mid;
				
			}
			else
			{
				low = mid + 1;
				high = high;
			}
		}
		System.out.println("Element not found");
	}
}