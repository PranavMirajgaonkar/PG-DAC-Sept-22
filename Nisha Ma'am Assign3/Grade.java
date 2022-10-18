import java.util.Scanner;
public class Grade
{
	public static void main ( String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print( "Enter your % marks : ");
		double marks = sc.nextDouble();
		
		String grade = "";
		
		if (100>=marks&&marks>=75)
		{
			grade="A";	
		}
		else if (75>marks&&marks>=60)
		{
			grade="B";
		}
		else if (60>marks&&marks>=45)
		{
			grade="C";
		}
		else if (45>marks&&marks>=35)
		{
			grade="D";
		}
		else if (marks<35)
		{
			grade="F";
		}
		
		switch (grade)
		{
			case "A" : 
			System.out.println("You have acheived First Class with Distinction !! Congratulations ");
			break;
			
			case "B" : 
			System.out.println("You have acheived First Class !! Congratulations ");
			break;
			
			case "C" : 
			System.out.println("You have acheived Second Class !! Congratulations ");
			break;
			
			case "D" : 
			System.out.println("You have acheived Pass Class !! Congratulations ");
			break;
			
			case "F" : 
			System.out.println("You have failed the Exam");
			break;
			
			default : 
			System.out.println(" Please enter correct marks ! Don't be oversmart");
			break;
		}
	}
}