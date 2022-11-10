import java.util.*;

class Account
{
    long acNo;
    String holderName;
    float bal;

    void print() 
	{
        System.out.println("Account No : "+acNo);
        System.out.println("Account holders Name : "+holderName);
        System.out.println("Available Balance : "+bal);   
    }
}

class SavingsAccount extends Account
{
    float interestRate;
		
    float calcYearlyInterest()
    {
        return bal * (interestRate/100);
    }
	
	SavingsAccount (long acNo, String holderName, float bal, float interestRate)
	{
		this.acNo = acNo;
		this.holderName = holderName;
		this.bal = bal;
		this.interestRate = interestRate;
	}
    void print()
    {
        super.print();
        System.out.println("Interest for this year : "+calcYearlyInterest());
    }
}

class CurrentAccount extends Account
{
	CurrentAccount (long acNo, String holderName, float bal)
	{
		this.acNo = acNo;
		this.holderName = holderName;
		this.bal = bal;
	}
	
    void print()
    {
        super.print();
    }
}

public class Manager
{
	ArrayList<Account> account = new ArrayList<Account>();
	
	public static void main(String[] args) 
	{
        Manager m = new Manager();

        m.account.add(new SavingsAccount(1020001, "Ajit Prajapati", 54000f, 3.5f));
		m.account.add(new SavingsAccount(1020002, "Ajay Vishwakarma", 135000f, 3.5f));
		m.account.add(new CurrentAccount(2051001, "Pratap Industries", 113595f));
		m.account.add(new CurrentAccount(2051002, "Aarush Industries", 371489f));
		m.account.add(new CurrentAccount(2051003, "Niraj Book Store", 83216f));

		System.out.println("************************************************");
		
		for (Account ac: m.account)
		{

			ac.print();
			System.out.println("************************************************");
		}
    }
}