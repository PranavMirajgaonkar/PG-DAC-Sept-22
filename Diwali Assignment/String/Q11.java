import java.util.*;

class Q11
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.nextLine();
				
		str = str.trim();
		
		str = str.replaceAll("\\s", "%20");
		
		System.out.println(str);
	}
}
