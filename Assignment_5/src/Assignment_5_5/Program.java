package Assignment_5_5;

import java.util.Scanner;

class  TelephoneBill{
	String CustomerName; 
	double PhoneNumber;
	int NumberOfCalls;
	int Duration;
	
	public void AcceptInputs(){
    	Scanner sc = new Scanner(System.in);
    	
	System.out.println("Customer Name	:	");
    this.CustomerName =	sc.next();
	System.out.println("Phone Number	:	");
    this.PhoneNumber = sc.nextDouble();
    System.out.println("NumberOfCalls	:	");
    this.NumberOfCalls = sc.nextInt();
    System.out.println("Duration	:	");
    this.Duration = sc.nextInt();

    }
	
 public void calculateBill(){
	 int charge = 1;
		if (this.NumberOfCalls<=100 && Duration >= 1 ) {
			 charge = 50 * NumberOfCalls;	
			System.out.println(charge);
		}
		else if (this.NumberOfCalls>100 && Duration >= 1) {
			 charge = 25 * NumberOfCalls;	
			System.out.println("charge	:	"+charge+ " $");
		}
			
 }
 
}
public class Program {
public static void main(String[] args) {
	TelephoneBill bill = new TelephoneBill();
    
    bill.AcceptInputs();
     bill.calculateBill();
}

}
