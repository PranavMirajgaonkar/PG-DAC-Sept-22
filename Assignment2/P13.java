class P13
{
	public static void main ( String [] args)
	{
		for ( int i = 65; i<=69; i++)
		{
			for (int j = i; j<69; j++)
			{
				System.out.print(" ");	
			}
			for (int j = 65; j<=i; j++)
			{
				char c=(char)i;
				System.out.print(" " + c);
			}
		System.out.println ();	
		}
	}
	
}