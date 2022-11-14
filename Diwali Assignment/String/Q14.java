import java.util.*;

public class Q14
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
		String s[] = str.split(" ");
		String ans = "";
		
		for (int i = s.length - 1; i >= 0; i--)
		{
			ans += s[i] + " ";
		}
		System.out.println("Reversed String:");
		
		System.out.println(ans.substring(0,ans.length() - 1));
	}
}
