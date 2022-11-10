import java.util.*;
import java.io.*;

class Book 
{
	String author, title, publisher;
	double cost;
	int stock;

    Book() 
    {
		title = "noTitle";
		publisher = "noPublisher";
		author = "noAuthor";
		cost = 0;
		stock = 0;
    }

	Book(String t, String ps, String a, double c, int s) 
	{
		title = t;
		publisher = ps;
		author = a;
		cost = c;
		stock = s;
	}
	
	public boolean equals(String title)
	{
		if(this.title.equalsIgnoreCase(title))
			return true;
		else
			return false;
	}
	
	public boolean equals(int stock)
	{
		if( this.stock >= stock )
			return true;
		else
			return false;
	}
	
	double totalCost(int noOfCopies)
	{
		return cost*noOfCopies;
	}
	
	void Details() 
	{
    System.out.println("Book Details:- ");
    System.out.println("Title - " + title);
    System.out.println("Author - " + author);
    System.out.println("Publisher - " + publisher);
    System.out.println("Price - " + cost);
	}
}

public class Bookshop 
{
	public static void main (String [] args)
	{
		ArrayList <Book> bookList = new ArrayList <Book>();
	
		bookList.add(new Book("Wish I Could Tell You", "Datta Publications", "Durjoy Datta", 133, 2));
		bookList.add(new Book("One Arranged Murder", "Westland", "Chetan Bhagat", 144, 5));
		bookList.add(new Book("The Monk Who Sold His Ferrari", "Harper SanFrancisco", "Robin Sharma", 156, 2));
		bookList.add(new Book("To Kill a Mockingbird", "J. B. Lippincott & Co.", "Harper Lee", 317, 3));
		bookList.add(new Book("Ikigai: The Japanese Secret to a Long and Happy Life", "Penguin Life", "Héctor García", 320, 4));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Title : ");
		String book = sc.nextLine();
		
		boolean bookAvailable = false;
		for (Book b: bookList)
		{
			if (b.equals(book))
			{	
				bookAvailable = true;
				System.out.println("Entered Book is available.");
				b.Details();
				
				System.out.println("Enter no of copies required");
				int n = sc.nextInt();
				
				if (b.equals(n))
				{
					System.out.println("Total cost of requested copies : "+ b.totalCost(n));
				}
				else
				{
					System.out.println("Required copies not available in stock");
				}
				break;
			}
		}
		if (!bookAvailable)
		{
			System.out.println("Entered Book is not available.");
		}
		
		
		
	}
}