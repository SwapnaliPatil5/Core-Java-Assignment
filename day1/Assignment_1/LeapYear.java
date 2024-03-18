package Assignment_1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        // Get the year from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

    /*    
        if (year % 4 == 0) 
        {
            if (year % 100 == 0) 
            {
                if (year % 400 == 0) 
                {
                    System.out.println(year + " is a leap year.");
                } 
                
                else 
                {
                    System.out.println(year + " is not a leap year.");
                }
            }
            else 
            {
                System.out.println(year + " is a leap year.");
            }
        } 
        else 
        {
            System.out.println(year + " is not a leap year.");
        }
    }
}
  */    
   
       
                switch (year % 4) {
                    case 0:
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                System.out.println(year + " is a leap year.");
                            } else {
                                System.out.println(year + " is not a leap year.");
                            }
                        } else {
                            System.out.println(year + " is a leap year.");
                        }
                        break;
                    default:
                        System.out.println(year + " is not a leap year.");
                }
                scanner.close();
            }
        }