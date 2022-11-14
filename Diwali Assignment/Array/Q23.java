import java.util.*;

class Q23 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter names of students (Enter 0 when completed)");
		
		while( sc.hasNext() )
		{
            String str = sc.nextLine();
            if( str.isEmpty())
			{
                break;
            }
            names.add(str);
        }

		String[] str = new String[names.size()];

		for (int i = 0; i < names.size(); i++) 
		{
			str[i] = names.get(i);
		}

		for (String k : str) 
		{
			System.out.println(k);
		}
	}
}
