/*  Write a program to accept two short integers from user and display the sum */


import java.util.Scanner;

class Prob1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//cerating an instances of Scanner object for input purpose
        short a,b;
        System.out.println("Enter the first short integer");
        a=sc.nextShort();// taking input of the first integer
        System.out.println("Enter the scecond short integer");
        b=sc.nextShort();//taking input of the second integer
        short sum=(short)(a+b);//calculating a+b and store that into sum variable
        System.out.println("The sum of the two short integers a+b is "+sum);// printing the value of sum
        sc.close();
    }
}

