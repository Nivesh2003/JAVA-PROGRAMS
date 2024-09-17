package main.bank;

public abstract class BankAccount {

    private int accountNumber; //Private modifiers for Encapsulation
    private double accountBalance; //Sensitive data should be kept hidden

    //Constructor
    public BankAccount(int accountNumber,double accountBalance){
        //this keyword
        this.accountNumber=accountNumber;
        this.accountBalance=accountBalance;
    }
        //Getters
     public int getAccountNumber(){
        return accountNumber;
        }
    public double getBalance(){
        return accountBalance;
    }
    
    //Deposit
    public void deposit_amount(double amount){
        if(amount>0){
            accountBalance+=amount;
            System.out.println("Amount deposited. Balance = "+accountBalance);
            
        }
        else{
            System.out.println("Invalid amount");
        }

    }
    //Withdraw
     public void withdraw_amount(double amount){
        if(amount>0 && amount<=accountBalance){
            accountBalance-=amount;
            System.out.println("Amount withdrawn. Balance = "+accountBalance);
            
        }
        else{
            System.out.println("Invalid amount");
        }

    }
    public void check_balance(){
        System.out.println("Current balance: "+accountBalance);
    }

//Method to calculate interest for normal accounts
public abstract void calculateInterest();
}