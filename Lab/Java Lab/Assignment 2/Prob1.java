
/* Each customer of a bank has costomer id,name,and current loan amount and phone number. One can change the attributes like name, phone number. A customer may ask for loan of certain amount. It is granted provided the sum of current loan amount and asked amount does not exceed credit limit (fixed amount for all customenr). Acustomer may be a privileged amount. For such customers credit limit is heigher. Once a loan is sanctioned necessary updates should be made. Any type of customer should be able to dind his credit limit, current loan amount and amount of loan he can seek.@interface
 * 
 * Design and implement the classes.
 */

import java.util.Scanner;

class Acc{
    private static int id=1;
    private int cusId;
    private String name;
    private double currentLoan;
    private String phone;
    private static double limit;
    private static double preLimit;
    boolean isPrevi;

    public static void setLimit(double l){
        limit=l;
    }

    public static void setPreLimit(double l){
        preLimit=l;
    }

    public Acc(String name,String phone,boolean t){
        this.isPrevi=t;
        this.name=name;
        this.phone=phone;
        cusId=id++;
        currentLoan=0;
        System.out.println("Account is created with id "+cusId);
    }

    public void setName(String name){
        this.name=name;
    }

    public void setPhone(String phone){
        this.phone=phone;
    }

    public void recLoan(double l){
        double sum=currentLoan+l;
        if(isPrevi){
            if(sum>preLimit){
                System.out.println("Loan is not sanctioned");
            }
            else{
                currentLoan=sum;
                System.out.println("Loan is sanctioned");
            }
        }
        else{
            if(sum>limit){
                System.out.println("Loan is not sanctioned");
            }
            else{
                currentLoan=sum;
                System.out.println("Loan is sanctioned");
            }
        }
    }

    public void display(){
        System.out.print("Id :"+cusId+" Name: "+name+" Phone : "+phone+" CurrentLoan : "+currentLoan+" Previleged Accont: " );
        if(isPrevi){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

}

class Bank{
    private int i=0;
    private int n;
    private Acc[] arr;
    public Bank(int n){
        this.n=n;
        arr= new Acc[n];
    }
    public void addAcc(){
        if(i==n){
            System.out.println("The capacity is full");
            return ;
        }
        Scanner sc=new Scanner(System.in);
        String name,phone;
        boolean t;
        int in;
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the phone no");
        phone=sc.next();
        System.out.println("Is this a previleged account?1(for yes)/0(for no)");
        in=sc.nextInt();
        if(in==1){
            t=true;
        }
        else{
            t=false;
        }
        arr[i++]=new Acc(name,phone,t);
       // sc.close();
    }

    public void recLoan(int id){
        int j=id-1;
        if(j<0||j>=i){
            System.out.println("The id is not present");
            return ;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the requested loan amount");
        double loan=sc.nextDouble();
        arr[j].recLoan(loan);
       // sc.close();
    }

    public void setName(int id){
         int j=id-1;
        if(j<0||j>=i){
            System.out.println("The id is not present");
            return ;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the new name");
        String name=sc.next();
        arr[j].setName(name);
        //sc.close();
    }

    public void setPhone(int id){
         int j=id-1;
        if(j<0||j>=i){
            System.out.println("The id is not present");
            return ;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the new phone no");

        String phone=sc.next();
        arr[j].setPhone(phone);
       // sc.close();
    }

    public void displayAcc(int id){
         int j=id-1;
        if(j<0||j>=i){
            System.out.println("The id is not present");
            return ;
        }
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the new phone no");
        // String phone=sc.next();
        arr[j].display();
        // sc.close();
    }

    public void display(){
        System.out.println("The account details are:");
        for(int j=0;j<i;j++){
            arr[j].display();
        }
    }

}

class Prob1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the capacity of the bank");
        n=sc.nextInt();
        Bank b=new Bank(n);
        double l;
        System.out.println("Enter the loan limit ");
        l=sc.nextDouble();
        Acc.setLimit(l);
        System.out.println("Enter the loan limit for previleged account");
        l=sc.nextDouble();
        Acc.setPreLimit(l);
        int c;
        while(true){
            System.out.println("Choose:");
            System.out.println("1.Add account");
            System.out.println("2.Set new name");
            System.out.println("3.Set new phone no");
            System.out.println("4.Request for loan");
            System.out.println("5.Display an account details");
            System.out.println("6.Show all account details");
            System.out.println("7.Exit");
            c=sc.nextInt();
            if(c==1){
                b.addAcc();
            }
            else if(c==2){
                int id;
                System.out.println("Enter the id");
                id=sc.nextInt();
                b.setName(id);
            }
            else if(c==3){
                int id;
                System.out.println("Enter the id");
                id=sc.nextInt();
                b.setPhone(id);
            }
            else if(c==4){
                int id;
                System.out.println("Enter the id");
                id=sc.nextInt();
                b.recLoan(id);
            }
            else if(c==5){
                int id;
                System.out.println("Enter the id");
                id=sc.nextInt();
                b.displayAcc(id);
            }
            else if(c==6){
                // int id;
                // System.out.println("Enter the id");
                // id=sc.nextInt();
                b.display();
            }
            else {
                break;
            }
        }
        sc.close();
    }
}