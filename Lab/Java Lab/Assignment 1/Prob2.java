
/* Write a program that accepts number of command line parameteres and displays the parameters and count of such */


public class Prob2 {
    public static void main(String[] args) {
        int count=args.length;//getting the number of parameters
        System.out.println("The number of parameters is "+count);
        System.out.println("The parameters are :");
        for(int i=0;i<count;i++){// iterating over the parameters and printing them
            System.out.println(args[i]);
        }
    }
}
