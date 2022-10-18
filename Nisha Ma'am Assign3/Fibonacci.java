public class Fibonacci
{
	public static void main(String ar[])
	{
		int i=0, j=1, k=0;
		int n=Integer.parseInt(ar[0]);

		System.out.print(i+" "+j);

		for(int m=1;m<n-1;m++)
		{
			k=i+j;
			i=j;
			j=k;

			System.out.print(" "+k);
		}
	}
}