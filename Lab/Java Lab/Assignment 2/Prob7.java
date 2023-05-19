/*
 * Take a String input that contains multiple words. Do the following : i) numbber of times 'a' appears ii) number of times "and"  appears iii) whetehr it starts with "THe" or not iv) put the String into an array of characters v) display the tokens in the String (tokens are the substrings separated by space or @ of .).
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Prob7 {
    public static ArrayList<String> findToken(String s){
        ArrayList<String> arr=new ArrayList<String>();
        int n=s.length();
        int i=0;
        while(i<n){
            while(i<n&&(s.charAt(i)==' '||s.charAt(i)=='@'||s.charAt(i)=='.')){
                i++;//skiping all space, '@' and '.'
            }
            if(i==n){
                break;
            }
            int j=i;//starting index of the token
            while(i<n&&(s.charAt(i)!=' '&&s.charAt(i)!='@'&&s.charAt(i)!='.')){
                i++;//finding the end index of the token
            }
            arr.add(s.substring(j, i));
        }
        return arr;
    }

    public static char[] getCharArray(String s){
        int n=s.length();
        char[] str=new char[n];
        for(int i=0;i<n;i++){//take each character from s and put it into str in the same sequence
            str[i]=s.charAt(i);
        }
        return str;
    } 

    public static int countWord(String s,String target){
        int n=s.length();
        int t=target.length();
        int count=0;
        for(int i=0;i<=n-t;i++){
            String temp=s.substring(i, i+t);//create substring of the same length as target
            if(temp.equals(target)){
                count++;
            }
        }
        return count;
    }

    public static boolean isStartWithThe(String s){
        int n=s.length();
        if(n<3){
            return false;
        }
        String temp=s.substring(0,3);
        return temp.equals("The"); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        ArrayList<String> arr=findToken(s);
        int n=arr.size();
        System.out.println("Ther tokens are:");
        //printing the token
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }
        //creating the array of char
        char []str=getCharArray(s);
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]);
        }
        System.out.println("The number of time 'a' appears= "+countWord(s,"a"));
        System.out.println("The number of time 'and' appears= "+countWord(s,"and"));
        System.out.println("The string Start with 'The' :"+isStartWithThe(s));
    }
}
