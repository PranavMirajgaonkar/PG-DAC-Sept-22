import java.util.*;

class Q5
{
	public static boolean onlyDigits(String str, int n)
	{
		for (int i = 0; i < n; i++) 
		{
			if (str.charAt(i) < '0'|| str.charAt(i) > '9') 
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.next();
		int len = str.length();

		System.out.println(onlyDigits(str, len));
	}
}
