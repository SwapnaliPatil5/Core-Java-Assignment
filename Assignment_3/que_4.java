package Assignment_2;

public class que_4 {

	public static void main(String[] args) {
		// Write a Program that demonstrates widening conversion from int to (double,float, boolean, string)  and 
		//prints the result

		int num1 = 10;
		int num2 = 30;
		int num3 = 20;
		
		float num4 = num1;
		double num5 = num2;
		boolean b = (num3 == 20);
		
		String str = Integer.toString(num2);
		
		 System.out.println("num4 : " + num4);
		 System.out.println("num5 : " + num5);
		 System.out.println("str : " + str);
		 System.out.println("b : " + b);
	}
	
}
