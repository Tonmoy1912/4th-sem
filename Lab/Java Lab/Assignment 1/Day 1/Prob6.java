/* Write a program where class contains void show(int) to display the argument passed. Call the function once with short ans actual paramenter and again double as actual parameter. Add another function as void ahow(double). Reapeat the calls. Observe the outcomes in each case. */

public class Prob6 {

    static void show (int a){
        System.out.println("function with int parameter is called and the value of the parameter is "+a);
    }

    static void show (double a){
        System.out.println("function with double parameter is called and the value of the parameter is "+a);
    }
    public static void main(String[] args) {
        int i=1;
        short s=2;
        double d=3;
        show(i);
        show(s);
        show(d);
    }
}
