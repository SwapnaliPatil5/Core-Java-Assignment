package assignment_7_10;

/*
 Write a program which generates the series 1,4,27,16,125,36
 */

public class Program {
	
	
	public static void main(String[] args) {
        int[] arr = {65,14,129,34,7}; // Example array
        System.out.println(determineOrder(arr));
    }
	
    public static void main1(String[] args) {
        int[] arr = {5,14,35,90,139}; // Example array
        System.out.println(determineOrder(arr));
    }

    public static String determineOrder(int[] arr) {
        if (arr == null || arr.length < 2) {
            return "The array is too short to determine the order.";
        }
        
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
            // If it's neither ascending nor descending, it's random
            if (!isAscending && !isDescending) {
                return "The numbers are in random order.";
            }
        }

        if (isAscending) {
            return "The numbers are in ascending order.";
        } else if (isDescending) {
            return "The numbers are in descending order.";
        } else {
            return "The numbers are in random order.";
        }
    }
}
