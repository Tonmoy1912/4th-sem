/* Write a program that accecpts a string and assigns it to another. Check the outcome of comparison with == and equals method. Take tow String and put same input for them. Repeat the equality  */



public class Prob5 {
    public static void main(String[] args) {
        String s1=new String("string 1");
        // System.out.println(s1);
        String s2=s1;
        if(s1==s2){//since s1 and s2 refers to the same object hence the value is true
            System.out.println("The result of s1==s2 is true");
            
        }
        else{
            System.out.println("The result of s1==s2 is false");
        }
        if(s1.equals(s2)){//since s1 and s2 refers to same object,hence the value is true
            System.out.println("The result of s1.equals(s2) is true");
        }
        else{
            System.out.println("The result of s1.equals(s2) is false");
        }
        String s3=new String("final string");
        String s4=new String("final string");
        if(s3==s4){//since s3 and s4 refers to different objects ,hence the value is false
            System.out.println("The result of s3==s4 is true");
        }
        else{
            System.out.println("The result of s3==s4 is false");
        }
        if(s3.equals(s4)){//since s3 and s4 contain same data , hence the value is true
            System.out.println("The result of s3.equals(s4) is true");
        }
        else{
            System.out.println("The result of s3.equals(s4) is false");
        }
    }
}
