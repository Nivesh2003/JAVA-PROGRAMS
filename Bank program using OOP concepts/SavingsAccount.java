package main.bank;

//Inheritance
public class SavingsAccount extends BankAccount{
//new attribute
private double interestRate;

 public SavingsAccount(int accountNumber,double accountBalance,double interestRate){
    
super(accountNumber,accountBalance);
//super keyword (for accessing parent class members)

this.interestRate=interestRate; 

 }

 //Method to calcuate interest 
 //We already have a method calculateInterest
 @Override //Method overriding
 public void calculateInterest(){
    double interest = getBalance()*interestRate;
    System.out.println("Interest added :"+interest);
    System.out.printf("New balance = %f", getBalance()+interest);
 }
}