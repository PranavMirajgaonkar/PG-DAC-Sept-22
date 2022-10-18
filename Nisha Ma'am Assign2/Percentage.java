import java.util.Scanner;

public class Percentage
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter marks for the 1st subject : ");
		double m1 = sc.nextDouble();
		System.out.print("Please enter marks for the 2nd subject : ");
		double m2 = sc.nextDouble();
		System.out.print("Please enter marks for the 3rd subject : ");
		double m3 = sc.nextDouble();
		System.out.print("Please enter marks for the 4th subject : ");
		double m4 = sc.nextDouble();
		System.out.print("Please enter marks for the 5th subject : ");
		double m5 = sc.nextDouble();
		
		double sum = m1+m2+m3+m4+m5;
		if (m1>=0 && m1<=100 && m2>=0 && m2<=100 && m3>=0 && m3<=100 && m4>=0 && m4<=100 && m5>=0 && m5<=100)
		{
			double percentage = sum*0.2;
			System.out.print("Percentage marks = "+percentage+" %");
		}
		else 
		{
			System.out.print("Please enter correct marks");
		}
	}
}