package assignment_7_3;

//Write a Java program to find all pairs of elements in an integer array whose sum is equal to a given number?

public class Program {

	static void pairs_value(int arr1[], int inputNumber) {
		System.out.println("Pairs of elements and their sum : ");

		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] + arr1[j] == inputNumber) {
					System.out.println(arr1[i] + " + " + arr1[j] + " = " + inputNumber);
				}
			}
		}
	}

	public static void main(String[] args) {
		
		int arr [] = new int [ ] { 2, 7, 4, -5, 11, 5, 20 };
		
		Program.pairs_value(arr, 15);
	}
}
