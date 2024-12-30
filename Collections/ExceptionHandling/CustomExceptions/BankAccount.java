package Collections.ExceptionHandling.CustomExceptions;

import javax.naming.InsufficientResourcesException;

public class BankAccount {
    private double balance;
    public BankAccount(double initialBalance){
        balance=initialBalance;
    }
    public void withdraw(double amount) throws InsufficientResourcesException{
        if(amount>balance){
            throw new InsufficientResourcesException("Insufficient Bank Balance ");
        }else{
        balance-=amount;
        System.out.println("Withdrawl successful and New Balance is "+balance);
        }


    }
    public static void main(String[] args){
        BankAccount b=new BankAccount(20000);
        try{
            b.withdraw(15000);

        }
        catch(InsufficientResourcesException e){
            System.out.println("Caught Exception "+e.getMessage());
        }
        finally{
            System.out.println("Operation successfull");
        }
    }
}
