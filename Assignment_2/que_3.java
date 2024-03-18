package Assignment_2;

public class que_3 {

	public static void main(String[] args) {
		// Write a program that performs arithmetic operations involving different data types (int, double, float) 
		//and observes how Java handles widening conversions automatically. 
	 int x1 = 20;
	 double y1 = 30.5;
	 float z1 = 23.1f;
	 int sum1 = (int) (x1 + y1 + z1);
	 
	 float sum2 = (float) (x1 + y1 + z1);
	 
	 double sum3 = (double) (x1 + y1 + z1);
	 
	 System.out.println("sum1 : " + sum1);
	 System.out.println("sum2 : " + sum2);
	 System.out.println("sum3 : " + sum3);
	 
	int product1 = (int) (x1*y1*z1);
	float product2 = (float) (x1*y1*z1);
	double product3 = (double) (x1*y1*z1);
	
	System.out.println("product1 : " + product1);
	 System.out.println("product2 : " + product2);
	 System.out.println("product3 : " + product3);

	 //same with division and subtraction
	
	}
	

}
