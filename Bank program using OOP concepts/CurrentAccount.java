package main.bank;

public class CurrentAccount extends BankAccount {
    private double interestRate;
    public CurrentAccount(int accountNumber,double accountBalance,double interestRate){
    super(accountNumber,accountBalance);
    this.interestRate=interestRate;
    }
   @Override
   public void calculateInterest(){
    double interest = getBalance()*interestRate;
    System.out.println("Interest added :"+interest);
    System.out.printf("New balance = %f", getBalance()+interest);
 }

}
