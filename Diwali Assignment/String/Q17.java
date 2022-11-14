import java.util.*;

public class Q17
{
    private static void validShuffle(String s1, String s2, String result) 
	{
        String s3 = s1 + s2;
        StringBuffer s = new StringBuffer(s3);
        boolean flag = false;
        char[] ch = result.toCharArray();
        if (s.length() != result.length()) 
		{
            flag = false;
        } 
		else 
		{
            for (int i = 0; i < ch.length; i++) 
			{
                String temp = Character.toString(ch[i]);
                if (s3.contains(temp)) 
				{
                    s.deleteCharAt(s.indexOf(temp));
                    s3 = new String(s);
                    flag = true;
				} 
				else 
				{
                    flag = false;
                    break;
                }
            }
		}

        if (flag) 
		{
            System.out.println("It is a valid shuffle");
        } 
		else 
		{
            System.out.println("It is not a valid shuffle");
        }

    }
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.next();
		System.out.println("Enter second String");
		String s2 = sc.next();
		System.out.println("Enter result");
		String result = sc.next();

        validShuffle(s1, s2, result);

    }
}

