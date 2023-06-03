/*
 * 5. Student class contains roll, name and score. Write a program to store the objects in a file and thereafter read all the objects.
 */

import java.util.*;
import java.io.*;

class Student implements Serializable{
    private String name;
    private int roll;
    private double score;
    public Student(String name,int roll,double score){
        this.name=name;
        this.roll=roll;
        this.score=score;
    }
    public String toString(){
        return ("Name: "+name+" Roll: "+roll+" Score: "+score);
    }
}

public class Prob5 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        File file=new File("StudentFile.dat");
        if(file.exists()){
            file.delete();
        }
        file.createNewFile();
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> list=new ArrayList<Student>();
        while(true){
            System.out.println("Choose");
            System.out.println("1.Add Student");
            System.out.println("2.Display Students");
            System.out.println("3.Store the student list in file");
            System.out.println("4.Exit");
            int c=sc.nextInt();
            if(c==1){
                System.out.println("Enter the name");
                sc.nextLine();
                String name=sc.nextLine();
                System.out.println("Enter the roll");
                int roll=sc.nextInt();
                System.out.println("Enter the score");
                double score=sc.nextDouble();
                Student s=new Student(name, roll, score);
                // FileOutputStream fos=new FileOutputStream(file,true);
                // ObjectOutputStream oos=new ObjectOutputStream(fos);
                // oos.writeObject(s);
                // oos.close();
                // fos.close();
                list.add(s);
            }
            else if(c==2){
                FileInputStream fis=new FileInputStream(file);
                ObjectInputStream ois=new ObjectInputStream(fis);
                System.out.println("The students in the file:");
                // Student s;
                ArrayList<Student> arr=new ArrayList<Student>();
                try{
                    // while((s=(Student)ois.readObject())!=null){
                    //     System.out.println(s);
                    // }
                    arr=(ArrayList<Student>)ois.readObject();
                    for(Student s:arr){
                        System.out.println(s);
                    }
                }
                catch(EOFException err){
                    System.out.println(err.getMessage());
                    System.out.println("First store the student list in the file");
                }
                finally{
                    ois.close();
                    fis.close();
                }
            }
            else if(c==3){
                FileOutputStream fos=new FileOutputStream(file);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(list);
                oos.close();
                fos.close();
            }
            else{
                break;
            }
        }
    }
}
