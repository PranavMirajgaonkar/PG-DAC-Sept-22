import java.util.*;

public class Automobile
{
	private String make;
	private String type;
	private int maxSpeed;
	private double price;
	private double mileage;
	private String regNo;
	
	void setMake(String make)
	{
		this.make = make;
	}
	String getMake()
	{
		return this.make;
	}
	
	void setType(String type)
	{
		this.type = type;
	}
	String getType()
	{
		return this.type;
	}
	
	void setMaxSpeed(int maxSpeed)
	{
		this.maxSpeed = maxSpeed;
	}
	int getMaxSpeed()
	{
		return this.maxSpeed;
	}
	
	void setPrice(double price)
	{
		this.price = price;
	}
	double getPrice()
	{
		return this.price;
	}
	
	void setMilage(double mileage)
	{
		this.mileage = mileage;
	}
	double getMilage()
	{
		return this.mileage;
	}
	
	void setRegNo(String regNo)
	{
		this.regNo = regNo;
	}
	String getRegNo()
	{
		return this.regNo;
	}
	
	public static void main (String [] args)
	{
		Truck t = new Truck();
		t.setMake("Ashok Leyland");
		t.setType("Tipper");
		t.setMaxSpeed(100);
		t.setPrice(43.71);
		t.setMilage(3.5);
		t.setRegNo("MH 04 JE 9553");
		t.setCapacity(30);
		t.setHoodType("Rock and Scoop");
		t.setNoOfWheels(16);
		
		System.out.println("*************************************************");
		System.out.println("Truck details as follows");
		System.out.println("Truck Make : "+t.getMake());
		System.out.println("Truck Type : "+t.getType());
		System.out.println("Truck Hood Type : "+t.getHoodType());
		System.out.println("Truck Number of Wheels : "+t.getNoOfWheels());
		System.out.println("Truck Load Carrying Capacity : "+t.getCapacity()+" Meter Cube");
		System.out.println("Truck Max Speed : "+t.getMaxSpeed()+" KM/Hour");
		System.out.println("Truck Milage : "+t.getMilage()+" KMPL");
		System.out.println("Truck Price : "+t.getPrice()+" Lakh");
		System.out.println("Truck Registration Number : "+t.getRegNo());
		System.out.println("*************************************************");
		
		
		Car c = new Car();
		c.setMake("Maruti Suzuki");
		c.setType("Hatchback");
		c.setMaxSpeed(160);
		c.setPrice(7.75);
		c.setMilage(24.5);
		c.setRegNo("MH 04 JB 1424");
		c.setNoOfDoors(4);
		c.setSeatingCapacity(5);
		
		System.out.println("*************************************************");
		System.out.println("Car details as follows");
		System.out.println("Car Make : "+c.getMake());
		System.out.println("Car Type : "+c.getType());
		System.out.println("Car Number of Doors : "+c.getNoOfDoors());
		System.out.println("Car Seating Capacity : "+c.getSeatingCapacity());
		System.out.println("Car Max Speed : "+c.getMaxSpeed()+" KM/Hour");
		System.out.println("Car Milage : "+c.getMilage()+" KMPL");
		System.out.println("Car Price : "+c.getPrice()+" Lakh");
		System.out.println("Car Registration Number : "+c.getRegNo());
		System.out.println("*************************************************");
		
	}
}

class Truck extends Automobile
{
	double capacity;
	String hoodType;
	int noOfWheels;
	
	void setCapacity(double capacity)
	{
		this.capacity = capacity;
	}
	double getCapacity()
	{
		return this.capacity;
	}
	
	void setHoodType(String hoodType)
	{
		this.hoodType = hoodType;
	}
	String getHoodType()
	{
		return this.hoodType;
	}
	
	void setNoOfWheels (int noOfWheels)
	{
		this.noOfWheels = noOfWheels;
	}
	int getNoOfWheels()
	{
		return this.noOfWheels;
	}
}

class Car extends Automobile
{
	int noOfDoors;
	int seatingCapacity;
	
	void setNoOfDoors(int noOfDoors)
	{
		this.noOfDoors = noOfDoors;
	}
	int getNoOfDoors()
	{
		return this.noOfDoors;
	}
	
	void setSeatingCapacity(int seatingCapacity)
	{
		this.seatingCapacity = seatingCapacity;
	}
	double getSeatingCapacity()
	{
		return this.seatingCapacity;
	}
}