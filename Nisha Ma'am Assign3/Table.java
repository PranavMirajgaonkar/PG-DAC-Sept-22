import java.util.Scanner;

public class Table
{
	public static void main(String [] args)
	{
		System.out.print("Enter any number between 1 to 30 : ");
		//creat scanner object
		Scanner sc = new Scanner(System.in);
		// creat variable and read input
		int number = sc.nextInt();
		
		//print table
		if ( number >=1 && number<=30 )
		{
			for (int i=1; i<=10; i++)
			{
				System.out.println(number+" X "+i+" = "+number*i);
			}
		}
		else 
		{
			System.out.println("Given number is not between 1 to 20 ");
		}
		
	}
}