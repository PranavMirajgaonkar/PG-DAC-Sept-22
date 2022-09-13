class P34
{
	public static void main ( String [] args)
	{
		for (int i = 1; i<=5; i++)
		{
			if ( i==1 || i==5)
			{
			for ( int j = 5; j<=i; j--)
			{
				System.out.print("*");
			}
			}
			else
			{
				for (int j = 5; j<=i; j--)
				{
					if ( j==5 || j==i)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}