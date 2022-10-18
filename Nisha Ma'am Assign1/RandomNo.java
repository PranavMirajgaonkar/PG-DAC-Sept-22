import java.util.Random;   

public class RandomNo  
{   
	public static void main(String args[])   
	{   
		  
		Random random = new Random();   
		 
		int x = random.nextInt(260);   
		  
		System.out.println("Randomly Generated Integers Value is : "+x);    
		  
	}   
}