/* Design a BankAcct class with account number, balance and interest rate as attribute. Inrest rate is same for all account. Support must be there to initialize, change and display the interst rate. Also supports are to be there to return balance and calculate interest. */

import java.util.Scanner;

class BankAcct{
    private static float interestRate;
    private String accNo;
    private float balance;
    public static void setInterestRate(float rate){//for setting the interest rate
        interestRate=rate;
    }
    public void setData(String acc,float bal){// for setting data
        accNo=acc;
        balance=bal;
    }
    public void display(){// for displaying account details
        System.out.println("Account No: "+accNo+" Balance : "+balance+" Interest : "+getInterest());
    }
    public float getInterest(){// for calculating interest
        float interest=(balance*interestRate)/100;
        return interest;
    }
    public static void displayIntRate(){// for displaying interest rate
        System.out.println("The interest rate is "+interestRate);
    }
}


public class prob9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BankAcct arr[]=new BankAcct[2];
        System.out.println("Enter the Interest rate");
        float rate=(float)sc.nextFloat();
        BankAcct.setInterestRate(rate);
        for(int i=0;i<2;i++){//loop for setting data
            System.out.println("Enter the account no");
            String accNo=sc.next();
            System.out.println("Enter the balance");
            float bal=(float)sc.nextFloat();
            arr[i]=new BankAcct();
            arr[i].setData(accNo, bal);
        }
        BankAcct.displayIntRate();
        for(int i=0;i<2;i++){// loop for displaying account details
            arr[i].display();
        }
    }
}
