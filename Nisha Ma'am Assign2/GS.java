import java.util.Scanner;

public class GS
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your Basic Salary : ");
		float basic = sc.nextFloat();
		
		if (0<basic && basic<10000)
		{
			float gross = basic+basic*0.1f+basic*0.9f;
			System.out.print("Your Gross Salary is : "+gross);
		}
		else if (0<basic && basic>=10000)
		{
			float gross = basic+2000f+basic*0.98f;
			System.out.print("Your Gross Salary is : "+gross);
		}
		else
		{
			System.out.print("Please enter correct salary : ");
		}
	}
}