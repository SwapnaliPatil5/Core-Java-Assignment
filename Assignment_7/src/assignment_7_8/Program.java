package assignment_7_8;

public class Program {
    public static void main(String[] args) {
        int[] inputArray = {5, 14, 35, 89, 140};
        printRunningAverage(inputArray);
    }
    
    public static void printRunningAverage(int[] arr) {
        if (arr.length < 3) {
            // No output, as the array has fewer than 3 integers
            return;
        }
        
        int[] outputArray = new int[arr.length - 2];
        
        for (int i = 2; i < arr.length; i++) {
            int sum = arr[i] + arr[i - 1] + arr[i - 2];
            outputArray[i - 2] = sum / 3;
        }
        
        // Print the calculated running averages
        System.out.print(" [");
        for (int i = 0; i < outputArray.length; i++) {
            System.out.print(outputArray[i]);
            if (i < outputArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

