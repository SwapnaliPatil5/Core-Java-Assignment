package Assignment_5_2;

import java.util.Scanner;

class  BMI_Calculator {
	private double height;
	private double weight;

	public BMI_Calculator(){
		this.height = 1;
		this.weight = 1;

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double calculateBMI() {
		double BMI = weight / (height * height);
		return BMI;
	}
}

public class Program {
	

	public static void main(String[] args) {
		BMI_Calculator cal = new BMI_Calculator();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter height	:	");
		 cal.setHeight(sc.nextDouble()) ;
		 
			System.out.print("Enter weight	:	");
		 cal.setWeight(sc.nextDouble()) ;	
		 
		double result = cal.calculateBMI();
		System.out.println("BMI	:	"+result+" kg/sq.m");


	}

}
