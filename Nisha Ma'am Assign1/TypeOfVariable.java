import java.util.Scanner;

public class TypeOfVariable
{
	static int ans; // Static variable
    public void sum(int num1, int num2) //method 
	{
    ans = num1 + num2;
	}
    
    public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);
		
		TypeOfVariable t = new TypeOfVariable(); //instance variable
        
        System.out.println("Enter the first number: ");
        int n1 = sc.nextInt(); // Local variable
        
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt(); // Local variable
        
        t.sum(n1,n2);
        
        System.out.println("The sum of "+n1+" and "+n2+" is "+ans);
        
    }    
}