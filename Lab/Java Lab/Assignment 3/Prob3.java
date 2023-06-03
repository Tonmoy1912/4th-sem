/*
 * 3. Write a program that takes a filename from user and checks whether it exists or not. If it exists then check whether it is a directory or not. If it is a directory then show the list of files in it. If it is not a directory then show whether it can be read and/or written into.
 */

import java.io.File;
import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        // Read the filename from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = sc.nextLine();

        // Create a File object with the given filename
        File file = new File(filename);

        // Check if the file exists
        if (file.exists()) {
            // Check if the file is a directory
            if (file.isDirectory()) {
                // List the files in the directory
                System.out.println("The file name represents a directory.");
                String[] files = file.list();// return the array of files in the directory
                System.out.println("Files in the directory:");
                for (String f : files) {
                    System.out.println(f);
                }
            } 
            else {
                // Check if the file can be read and/or written into
                System.out.println("The file name represent a file.");
                System.out.println("Readable: " + file.canRead());
                System.out.println("Writable: " + file.canWrite());
            }
        } 
        else {
            System.out.println("File does not exist.");
        }
    }
}
