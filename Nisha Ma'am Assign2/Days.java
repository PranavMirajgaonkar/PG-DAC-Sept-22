import java.util.Scanner;
public class Days
{
	public static void main(String args[])
    {
        int d, year, week, day;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        d = sc.nextInt();
        year = d / 365;
        d = d % 365;
        System.out.println("No. of years: "+year);
        week = d / 7;
        d = d % 7;
        System.out.println("No. of weeks: "+week);
        day = d;
        System.out.println("No. of days: "+day);
    }
}