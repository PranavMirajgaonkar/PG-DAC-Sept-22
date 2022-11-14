import java.util.*;

class Q8
{
	public static int count(String s, char c)
	{
		int res = 0;

		for (int i=0; i<s.length(); i++)
		{
			if (s.charAt(i) == c)
			res++;
		}
		return res;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.next();
		System.out.println("Enter any character");
		char c = sc.next().charAt(0);

		System.out.println("Character repeted "+count(str, c)+ " times");
	}
}
