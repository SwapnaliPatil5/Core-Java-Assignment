package assignment_7_4;

//Write a program to reverse an Array in java . 

public class Program {
	
	private static void reverse(int[] arr1) {
	 int l  = arr1.length;
		int a[] = new int [l];
		
		
		a[0] =	arr1[l - 1];                
		a[1] =	arr1[l - 2];
		a[2] =	arr1[l - 3];		
		a[3] =	arr1[l - 4];
		
		printReverseArray(a);
		

		
	}
	

    private static void printReverseArray(int []a) {
    	for (int index = 0; index < a.length; ++index )
    	{
    		System.out.println(a[index]);
    	}
    	
		
	}


	public static void main(String[] args) {
       
    	int [] arr = new int [] {5,7,8,9};
    	reverse(arr);
    }

	
}
