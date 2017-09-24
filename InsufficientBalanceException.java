package bank;
//by extending the class we can make the class as exception
public class InsufficientBalanceException extends Exception{
//extending in the class InsufficientBalanceException class
String message;//print the message
//creating constructor
public InsufficientBalanceException(){
	System.out.println("Exception constructor called");
//prints the message
	}
public InsufficientBalanceException(String message){
	this.message=message;
	System.out.println("Exception thrown with message"+getMessage());
	printStackTrace();
	//this is for printing the message
}
//printStackTrace-it prints a stack trace for this throwable object on the error output stream  that is value 
//of the filed system
}
