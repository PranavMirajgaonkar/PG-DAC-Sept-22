import java.util.Scanner;
public class SI 
{  
	public static void main (String args[])  
	{   
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Principal Amount : ");
		float p = sc.nextFloat();
		System.out.print("Please enter Rate of Interest : ");
		float r = sc.nextFloat();
		System.out.print("Please enter Duration in Years : ");
		float t = sc.nextFloat();
	
		float si  = (p*r*t)/100;   
		
		System.out.println("Simple Interest is: " +si);  
		
    }
} 