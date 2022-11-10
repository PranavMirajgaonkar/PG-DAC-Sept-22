import java.util.*;
import java.io.*;

public class Person
{
    int age;
	double weight, height;
    String name, address;
    String dob;

    Person( String name, int age, double weight, double height, String dob, String address) 
	{
        this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.dob = dob;
		this.address = address;
    }
	Person()
	{
	}
	
	void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name - ");
		name = sc.nextLine();
        System.out.println("Enter your Age - ");
		age = sc.nextInt();
        System.out.println("Enter your Weight - ");
		weight = sc.nextDouble();
        System.out.println("Enter your Height - ");
		height = sc.nextDouble();
		sc.nextLine();
        System.out.println("Enter your D.O.B.(DD/MM/YYYY) - ");
		dob = sc.nextLine();
        System.out.println("Enter your Address - ");
		address = sc.nextLine();
		
	}
    void display() 
	{
		System.out.println("\n*******************************************");
        System.out.println("Name - "+name );
        System.out.println("Age - "+age );
        System.out.println("Weight - "+weight );
        System.out.println("Height - "+height );
        System.out.println("D.O.B. - "+dob );
        System.out.println("Address - "+address );
    }

    public static void main(String[] args) 
	{
        Person p = new Person();

        Scanner sc = new Scanner(System.in);
		System.out.println("If you are Employee please insert 1 \nIf you are Student please insert 2");
		int input = sc.nextInt();
		
		if (input==1)
		{			
			System.out.println("If you are Technician please insert 1 \nIf you are Professor please insert 2");
			int in = sc.nextInt();
			if (in==1)
			{
				Technician t = new Technician();
				t.setDetails();
				t.display();
			}
			else if(in==2)
			{
				Professor pr = new Professor();
				pr.setDetails();
				pr.addCourse();
				pr.addAdvice();
				pr.removeCourse();
				pr.removeAdvice();
				pr.display();
			}	
			else
			{
				System.out.println("Please provide correct Input");
			}
		}
		else if (input==2)
		{
			student s = new student();
			
			s.setSubjects("Marathi");
			s.setSubjects("English");
			s.setSubjects("Hindi");
			s.setSubjects("Maths");
			s.setSubjects("Social Science");
			s.setSubjects("Science");
			
			s.setDetails();
			s.setMarks();
			s.display();
			s.calcGrade();
		}
		else
		{
			System.out.println("Please provide correct Input");
		}        
    }
}

class Employee extends Person
{
    int sal;
    String doj;
    String exp;
	
	void setDetails()
	{
		super.setDetails();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Salary - ");
		sal = sc.nextInt();
		sc.nextLine();
        System.out.println("Enter your DOJ(DD/MM/YYYY) - ");
		doj = sc.nextLine();
        System.out.println("Enter your Experience - ");
		exp = sc.nextLine();
	}
	
	
	void display()
	{
		super.display();
		System.out.println("Salary - "+sal );
        System.out.println("D.O.J. - "+doj );
        System.out.println("Experience - "+exp );
	}
}

class student extends Person
{
    int roll;
	ArrayList <String> listOfSubjects = new ArrayList <String>();
	
	Scanner sc = new Scanner(System.in);
	
	void setSubjects(String subject)
	{
		listOfSubjects.add(subject);
	}
	
	void setDetails()
	{
		super.setDetails();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Roll No - ");
		roll = sc.nextInt();
	}
	
	int marks[];
	
	void setMarks()
	{
		marks = new int[listOfSubjects.size()];
		
		for (int i = 0; i < listOfSubjects.size(); i++)
		{
			System.out.print("Type your marks for "+listOfSubjects.get(i)+ " : ");
			marks[i] = sc.nextInt();
		}
	}

    void calcGrade()
    {
        int i, sum = 0;
		double percentMarks = 0;
        for( i=0; i<marks.length; i++)
        {
            sum += marks[i];
        }
        
		percentMarks = (sum*100)/600;
		
		if (percentMarks >= 90)
        System.out.println("Grade : S ");
		else if (percentMarks >= 80)
        System.out.println("Grade : A ");
		else if (percentMarks >= 70)
        System.out.println("Grade : B ");
        else if (percentMarks >= 60)
        System.out.println("Grade : C ");
        else if (percentMarks >= 50)
        System.out.println("Grade : D ");
        else if (percentMarks >= 40)
        System.out.println("Grade : E ");
		else
        System.out.println("Grade : X ");
	
		
		System.out.println("*******************************************");
    }
	
	void display()
	{
		super.display();
		System.out.println("Roll No - "+roll );
	}
}

class Technician extends Employee
{
	void display()
	{
		super.display();
		System.out.println("*******************************************\n");
	}
}

class Professor extends Employee
{
    ArrayList <String> courses = new ArrayList <String>();
	
	Scanner sc = new Scanner(System.in);
	
	void addCourse()
    {
        for (int i = 0; i < courses.size(); i++)
		{
			System.out.println(courses.get(i));
		}
		
		System.out.print("Type your course name : ");
		courses.add(sc.nextLine());

    }
    
    ArrayList <String> advice = new ArrayList <String>();
	
	void addAdvice()
    {
        for (int i = 0; i < advice.size(); i++)
		{
			System.out.println(advice.get(i));
		}
		
		System.out.print("Type your advice : ");
		advice.add(sc.nextLine());
    }
    
	void removeCourse()
    {
        System.out.println("Type course name to remove : ");
		courses.remove(sc.nextLine());
    }
	
    void removeAdvice()
    {
        System.out.println("Type advice to remove : ");
		advice.remove(sc.nextLine());
    }
	
	void display()
	{
		super.display();
		for (String s:courses)
		{
			System.out.println("Your Teaching Course - "+s);
		}
		for (String s:advice)
		{
			System.out.println("Your best Advice to students - "+s);
		}
		System.out.println("*******************************************");
	}
}