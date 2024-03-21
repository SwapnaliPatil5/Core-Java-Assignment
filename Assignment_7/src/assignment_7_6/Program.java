package assignment_7_6;

/*
 *Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest)
 
 */

public class Program {
	
	// Java program to find third 
	// Largest element in an array 
	// of distinct elements 

	
	static void thirdLargest(int arr[], int arr_size) 
	{ 
		/* There should be 
		atleast three elements */
		if (arr_size < 3) 
		{ 
			System.out.printf(" Invalid Input "); 
			return; 
		} 

		// Find first 
		// largest element 
		int first = arr[0]; 
		for (int i = 1; 
				i < arr_size ; i++) 
			if (arr[i] > first) 
				first = arr[i]; 

		// Find second 
		// largest element 
		int second = Integer.MIN_VALUE; 
		for (int i = 0; 
				i < arr_size ; i++) 
			if (arr[i] > second && 
				arr[i] < first) 
				second = arr[i]; 

		// Find third 
		// largest element 
		int third = Integer.MIN_VALUE; 
		for (int i = 0; 
				i < arr_size ; i++) 
			if (arr[i] > third && 
				arr[i] < second) 
				third = arr[i]; 

		System.out.printf("The third Largest " + 
					"element is %d\n", third); 
	} 

	// Driver code 
	public static void main(String []args) 
	{ 
		int arr[] = {24,54,31,16,82,45,67}; 
		int n = arr.length; 
		thirdLargest(arr, n); 
	} 
	} 

	
