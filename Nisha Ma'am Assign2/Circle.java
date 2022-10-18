import java.util.Scanner;

public class Circle
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter radius : ");
		int r = sc.nextInt();
		
		double area = 3.14*r*r;
		double circumference = 2*3.14*r;
		
		System.out.println("Area of the Circle : "+area);
		System.out.println("Circumference of the Circle : "+circumference);
		
	}
}