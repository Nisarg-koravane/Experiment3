/*
Java Program to Create Account with 1000 Rs Minimum Balance, Deposit Amount, Withdraw
Amount and Also Throws LessBalanceException.
It has a Class Called LessBalanceException Which returns the Statement that Says WithDraw
Amount(_Rs) is Not Valid.
It has a Class Which Creates 2 Accounts, Both Account Deposit Money and One Account Tries to
WithDraw more Money Which Generates a LessBalanceException Take Appropriate Action for the
Same.
 */

import java.util.Scanner;
class CreateAccount{

    int bal;

    public Experiment2(int bal) throws LessBalanceException {

        if(bal<1000)
            throw new LessBalanceException("Create " +bal+"Rs is Not Valid.");
        this.bal = bal;

    }

    public void deposit(int val){

        this.bal+=val;
        System.out.println("Deposit Successful");


    }


    public void withdraw (int val) throws LessBalanceException{

        if (this.bal-val<=1000)
            throw new LessBalanceException("WithDraw " +val+"Rs is Not Valid.");
        this.bal-=val;
        System.out.println("Withdraw Successful");
    }


}

class LessBalanceException extends Exception {

    public LessBalanceException(String msg) {
        super(msg);
    }
}
public class Account {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter balance for first account");
            CreateAccount a1 = new CreateAccount(sc.nextInt());
            System.out.println("Enter 1 to Deposit ,2 to Withdraw");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter Amount to deposit");
                    a1.deposit(sc.nextInt());
                    System.out.println("balace = "+ a1.bal);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw");
                    a1.withdraw(sc.nextInt());
                    System.out.println("balace = "+ a1.bal);
                    break;

            }


        }
        catch (LessBalanceException e) {
            System.out.print(e);
        }

        try {
            System.out.println("Enter balance for Second account");
            CreateAccount a2 = new CreateAccount(sc.nextInt());
            System.out.println("Enter 1 to Deposit ,2 to Withdraw");
            int ch = sc.nextInt();
            switch (ch){
                case 1:
                    System.out.println("Enter Amount to deposit");
                    a2.deposit(sc.nextInt());
                    System.out.println("balace = "+ a2.bal);
                    break;
                case 2:
                    System.out.println("Enter Amount to Withdraw");
                    a2.withdraw(sc.nextInt());
                    System.out.println("balace = "+ a2.bal);
                    break;

            }
        }
        catch (LessBalanceException e) {
            System.out.println(e);
        }
    }
}