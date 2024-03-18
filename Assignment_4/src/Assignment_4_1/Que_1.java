package Assignment_4_1;

/* Build a class Student which contains details about the Student and compile and run its
instance */
import java.util.*;
class Student{
int std;
 String name;
int roll_num;

}

public class Que_1 {

	public static void main(String[] args) {
		
	 Student st = new Student ();
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.print("standard : ");
	 st.std = sc.nextInt();
	 
	 System.out.print("name :	"); 
	 st.name = sc.next();
	 
	 System.out.print("roll_num : ");
	 st.roll_num = sc.nextInt();
	 
	 
	 System.out.println("standard : "+ st.std);
	 System.out.println("name :	"+st.name);
	 System.out.println("roll_num : "+st.roll_num);
	 
	 sc.close();
	}

}
