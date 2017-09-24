package bank;
//Package is a grouping of related types providing access protection and name 
//space management
//create package name as bank

public class BAE {
//public keyword is used in the declaration of a class,method or 
//field;public classes,method and fields can be accessed by the 
//members of any class.
//class defines instance and class fields,methods and inner classes as
//well as specifying the interfaces the class implements and the 
//immediate superclass of the class
//created class name BAE
public static void main(String[] args)
//static is used for memory management
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
		
{
	BankATM A=new BankATM(10000,1,"PRIYA","HYD",10000);
	//creating objects which show details
	BankATM B=new BankATM(10000,2,"SANNI","HYD",20000);
	BankATM C=new BankATM(20000,3,"SAHITHI","HYD",10000);
	
	A.deposit(10000);//depositing the amount in priya's account 
	try
	{
//here the withdrawal throws an Exception with try catch showing withdrawal account
		A.withdraw(1000);
		B.withdraw(1000);
		C.withdraw(1000);
	}
	catch(InsufficientBalanceException e)
	//error occurs in output and shows insufficient balance
	/*the code is prone to exceptions is placed in the try block
	 *when exception occurs that exception occurred is handled by the 
	 *catch block associated with it
	 */
	{
		System.out.println("insufficent balance:");
		//system is final class
//out is a static member of system class and type printStream
//println is method of printStream class.ln means nextline
				
	}
}
}
