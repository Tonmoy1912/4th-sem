/*
 * 4. Write a program to create a text file to store a list of names and then read the content.
 */

import java.util.*;
import java.io.*;

public class Prob4 {
    public static void main(String[] args)throws IOException {
        File file=new File("text1.txt");
        if(file.exists()){
            file.delete();
        }
        file.createNewFile();
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Choose");
            System.out.println("1.Add name");
            System.out.println("2.Display names");
            System.out.println("3.Exit");
            int c=sc.nextInt();
            if(c==1){
                System.out.println("Enter the name");
                sc.nextLine();
                String name=sc.nextLine();
                FileOutputStream fos=new FileOutputStream("text1.txt",true);
                // DataOutputStream dos=new DataOutputStream(fos);
                int n=name.length();
                for(int i=0;i<n;i++){
                    fos.write((byte)name.charAt(i));
                }
                fos.write((byte)'\n');
                // dos.close();
                fos.close();
            }
            else if(c==2){
                FileInputStream fis=new FileInputStream("text1.txt");
                // DataInputStream dis=new DataInputStream(fis);
                // int n=name.length();
                // for(int i=0;i<n;i++){
                //     dos.writeChar(name.charAt(i));
                // }
                // dos.writeChar('\n');
                System.out.println("The names in the file:");
                byte x;
                while((x=(byte)fis.read())!=-1){
                    System.out.print((char)x);
                }
                // dis.close();
                fis.close();
            }
            else{
                break;
            }
        }
    }
}
