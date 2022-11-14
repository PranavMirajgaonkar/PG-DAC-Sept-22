import java.lang.*;
import java.util.*;

class Test
{	
	static String name;
	static String cityName;
	static String stateName;
	
	Test()
	{	
	
	}
	
	Test(String name, String cityName, String stateName)
	{	
		this.name = name;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	
	static void printData()
	{		
		System.out.println("Your name is : "+name);
		System.out.println("You live in : "+cityName);
		System.out.println("You are from : "+stateName);
	}
}

class Q24
{	
	public static void main(String args[])
	{		
		Test t1 = new Test("Pranav", "Thane", "Maharashtra");
		t1.printData();
	}
}