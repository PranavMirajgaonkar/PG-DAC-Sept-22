import java.util.Scanner;

public class ReversedNo
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any No : ");
	
		int num = sc.nextInt(); 
		int reversed = 0;

		for(;num != 0; num /= 10) 
		{
		int digit = num % 10;
		reversed = reversed * 10 + digit;
		}
		
		System.out.print("Reversed Number of given No : " + reversed);
    }
    
}