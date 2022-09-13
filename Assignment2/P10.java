class P10
{
	public static void main ( String [] args)
	{
		for ( int i = 69; i>=65; i--)
		{
			for (int j = i; j>65; j--)
			{
				System.out.print(" ");	
			}
			for (int j = i; j<=69; j++)
			{
				char c=(char)j;
				System.out.print(" " + c);
			}
		System.out.println ();	
		}
	}
	
}