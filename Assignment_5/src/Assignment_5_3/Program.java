package Assignment_5_3;

import java.util.Scanner;

class Book {
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private int year;
	private double price;
	private int quantity;

	public Book() {

		this.title = null;
		this.author = null;
		this.publisher = null;
		this.isbn = null;
		this.year = 0;
		this.price = 0;
		this.quantity = 0;
	}

	public void setTitle(String title) {
		this.title = title;
		System.out.println("title	:	" + this.title);

	}

	public void setAuthor(String author) {
		this.author = author;
		System.out.println(" author	:	" + this.author);

	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
		System.out.println(" publisher	:	" + this.publisher);

	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
		System.out.println(" isbn	:	" + this.isbn);

	}

	public void setYear(int year) {
		this.year = year;
		System.out.println(" year	:	" + this.year);

	}

	public void setPrice(double price) {
		this.price = price;
		System.out.println(" price	:	" + this.price);

	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
		System.out.println("Original Quantity	:	" + this.quantity);

	}

	public void increaseQuantity(int i) {
		this.quantity = quantity + i;
		System.out.println("increase Quantity	:	" + this.quantity);

	}

	public void decreaseQuantity(int d) {
		this.quantity = quantity - d;
		System.out.println("decrease Quantity	:	" + this.quantity);

	}

	public double getInventoryValue() {
		double Inventory = price * quantity;
		return Inventory;
	}
}

public class Program {

	public static void main(String[] args) {
		Book book = new Book();
		Scanner sc = new Scanner(System.in);

		book.setTitle("JAVA: THE COMPLETE REFERENCE");
		book.setAuthor("Herbert Schildt");
		book.setPublisher("McGraw Hill Education");
		book.setIsbn("007063677X");
		book.setYear(2017);
		book.setPrice(965);
		book.setQuantity(500);

		book.increaseQuantity(400);
		book.decreaseQuantity(200);

		double total_Inventory = book.getInventoryValue();
		System.out.println("total_Inventory	:	" + total_Inventory + " Rs");

	}

}
