public class CalFact
{
    public static void main(String args[]) 
	{
        int n;
        int f = 1;
        int argsLength = args.length;
        if(argsLength==1) 
		{
            n = Integer.parseInt(args[0]);
            for(int count=1;count<=n;count++) 
			{
                f = f*count;
			}
				System.out.println("Factorial of "+n+" is: "+f);	
        }
        else if(argsLength>1) 
		{
            System.out.println("More than one number is entered...");
        }
        else 
		{
            System.out.println("No arguments entered...");
        }
    }
}