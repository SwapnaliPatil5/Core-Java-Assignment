package Assignment_1;

import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
System.out.println("Enter the number : ");

	int num = sc.nextInt();
	
	if (num>90)
	{
		System.out.println("A++");
	}
	else if (num>70 && num<90)
	{
		System.out.println("A");
	}
	else if (num>40 && num<70)
	{
		System.out.println("B");
	}	
		
	else 
		System.out.println("C");
	sc.close();
	}
	
}