import java.util.*;

class Q21
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter names of students");
		String str = sc.nextLine();

		List names = Arrays.asList(str);

		System.out.println(names);
	}
}
