
/*
    Design a student class with roll, name and score. Support must be there to set the score. Score is non-negative and cannot exceed 100. For invalid score an exception has to be raised. User of set score method will decide about the measures to deal with the exception.
*/


class MyException extends Exception{//creating user define exception
    public MyException(String s){
        super(s);
    }
}

class Student{
    private int roll;
    private double score;
    private String name;
    // public Student(int roll,double score,String name){
    //     this.roll=roll;
    //     this.name=name;
    //     this.score=score;
    // }
    public void setName(String name){
        this.name=name;
    } 
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setScore(double score){
        try{
            if(score>100){
                throw new MyException("Score is greater than 100");
                // throw new Exception();
            }
            else if(score<0){
                throw new MyException("Score is negative");
            }
            else{
                this.score=score;
            }
        }
        catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
    public void display(){
        System.out.println("Name: "+name+" Roll: "+roll+" Score: "+score);
    }
}

public class prob5 {
    public static void main(String[] args) {
        Student s=new Student();
        s.setName("Tonmoy Biswas");
        s.setRoll(10);
        s.setScore(-1);
        s.display();
    }
}
