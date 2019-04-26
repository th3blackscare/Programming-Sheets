package ex23;

import java.util.Date;

/*
 * Author = Omar Sharif - Th3BlackScare
 */
public class Account {
    private int ID;
    private double Balance;
    private double annualInterestRate ;
    private Date dateCreated;
    Account(){
        ID = 0;
        Balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }
    Account(int id, double balance){
        ID = id;
        Balance = balance;
        dateCreated = new Date();
    }
    public void setID(int id){
        ID = id;
    }
    public int getID(){
        return ID;
    }
    public void setBalance(double balance){
        Balance = balance;
    }
    public double getBalance(){
        return Balance;
    }
    public void setAnnualInterestRate(double IntersetRate){
        annualInterestRate = IntersetRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public String getDate(){
        return dateCreated.toString();
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public double getMonthlyInterset(){
        return Balance*(getMonthlyInterestRate()/100);
    }
    public void withdraw(double m){
        if(m > Balance){
            System.out.print("your Balance is insufficient!");
        }
        else
            Balance = Balance-m;
    }
    public void deposit(double b){
        Balance = Balance+b;
    }
    public static void main(String[] args){
        Account m = new Account(1122,20000);
        m.setAnnualInterestRate(4.5);
        m.withdraw(2500);
        m.deposit(3000);
        System.out.print("ID: "+m.getID()+" Balance: "+m.getBalance()+" Interest: "+m.getAnnualInterestRate());
    }
}
