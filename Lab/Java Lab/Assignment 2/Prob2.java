/*
 * For every person in ans institute details like name, address (consists of premises number, street, city, pin and state) , phone number, e-mail id are maintained. A person is either a student or a faculty. For student roll number amd course of study are also be maintained. For faculty employee id, department and specialisation are to be stored. One should be able to view the object details and set the attributes. For address, one should be able to view the object details and set the attributes. For address, one may change it partially depending on the choice. Design and implement the classes.
*/


import java.util.Scanner;

import javax.swing.border.LineBorder;

import java.util.ArrayList;

class Address{
    private String premisesNumber;
    private String  street;
    private String city;
    private String  pin;
    private String state;
    public Address(String premisesNumber,String street,String city,String pin,String state){
            this.premisesNumber=premisesNumber;
            this.street=street;
            this.city=city;
            this.pin=pin;
            this.state=state;
    }
    public void setPremisesNumber(String premisesNumber){
        this.premisesNumber=premisesNumber;
    }
    public void setStreet(String street){
        this.street=street;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setPin(String pin){
        this.pin=pin;
    }
    public void setState(String state){
        this.state=state;
    }
    public void display(){
        System.out.println("Premises No: "+premisesNumber+" Street: "+street+" City: "+city+" Pin: "+pin+" State: "+state);
    }
}

class Person{
    private String name;
    public Address add;
    private String phone;
    private String email;
    public Person(String name,Address add,String phone,String email){
        this.name=name;
        this.add=add;
        this.phone=phone;
        this.email=email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phone);
        System.out.println("Email: "+email);
        add.display();
    }
}

class Student extends Person{
    private int roll;
    private String course;
    public Student(String name,Address add,String phone,String email,int roll,String course){
        super(name,add,phone,email);
        this.roll=roll;
        this.course=course;
    }
    public int getRoll(){
        return roll;
    }
    public void setName(String name){
        super.setName(name);
    }
    public void setPhone(String phone){
        super.setPhone(phone);
    }
    public void setEmail(String email){
        super.setEmail(email);
    }
    public void setRoll(int roll){
        this.roll=roll;
    }
    public void setCourse(String course){
        this.course=course;
    }
    public void display(){
        super.display();
        System.out.println("Category: Student");
        System.out.println("Roll no: "+roll);
        System.out.println("Course: "+course);
    }
}

class Faculty extends Person{
    private int id;
    private String department;
    private String specialization;
    public Faculty(String name,Address add,String phone,String email,int id,String department,String specialization){
        super(name,add,phone,email);
        this.id=id;
        this.department=department;
        this.specialization=specialization;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        super.setName(name);
    }
    public void setPhone(String phone){
        super.setPhone(phone);
    }
    public void setEmail(String email){
        super.setEmail(email);
    }
    public void setId(int id){
        this.id=id;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setSpecialization(String specialization){
        this.specialization=specialization;
    }
    public void display(){
        super.display();
        System.out.println("Category: Faculty");
        System.out.println("Id: "+id);
        System.out.println("Department: "+department);
        System.out.println("Specialization: "+specialization);
    }
}

class Library{
    ArrayList<Student> studentArr;
    ArrayList<Faculty> facultyArr;
    public Library(){
        studentArr=new ArrayList<Student>();
        facultyArr=new ArrayList<Faculty>();
    }
    public void addStudent(){
        Scanner sc=new Scanner(System.in);
        String name,phone,email,premisesNumber,street,city,pin,state;
        int roll;
        String course;
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("phone");
        phone=sc.nextLine();
        System.out.println("Enter the email");
        email=sc.nextLine();
        System.out.println("Enter the premises no");
        premisesNumber=sc.nextLine();
        System.out.println("Enter the street");
        street=sc.nextLine();
        System.out.println("Enter the city");
        city=sc.nextLine();
        System.out.println("Enter the Pin");
        pin=sc.nextLine();
        System.out.println("Enter the state");
        state=sc.nextLine();
        System.out.println("Enter the roll no");
        roll=sc.nextInt();
        System.out.println("Enter the course");
        course=sc.nextLine();
        Address add=new Address(premisesNumber, street, city, pin, state);
        Student s1=new Student(name, add, phone, email, roll, course);
        studentArr.add(s1);
    }

