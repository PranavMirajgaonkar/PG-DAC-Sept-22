
import java.io.IOException;
import java.util.*;

class Q11 
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String str = sc.next();
		
		byte[] bytes = str.getBytes();

		System.out.println(Arrays.toString(bytes));

		String string = new String(bytes);
	}
}
