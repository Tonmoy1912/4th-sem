/* Write a program that accepts radius of a circle and displays area of the circle. Declare a constant pi equals to 3.14 using OOP concept */

import java.util.Scanner;

class Circle{
    static final float pi=3.14f;
    private float radius;
    public Circle(float r){//creating constructor that set the radius
        radius=r;
        
    }
    public float getArea(){
        float area=pi*radius*radius;//calculating the area of the circle
        return area;
    }
}

public class Prob3 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius=(float)(sc.nextFloat());//taking input for radius
        Circle cir1=new Circle(radius);
        float area=cir1.getArea();
        System.out.println("The area of the circle is "+area);
        sc.close();
    }
}
