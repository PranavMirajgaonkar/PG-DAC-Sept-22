class P17
{
	public static void main ( String [] args)
	{
		int i, j, num = 1;
		for ( i = 1; i<=5; i++)
		{
			for ( j = 1 ; j<i+1; j++)
			{
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}
}