    public void addFaculty(){
        Scanner sc=new Scanner(System.in);
        String name,phone,email,premisesNumber,street,city,pin,state;
        int id;
        String department;
        String specialization;
        System.out.println("Enter the name");
        name=sc.nextLine();
        System.out.println("phone");
        phone=sc.nextLine();
        System.out.println("Enter the email");
        email=sc.nextLine();
        System.out.println("Enter the premises no");
        premisesNumber=sc.nextLine();
        System.out.println("Enter the street");
        street=sc.nextLine();
        System.out.println("Enter the city");
        city=sc.nextLine();
        System.out.println("Enter the Pin");
        pin=sc.nextLine();
        System.out.println("Enter the state");
        state=sc.nextLine();
        System.out.println("Enter the roll no");
        id=sc.nextInt();
        System.out.println("Enter the department");
        department=sc.nextLine();
        System.out.println("Enter the specialization");
        specialization=sc.nextLine();
        Address add=new Address(premisesNumber, street, city, pin, state);
        Faculty f1=new Faculty(name, add, phone, email, id, department,specialization);
        facultyArr.add(f1);
    }
    public void displayStudentList(){
        int n=studentArr.size();
        System.out.println("Student list:");
        for(int i=0;i<n;i++){
            studentArr.get(i).display();
        }
    }
    public void displayFacultyList(){
        int n=facultyArr.size();
        System.out.println("Faculty list");
        for(int i=0;i<n;i++){
            facultyArr.get(i).display();
        }
    }
    public void setName(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            //sc.next();
            roll=sc.nextInt();
           // sc.next();
        //    sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the name");
                    sc.nextLine();
                    String name=sc.nextLine();
                    studentArr.get(i).setName(name);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            //sc.next();
            sc.nextLine();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the name");
                    sc.nextLine();
                    String name=sc.nextLine();
                    facultyArr.get(i).setName(name);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setPhone(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the phone");
                    sc.nextLine();
                    String phone=sc.nextLine();
                    studentArr.get(i).setPhone(phone);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the phone");
                    sc.nextLine();
                    String phone=sc.nextLine();
                    facultyArr.get(i).setPhone(phone);;
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setEmail(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the email");
                    sc.nextLine();
                    String eamil=sc.nextLine();
                    studentArr.get(i).setEmail(eamil);;
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the email");
                    sc.nextLine();
                    String email=sc.nextLine();
                    facultyArr.get(i).setEmail(email);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setPremisesNumber(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the premises number");
                    sc.nextLine();
                    String premisesNumber=sc.nextLine();
                    studentArr.get(i).add.setPremisesNumber(premisesNumber);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the premieses Number");
                    sc.nextLine();
                    String premisesNumber=sc.nextLine();
                    facultyArr.get(i).add.setPremisesNumber(premisesNumber);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setStreet(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the street");
                    sc.nextLine();
                    String street=sc.nextLine();
                    studentArr.get(i).add.setStreet(street);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the street");
                    sc.nextLine();
                    String street=sc.nextLine();
                    facultyArr.get(i).add.setStreet(street);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setCity(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the city");
                    sc.nextLine();
                    String city=sc.nextLine();
                    studentArr.get(i).add.setCity(city);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the city");
                    sc.nextLine();
                    String city=sc.nextLine();
                    facultyArr.get(i).add.setCity(city);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setPin(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the pin");
                    sc.nextLine();
                    String pin=sc.nextLine();
                    studentArr.get(i).add.setPin(pin);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the pin");
                    sc.nextLine();
                    String pin=sc.nextLine();
                    facultyArr.get(i).add.setPin(pin);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }

    public void setState(){
        Scanner sc=new Scanner(System.in);
        // String name;
        // System.out.println("Enter the name");
        // name=sc.nextLine();
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        int t=sc.nextInt();
        if(t==1){
            int n=studentArr.size();
            int i;
            int roll;
            System.out.println("Enter the roll");
            roll=sc.nextInt();
            for( i=0;i<n;i++){
                if(studentArr.get(i).getRoll()==roll){
                    System.out.println("Enter the state");
                    sc.nextLine();
                    String state=sc.nextLine();
                    studentArr.get(i).add.setState(state);
                    return ;
                }
            }
            System.out.println("The roll doesn't exit");
        }
        else{
            int n=facultyArr.size();
            int i;
            int id;
            System.out.println("Enter the employee id");
            id=sc.nextInt();
            for( i=0;i<n;i++){
                if(facultyArr.get(i).getId()==id){
                    System.out.println("Enter the state");
                    sc.nextLine();
                    String state=sc.nextLine();
                    facultyArr.get(i).add.setState(state);
                    return ;
                }
            }
            System.out.println("The faculty doesn't exit");
        }
    }
    public void displayStudent(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the roll no");
        int roll=sc.nextInt();
        int n=studentArr.size();
        for(int i=0;i<n;i++){
            if(studentArr.get(i).getRoll()==roll){
                studentArr.get(i).display();
            }
        }
        System.out.println("The roll dosen't exist");
    }
    public void displayFaculty(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the faculty id");
        int id=sc.nextInt();
        int n=facultyArr.size();
        for(int i=0;i<n;i++){
            if(facultyArr.get(i).getId()==id){
                facultyArr.get(i).display();
            }
        }
        System.out.println("The id dosen't exist");
    }
}


public class Prob2{
    public static void main(String[] args) {
        // String s1,s2;
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the first string");
        // s1=sc.nextLine();
        // // sc.nextLine();
        // System.out.println("Enter the first string");
        // s2=sc.nextLine();
        // // sc.nextLine();
        // System.out.println(s1);
        // System.out.println(s2);
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        while(true){
            int c;
            System.out.println("Choose:");
            System.out.println("1. Add student");
            System.out.println("2. Add faculty");
            System.out.println("3.set name");
            System.out.println("4.set phone");
            System.out.println("5.set email");
            System.out.println("6.set premises no");
            System.out.println("7.set street");
            System.out.println("8.set city");
            System.out.println("9. set pin");
            System.out.println("10.set state");
            // System.out.println("11.display student");
            // System.out.println("12.display faculty");
            System.out.println("11.display student list");
            System.out.println("12.display faculty list");
            System.out.println("13.exit");
            c=sc.nextInt();
            if(c==1){
                library.addStudent();
            }
            else if(c==2){
                library.addFaculty();
            }
            else if(c==3){
                library.setName();
            }
            else if(c==4){
                library.setPhone();
            }
            else if(c==5){
                library.setEmail();
            }
            else if(c==6){
                library.setPremisesNumber();
            }
            else if(c==7){
                library.setStreet();
            }
            else if(c==8){
                library.setCity();
            }
            else if(c==9){
                library.setPin();
            }
            else if(c==10){
                library.setState();
            }
            else if(c==11){
                library.displayStudentList();
            }
            else if(c==12){
                library.displayFacultyList();
            }
            else {
                break;
            }
        }
    }
}