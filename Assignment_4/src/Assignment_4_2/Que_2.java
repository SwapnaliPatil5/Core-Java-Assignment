
package Assignment_4_2;
/*Write a Vehicle class with overloaded methods that have a different number of parameters.
Demonstrate calling these overloaded methods with various numbers of arguments*/
 import java.util.*;

class Vehicle{
	
	     String model;
	     int engine; ;
	     int year;
	     double price;
       
	   
	    // Method to display vehicle details
	     public void displayDetails(String str) {
	    	
		     this.model = str;
		        System.out.println("Model: "+ model);
		      
	     }
	     
	     public void displayDetails(String s,int e) {
	 	    
		        this.model = s;
		        System.out.println("Model: "+model);
		        
		       this.engine = e;
		        System.out.println("Engine: "+engine+" cc");
		      
	     }
	     
	    public void displayDetails(String s,int e,int y) {
	    
	        this.model = s;
	        System.out.println("Model	:	"+model);
	        
	       
	       this.engine = e;
	        System.out.println("Engine	:	"+engine+" cc");
	        
	     
	        this.year = y;
	        System.out.println("Year	:	"+year);
	       
	    }
	    
	    public void displayDetails(String s,int e,int y,double p) {
	
		      this.model = s;
	        System.out.println("Model: "+model);
	        
	       this.engine = e;
	        System.out.println("Engine: "+engine+" cc");
	        
	     
	        this.year = y;
	        System.out.println("Year: "+year);
	        
	        this.price = p;
	        System.out.println("Price: "+price+" lakhs");
	       
	    }
	}


public class Que_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Model : ");
	      String str = sc.nextLine(); 
	      
	      System.out.print("Enter Engine in cc : ");
	      int eng = sc.nextInt();
	      
	      System.out.print("Enter Year : ");
	      int year = sc.nextInt();
	      
	      System.out.print("Enter price : ");
	      double price = sc.nextDouble();
	      
		Vehicle vl = new Vehicle();
		
		 //  vl.displayDetails();	
		//vl.displayDetails(str);
		//vl.displayDetails(str,eng,year);
		vl.displayDetails(str,eng,year,price);
		   sc.close();
	}
}



