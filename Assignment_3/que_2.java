package Assignment_2;

public class que_2 {

	public static void main(String[] args) {
		//Create a program that demonstrates narrowing conversion from double to int and prints the result. 
	double x = 30.56;
	//int y = double x;        //error
	int y = (int) x; 
	System.out.println("number1 : " + x);
    System.out.println("number2 : " + y);
	}

}
