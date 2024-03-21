package Assignment_5_1;
import java.text.*;
import java.util.*;


 class Date{
private int day;
private int month;
private int year;

public int getDay() {
	return day;
}
public void setDay() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter day	:	");

	this.day = sc.nextInt();
}
public int getMonth() {
	return month;
}
public void setMonth( ) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter month	:	");

	this.month = sc.nextInt();
}
public int getYear() {
	return year;
}
public void setYear() {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter year	:	");

	this.year = sc.nextInt();
}



}	

public class dateFormat {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Date date = new Date();
	
		
		 date.setDay();
		date.setMonth();
		date.setYear();
		
		System.out.println(date.getDay()+"/"+date.getMonth()+"/"+date.getYear());		//System.out.println("formattedDate	:	"+formattedDate);

	}
	
	public static void main1(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String dateStr = "31-12-2022";
		try {
			java.util.Date parsedDate = sdf.parse(dateStr);
			System.out.println("parseed date : "+parsedDate);
		}catch (ParseException e) {
			System.out.println("parseed date : "+e.getMessage());
		}
	}
	
	public static void main2(String[] args) {
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Date date = new Date();
		
		String str = sc.nextLine();
		String dateFormat = str;
		//String formattedDate = sdf.format(date);
		//String dateFormat = "31-12-2022";
		System.out.println("dateFormat	:	"+dateFormat);

	}
	
	
		
		
		
		
		
		
		
		
		
		
		
	}

