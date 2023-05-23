/* Add constructors in the Student class of earlier problem so that objects can be created with i)roll only, ii)roll and name only, iii)roll, name and score, iv)no value. Also include a copy constructo. Check whether constructors are working or not. Verify, copy constructor results into deep copy or not. */

import java.util.Scanner;

class Student{
    private int roll;
    private String name;
    private float score;

    public Student(int roll){
        this.roll=roll;
    }

    public Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    public Student(int roll,String name,float score){
        this.name=name;
        this.roll=roll;
        this.score=score;
    }

    public Student(){

    }

    public Student(Student s2){
        this.name=s2.name;
        this.roll=s2.roll;
        this.score=s2.score;
    }

    // public void setAttributes(String name,int roll,float score){
    //     this.name=name;
    //     this.roll=roll;
    //     this.score=score;
    // }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll : "+roll);
        System.out.println("Score : "+score);
    }

    // public void copy(Student s2){
    //     s2.name=name;
    //     s2.roll=roll;
    //     s2.score=score;
    // }
    
}


public class Prob8 {
    
}
