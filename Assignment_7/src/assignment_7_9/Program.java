package assignment_7_9;

public class Program {
	
	 public static void generateSeries(int n) {
	        for (int i = 1; i <= n; i++) {
	            if (i % 2 == 0) { 
	            	System.out.println(i*i);
	               
	            } else 
	                System.out.println(i*i*i);
	            }
	        }
	    

	    public static void main(String[] args) {
	        int n = 6; 
	        generateSeries(n);
	    }

} 
	


