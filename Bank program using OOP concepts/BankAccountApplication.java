package main.bank;
/**
  @author Nivesh_30
 **/
public class BankAccountApplication {
public static void main(String[] args) {
 /*   BankAccount acc1 = new BankAccount(701,40000);

    acc1.deposit_amount(14000);
    acc1.withdraw_amount(6090);
    System.out.println(acc1.getAccountNumber()); 

 SavingsAccount sacc1 = new SavingsAccount(123, 40000, 0.04);
 sacc1.deposit_amount(10000);
 sacc1.calculateInterest();
 */
//Polymorphism 
BankAccount account1 = new CurrentAccount(555, 50000,0.03);
BankAccount account2 = new SavingsAccount(430, 100000, 0.08);
account1.calculateInterest();
account2.calculateInterest(); //Methods specific to objects will be called
}
}
