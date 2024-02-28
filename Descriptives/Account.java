package Descriptives;

//A program that creates a class namely Account having fields as balance and acctno. The class also has methods:(i)to compute interest earned for
//year based on the passed rate-of-interest,(ii)to display account details.
//Add a method namely updateBalance() to the class that receives two values: balance amount(amt) and rate-of-interest(rate)and updates the balance 
//by adding the interest earned to it.
public class Account
{
    double balance;
    int acctno;
    void getValues(int acno,double bal)
    {
        acctno=acno;
        balance=bal;
    }
    double calcInterest(double rate,double bal)
    {
        double intr=(bal*rate*1)/100;
        return intr;
    }
    void updateBalance(double amt,double rate)
    {
        double intrst=calcInterest(rate,amt);
        System.out.println("Initial balance: "+amt);
        amt=amt+intrst;
        System.out.println("Interest earned: "+intrst);
        System.out.println("Updated balance: "+amt);
    }
    void display()
    {
        System.out.println("Account no. : "+acctno);
        System.out.println("Balance: "+balance);
    }
    public static void main(String args[])
    {
        Account ac1=new Account();
        ac1.getValues(1203,34000);
        ac1.updateBalance(34000,7.5);
        ac1.display();
    }
}