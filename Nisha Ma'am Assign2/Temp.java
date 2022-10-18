import java.util.Scanner;
public class Temp 
{  
	public static void main (String args[])  
    { 
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Tempreture in Fahrenheits : "); 
        float fahrenheit = sc.nextFloat();  
        float celsius  = ((fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+celsius);  
    }
}  