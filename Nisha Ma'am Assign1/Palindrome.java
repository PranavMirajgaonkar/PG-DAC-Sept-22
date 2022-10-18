import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter any no : ");
		int num = sc.nextInt();
		int originalNum = num;
		int reversedNum = 0;
		
		while (num != 0) 
		{
			int remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}
    
		if (originalNum == reversedNum) 
		{
			System.out.println(originalNum + " is Palindrome.");
		}
    
		else 
		{
			System.out.println(originalNum + " is not Palindrome.");
		}
	}
}
