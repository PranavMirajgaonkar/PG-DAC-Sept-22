import java.io.*;
import java.util.*;

class Q3 
{
	static boolean areAnagram(char[] str1, char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2)
			return false;

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.next();
		System.out.println("Enter second String");
		String s2 = sc.next();
		
		char str1[] = s1.toCharArray();
		char str2[] = s2.toCharArray();
	
		if (areAnagram(str1, str2))
			System.out.println("The two strings are anagram of each other");
		else
			System.out.println("The two strings are not anagram of each other");
	}
}