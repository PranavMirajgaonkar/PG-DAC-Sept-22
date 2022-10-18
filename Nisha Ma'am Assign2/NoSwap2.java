import java.util.Scanner;
public class NoSwap2
{
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number : ");
		float first = sc.nextFloat();
		System.out.print("Enter Second number : ");
		float second = sc.nextFloat();

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        first = first+second;
        second = first-second;
		first = first-second;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}