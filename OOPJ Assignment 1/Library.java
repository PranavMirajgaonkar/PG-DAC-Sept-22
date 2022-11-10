import java.util.*;


abstract class Publication 
{
    int noOfPages;
	float price;
	String pubName;
	
	abstract void setNoOfPages(int noOfPages);
	abstract void setPrice(float price);
	abstract void setPubName(String noOfPages);
	
    void print()
    {
        System.out.println("Publication Name : " + pubName);
        System.out.println("Price : " + price);
        System.out.println("No of Pages : " + noOfPages);
    }
}

class Book extends Publication
{	
	void setNoOfPages(int noOfPages)
	{
		this.noOfPages = noOfPages;
	}
	void setPrice(float price)
	{
		this.price = price;
	}
	void setPubName(String pubName)
	{
		this.pubName = pubName;
	}
	
    Book(String pb, float p, int n )
    {
        pubName = pb;
        price = p;
        noOfPages = n;
    }
}

class Journal extends Publication
{
	void setNoOfPages(int noOfPages)
	{
		this.noOfPages = noOfPages;
	}
	void setPrice(float price)
	{
		this.price = price;
	}
	void setPubName(String pubName)
	{
		this.pubName = pubName;
	}
	
    Journal(String pb, float p, int n )
    {
        pubName = pb;
        price = p;
        noOfPages = n;
    }
}

public class Library
{

    public static void main(String[] args) 
	{
		ArrayList<Publication> publication = new ArrayList<Publication>(); 
		
		publication.add(new Book("Mauj Prakashan", 200, 356));
		publication.add(new Book("Sahitya Prakashan", 180, 280));
		publication.add(new Book("Kaivalya Books", 150, 200));
		publication.add(new Journal("IIT", 350, 745));
		publication.add(new Journal("IBWS", 200, 385));
		
		for(Publication s : publication)
		{
			s.print();
		}
	}
}