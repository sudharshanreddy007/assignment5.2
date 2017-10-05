package binarysearchalgorithm;

import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {

		int c,first,last,middle,n,search,array[];
//first is first element of an array
//last is the last element of an array
//middle is the middle element of an array
//n is no.of elements in arrays
		Scanner in=new Scanner(System.in);
		//to scan values which we initialize

		System.out.println("Enter number of elements:");
		
		n=in.nextInt();
		//scans next token of the input as int
		array=new int[n];
//declaring the values to array
		System.out.println("Enter"+n+"integers");
//here we enter integers
		for (c=0;c<n;c++)
			array[c]=in.nextInt();
		System.out.println("Enter value to find");
		search=in.nextInt();
		
		first=0;
		last=n-1;
		middle=(first+last)/2;
		
		while(first<=last)
		{
			if(array[middle]<search)
				first=middle+1;
			else if(array[middle]==search)
			{
				System.out.println(search+"found at location"+(middle+1)+".");
				break;		
			}
			else
				last=middle-1;
			middle=(first+last)/2;
		}
		if(first>last)
			System.out.println(search+"is not present in list.\n");
	}
//binary search comparing the middle element of the array with the target value.
//If the target value matches the middle element,its position in the array is returned
//If the target value is less than or greater than the middle element, the search continues 
//in the lower or upper half of the array respectively ,eliminating the other half from consideration
//Given an array A of n elements with values 
//this will take worst case option.position of searched values,if it presents in the array or -1
//if it is absent
}