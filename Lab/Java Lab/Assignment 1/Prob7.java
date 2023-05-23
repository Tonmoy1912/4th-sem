/* Design and implement Student class with roll, name and score a attributes. It will have methos to set attributes(attribute values passed as arguments), display the attributes, copy(that copies the content of invoking object to another object passed as argument). Verify that methods are working properly. */

import java.util.Scanner;

class Student{
    private int roll;
    private String name;
    private float score;

    public void setAttributes(String name,int roll,float score){
        this.name=name;
        this.roll=roll;
        this.score=score;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Score : "+score);
    }

    public void copy(Student s2){
        s2.name=name;
        s2.roll=roll;
        s2.score=score;
    }
}

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        int roll;
        float score;
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("Enter the roll no");
        roll=sc.nextInt();
        System.out.println("Enter the score");
        score=(float)(sc.nextFloat());
        Student s1=new Student();
        Student s2=new Student();
        s1.setAttributes(name,roll,score);
        s1.copy(s2);
        System.out.println("The details of student s1");
        s1.display();
        System.out.println("The details of student s2");
        s2.display();
        sc.close();
    }
}
