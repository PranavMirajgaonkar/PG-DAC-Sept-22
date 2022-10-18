
public class DiffLoops
{
	public static void main(String[] args) 
	{
		for(int n = 20; n >= 1; n--)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		int num = 20;
		while(num >= 1)
		{
			System.out.print(num--+" ");
		}
		System.out.println();
		int no = 20;
		do
		{
			System.out.print(no--+" ");
		}
		while(no >= 1);
	}

}