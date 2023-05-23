import java.util.Scanner;

class Instructor{
    private String name;
    private String phoneNo;
    public void setData(String name,String phoneNo){
        this.name=name;
        this.phoneNo=phoneNo;
    }
    public void display(){
        System.out.println("Name : "+name + " Phone No : "+phoneNo);
    }
}



class Textbook{
    private String title;
    private String author;
    private String publisher;
    public void setData(String title,String author,String publisher){
        this.title=title;
        this.author=author;
        this.publisher=publisher;
    }
    public void display(){
        System.out.println("Title : "+title + " Author : "+author+ " Publisher : "+publisher);
    }
}

class Course{
    private String name;
    private Instructor instructor;
    private Textbook textBook;
    public void setData(String name,Instructor instructor,Textbook textBook){
        this.name=name;
        this.instructor=instructor;
        this.textBook=textBook;
    }
    public void display(){
        System.out.println("Course Name : "+name);
        instructor.display();
        textBook.display();
    }
}



public class Prob10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the instructor name");
        String name=sc.nextLine();
        System.out.println("Enter the phone number");
        String phone=sc.nextLine();
        Instructor prof=new Instructor();
        prof.setData(name, phone);
        //prof.display();
        System.out.println("Enter the title of the book");
        String title=sc.nextLine();
        System.out.println("Enter the author name");
        String author=sc.nextLine();
        System.out.println("Enter the publisher name");
        String publisher=sc.nextLine();
        Textbook tb=new Textbook();
        tb.setData(title, author, publisher);
        //tb.display();
        System.out.println("Enter the course name");
        name=sc.nextLine();
        // System.out.println("Enter the instructor name");
        // String instName=sc.nextLine();
        // System.out.println("Enter the textbook name");
        // String tbName=sc.nextLine();
        Course cor=new Course();
        cor.setData(name, prof, tb);
        cor.display();
    }
}
