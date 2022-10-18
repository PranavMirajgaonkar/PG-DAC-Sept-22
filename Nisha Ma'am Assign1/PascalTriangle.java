
import java.util.Scanner;

public class PascalTriangle
{
	public static void main (String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the row for pascal triangle: ");
		
		int rows=scan.nextInt();
		
		int count=1;
		
		for(int i=0; i<rows; i++)
		{
		   for(int j=rows; j>i; j--)
			{
				System.out.print(" ");
		    }
		   
		   count=1;
		   
		   for(int k=0; k<=i; k++)
		    {
				System.out.print(count+" ");
				
				count=count*(i-k)/(k+1);
		    }
		    
			System.out.println();

		}
	}
}