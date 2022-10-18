import java.util.Scanner;

public class OddEvenZero
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner (System.in);
        long value;
        int evenCount = 0, oddCount = 0, zeroCount = 0;

        System.out.print("Enter an number : ");
        value = scan.nextLong();

        while (value > 0)
        {
            if (value%10==0)
            {
                zeroCount++;
            }
			else if (value%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
               value = value / 10;
        }
        
		System.out.println();
        System.out.println("Zero: "+zeroCount+"\nEven: "+evenCount+"\nOdd:  "+oddCount+"\n\n");
    }
}

