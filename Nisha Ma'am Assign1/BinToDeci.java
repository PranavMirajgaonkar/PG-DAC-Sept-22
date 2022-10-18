import java.util.Scanner;

public class BinToDeci
{
	public static void main(String[] args) 
	{
    Scanner sc = new Scanner(System.in);
	System.out.print("Please enter binary no : ");
    String binary = sc.nextLine();
    
    int decimal = Integer.parseInt(binary, 2);
	
    System.out.println(binary + " in binary = " + decimal + " in decimal.");
	
	}
}
