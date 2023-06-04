/*
 * 2. There are number of accounts. Each account has account number (unique), name of the account and balance. Very frequent query is to provide the balance for an account. Other requirements are to verify the existence of an account, adding new account and displaying all accounts.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Account{
    private int account_number;
    private String account_name;
    private double balance;

    public Account(int number,String name,double bal){
        account_number = number;
        account_name = name;
        balance = bal;
    }

    public int getAccountNumber(){
        return account_number;
    }

    public String getAccountName(){
        return account_name;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(float bal){
        balance = bal;
    }

    public void display(){
        System.out.println("account number : "+account_number);
        System.out.println("account name : "+account_name);
        System.out.println("balance : "+balance);
    }
}

class AccountList{
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc){
        accounts.add(acc);
    }

    public boolean existanceAccounts(int accNumber){
        for(int i=0;i<accounts.size();i++){
            if(accNumber == accounts.get(i).getAccountNumber()){
                return true;
            }
        }
        return false;
    }

    public void displayAccounts(){
        for(int i=0;i<accounts.size();i++){
            accounts.get(i).display();
            System.out.println("\n");
        }
    }

    public double getBalance(int AccNum){
        for( Account a : accounts){
            if(a.getAccountNumber() == AccNum){
                return a.getBalance();
            }
        }
        return -1;
    }
}

public class Prob2{
    public static void main(String[] args) {
        Account acc1 = new Account(100200, "Protyay Ray", 100000);
        Account acc2 = new Account(100300, "Salman Khan", 200000);
        Account acc3 = new Account(100400, "Suresh Raina", 300000);
        
        AccountList acf = new AccountList();

        acf.addAccount(acc1);
        acf.addAccount(acc2);
        acf.addAccount(acc3);

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\n1.check Balance\n2.add account\n3.display all accounts\n4.Exit");
        
            System.out.println("\nenter your choice");
            int ch = sc.nextInt();

            // switch(ch){
                if(ch==1){ 
                         System.out.println("enter account number  : ");
                         int accNum = sc.nextInt();

                        if(acf.existanceAccounts(accNum)){
                            System.out.println("balance : "+acf.getBalance(accNum));
                        }
                        else{
                            System.out.println("account is not valid");
                        }

                }

                else if(ch==2){ 
                         System.out.println("enter the account number");
                         int n = sc.nextInt();
                         if(acf.existanceAccounts(n)){
                            // System.out.println("balance : "+acf.getBalance(accNum));
                            System.out.println("Enter a unique account number");
                            continue;
                        }
                         System.out.println("enter the name of account");
                         sc.nextLine(); 
                         String s = sc.nextLine();
                         System.out.println("enter the balance");
                         Double b = sc.nextDouble();

                         Account acc = new Account(n,s,b);
                         acf.addAccount(acc);
                }
                
                else if(ch==3){ 
                         System.out.println("displaying all the accounts : ");
                         
                         acf.displayAccounts();

                }
                else{
                    break;
                }
            // }   

        }while(true);
    
    }
}