package com.kodnest.bsearch;

public class Search {
	public static int binarySearch(int[] a, int target){
		int low = 0;
		int high =a.length-1;
		
		while(low <= high)
		{
			int mid = (low + high)/2;
			
			if(target == a[mid])
			{
				return mid;
			}
			else if(target > a[mid])
			{
				low = mid +1;
			}
			else
			{
				high = mid -1;
			}
		}
		return -1;
	}
}