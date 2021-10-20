/*
	Name               Sayan Sikder
	Roll No.           2019PGCACA50

Program 1

Class : Account
Members: accno, name, type, balance
Methods: constructors, displayAcDetails()

*/


package Program1;
import java.util.*;
class Account
{
	String accno,name,acc_type;
	double balance;
	Account()
	{
		accno    = "1234565678";
		name     = "billa";
		acc_type = "Saving Account";
		balance  =  134565.55;
	}
	Account(String ano, String nm, String type, double bal)
	{
		accno    = ano;
		name     = nm;
		acc_type = type;
		balance  = bal;
	}
	void displayDetails()
	{
		System.out.println("Account Details  :: ");
		System.out.println("Account Number   :  " + accno);
		System.out.println("Name             :  " + name);
		System.out.println("Account Type     :  " + acc_type);
		System.out.println("Account Balance  :  " + balance);
	}
}


/*

Class : SavingAccount (inherits Account)
Members : minbal, withdrawlimit, interest
Methods: consturctors, displayAcDetails(), deposit(), withdraw()

*/

class SavingAccount extends Account
{
	double minbal,widrawlimit,interest;
	Account A = new Account();
	SavingAccount()
	{
		A.accno	       =  "2324635654";        
		A.name         =  "P.J.Rao"; 
		A.acc_type     =  "Saving Account";    
		A.balance      =  360007.4;
		minbal         =  1000.00;
		widrawlimit    =  50000.00;
		interest       =  2.75;	   
	}
	SavingAccount(String ANo, String N, String AT, double Bal, double mbal, double WL, double I)
	{
		super(ANo, N, AT, Bal);
		minbal         =  mbal;
		widrawlimit    =  WL;
		interest       =  I;	   	
	}
	void displayAcDetails()
	{
		A.displayDetails();
		System.out.println("Minimum Balance  :  " + minbal);
		System.out.println("Withdraw Limit   :  " + widrawlimit);
		System.out.println("Interest         :  " + interest);
	}
	void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ammount you want to Deposit   :  " );
		double Ammount = sc.nextDouble();
		A.balance += Ammount;
	}
	void widraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ammount you want to Withdraw  :  " );
		double Ammount = sc.nextDouble();
		if(Ammount > widrawlimit)
			System.out.println("Daily Withdraw Limit is  :  " + widrawlimit);
		else
			A.balance -= Ammount;
	}
}



/*

Class: CurrentAccount (inherits Account)
Members : widrawlimit, noofTxperday, interest
Methods: consturctors, displayAcDetails(), deposit(), withdraw()

*/

class CurrentAccount extends Account
{
	double widrawlimit,interest;
	int noofTxperday;
	Account A = new Account(); 
	CurrentAccount()
	{
		A.accno	       =  "534659990344";        
		A.name         =  "P.V.Swami"; 
		A.acc_type     =  "Current Account";    
		A.balance      =  2300.67;
		widrawlimit    =  10000.00;
		noofTxperday   =  2;
		interest       =  7.7;
	}
	CurrentAccount(String ANo, String N, String AT, double Bal, double WL, int NTPD, double I)
     	{
		super(ANo, N, AT, Bal);
		widrawlimit    =  WL;
		noofTxperday   =  NTPD;
		interest       =  I;	   	
	}
	void displayAcDetails()
	{
		A.displayDetails();
		System.out.println("Withdraw Limit   :  " + widrawlimit);
		System.out.println("No of Tax Per Day:  " + noofTxperday);
		System.out.println("Interest         :  " + interest);
	}
	void deposit()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ammount you want to Deposit   :  " );
		double Ammount = sc.nextDouble();
		A.balance += Ammount;
	}
	void widraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ammount you want to Widraw  :  " );
		double Ammount = sc.nextDouble();
		if(Ammount > widrawlimit)
			System.out.println("Daily Widraw Limit is  :  " + widrawlimit);
		else
			A.balance -= Ammount;
	}
}



/*

Main 	

*/
public class Program_1
{
	public static void main(String args[]) 
	{
		Scanner        sc  = new Scanner(System.in);
		Account         A  = new Account();
		SavingAccount  SA  = new SavingAccount();
		CurrentAccount CA  = new CurrentAccount();
		int choice;
		while(true)
		{
			System.out.println("1. Show the Account");
			System.out.println("2. Show the Saving Account");
			System.out.println("3. Show the Current Account");
			System.out.println("4. Deposite in Saving Account");
			System.out.println("5. Widraw form Saving Account");
			System.out.println("6. Deposite in Current Account");
			System.out.println("7. Widraw form Current Account");
			System.out.println("8. Exit");
			System.out.println("Enter Your Choice  :  ");
			choice  = sc.nextInt();
			switch(choice)
			{
                		case 1:
                    			System.out.print("\n");
                    			A.displayDetails();
                    			System.out.println("\n");
                    			break;
                		case 2:
                    			System.out.print("\n");
                    			SA.displayAcDetails();
                    			System.out.println("\n");
                    			break;
                		case 3:
                    			System.out.print("\n");
                    			CA.displayAcDetails();
                    			System.out.println("\n");
                    			break;
				case 4 :
					System.out.print("\n");
                    			SA.deposit();
					System.out.println("\n");
					break;
				case 5 :
					System.out.print("\n");
                    			SA.widraw();
					System.out.println("\n");
					break;
				case 6 :
					System.out.print("\n");
                    			CA.deposit();
					System.out.println("\n");
					break;
				case 7 :
					System.out.print("\n");
                    			CA.widraw();
					System.out.println("\n");
					break;
                		case 8 :
                    			System.exit(0);
                   	 		break;
                		default: 
					System.out.println("Wrong Choice");
			}
		} 
	}
}