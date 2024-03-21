package assignment_7_7;

/*
 *Print the third-largest number in an array without sorting it 
Input: [ 24,54,31,16,82,45,67]
Output: 54 (82 and 67 are the largest and second-largest)
 
 */

public class Program {
	
	
	    public static void main(String[] args) {
	        int[] array1 = {23, 60, 94, 3, 102};
	        int[] array2 = {42, 16, 74};
	        
	        int[] mergedArray = mergeArray(array1, array2);
	        
	       
	        System.out.print(" [");
	        for (int i = 0; i < mergedArray.length; i++) {
	            System.out.print(mergedArray[i]);
	            if (i < mergedArray.length - 1) {
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	    }
	    
	    public static int[] mergeArray(int[] array1, int[] array2) {
	        int totalLength = array1.length + array2.length;
	        int[] result = new int[totalLength];
	        
	        int i = 0, j = 0, k = 0;
	        
	        
	        while (i < array1.length && j < array2.length) {
	            result[k++] = array1[i++];
	            if (k < totalLength) { 
	                result[k++] = array2[j++];
	            }
	        }
	       
	        while (i < array1.length) {
	            result[k++] = array1[i++];
	        }
	        
	        // Append any remaining elements from the second array
	        while (j < array2.length) {
	            result[k++] = array2[j++];
	        }
	        
	        return result;
	    }
	}


	    
	
