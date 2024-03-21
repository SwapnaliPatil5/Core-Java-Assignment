package Assignment_5_4;

class ElectricityBill {
	String customerName;
	double unitsConsumed;
	double billAmount;

	public ElectricityBill() {
		this.customerName = "Pranav Patil";
		this.unitsConsumed = 678;
		//System.out.println(" Customer Name		:	" + customerName);
		//System.out.println(" Units Consumed 	:	" + unitsConsumed);
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}

	public void calculateBillAmount() {

		if (unitsConsumed < 100) {
			double billAmount = unitsConsumed * 5;
			System.out.println(" Customer Name	:	" + customerName);
			System.out.println(" Units Consumed 	:	" + unitsConsumed);
			System.out.println(" The bill amount	:	" + billAmount + " Rs");
		} 
		
		else if (unitsConsumed > 100 && unitsConsumed <= 200) {
			
			
			billAmount = unitsConsumed * 7;
			System.out.println(" Customer Name	:	" + customerName);
			System.out.println(" Units Consumed 	:	" + unitsConsumed);
			System.out.println(" The bill amount	:	" + billAmount + " Rs");
		}
		   else 
		{
			billAmount = unitsConsumed * 10;
			System.out.println(" Customer Name	:	" + customerName);
			System.out.println(" Units Consumed 	:	" + unitsConsumed);
			System.out.println(" The bill amount	:	" + billAmount + " Rs");
		}
	
		}
		
		
	
		
}
	


public class Program {

	public static void main(String[] args) {
		ElectricityBill bill = new ElectricityBill();
		 bill.setCustomerName("Swapnali Patil");
		 bill.setUnitsConsumed(11000);
		 //bill.setUnitsConsumed(98);
		// bill.setUnitsConsumed(156);
		 //System.out.println(" Customer Name		:	" + bill.customerName);
		 //System.out.println(" Units Consumed 	:	" + bill.unitsConsumed);
		 bill.calculateBillAmount();

	}

}
