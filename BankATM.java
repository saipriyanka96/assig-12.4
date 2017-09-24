package bank;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as bank

public class BankATM 
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//create class BAankATM
{
	int id;//these are bank attributes
	String bankName;
	double balance;
	double amount;
	public void BankATM()
	//this is default constructor
	//static is used for memory management
	//void is used to define the return type of the method
	//String[] args is actually an array of java.lang.String type and it's name is args here
		
	{
		id=1;
		bankName="abc";
		balance=1000;
		amount=0;
	}
	BankATM(double bal,int n,String abc,String xyz,double amt)
	{//parameterized constructor
		balance=bal;
		id=n;
	}
	public void deposit(double amount)
	{//creating a method to deposit
		balance=balance+amount;//adds the amount at deposit
		System.out.println("money is deposited successfully:"+balance);
	}
	public void withdraw(double amount) throws InsufficientBalanceException{
//in this withdraw method it will show exception when amount is less than 10000
		if(balance-amount<1000)
		{
			throw new InsufficientBalanceException("withdrawal failure is you have insufficient balance.your balance isRs."+amount);
		//handles the exception
		}
		else
		{
			balance=balance-amount;//shows amount after withdrawal
			System.out.println("money withdrawn:available balance is Rs.:"+balance);
		}
		/*the code is prone to exceptions is placed in the try block
		 *when exception occurs that exception occurred is handled by the 
		 *catch block associated with it
		 */
//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
				
	}
	

}
