import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number upto which you have to print Fibonacci Series : ");
		int n = sc.nextInt();
		int firstTerm = 0, secondTerm = 1;
        
		System.out.println("Fibonacci Series Upto " + n + ": ");
    
		while (firstTerm <= n) 
		{
			System.out.println(firstTerm);

			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}