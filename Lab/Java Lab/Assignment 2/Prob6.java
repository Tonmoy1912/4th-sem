/*
 * Consider a wrapper class for a numeric basic type. Check the support for the following: 
 * conversion from i) basic type to object ii) object to basic type iii) basic type to String iv) String (holding numeric data) to numeric object v) object to String.
 */


public class Prob6 {
    public static void main(String[] args) {
        int i1=10;
        long l1=120343;
        float f1=(float) 45.09;
        double d1=475.9768;
        //conversion from basic type to object type
        Integer Int1=i1;
        Long Long1=l1;
        Float Float1=f1;
        Double Double1=d1;
        System.out.println("Int1 = "+Int1);
        System.out.println("Long1 = "+Long1);
        System.out.println("Float1 = "+Float1);
        System.out.println("Double1 = "+Double1);
        //conversion from object type to basic type
        int i2=Int1;
        long l2=Long1;
        float f2=Float1;
        double d2=Double1;
        System.out.println("i2 ="+i2);
        System.out.println("l2 ="+l2);
        System.out.println("f2 ="+f2);
        System.out.println("d2 ="+d2);
        //conversion from basic type to string
        String s1=Integer.toString(i1);
        String s2=Long.toString(l1);
        String s3=Float.toString(f1);
        String s4=Double.toString(d1);
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
        System.out.println("s3= "+s3);
        System.out.println("s4= "+s4);
        //conversion from String type to object
        Integer Int2=Integer.valueOf(s1);
        Long Long2=Long.valueOf(s2);
        Float Float2=Float.valueOf(s3);
        Double Double2=Double.valueOf(s4);
        System.out.println("Int2 = "+Int2);
        System.out.println("Long2 = "+Long2);
        System.out.println("Float2 = "+Float2);
        System.out.println("Double2 = "+Double2);
        //conversion from objcet to string
        String s5=Int1.toString(i1);
        String s6=Long1.toString(l1);
        String s7=Float1.toString(f1);
        String s8=Double1.toString(d1);
        System.out.println("s5= "+s5);
        System.out.println("s6= "+s6);
        System.out.println("s7= "+s7);
        System.out.println("s8= "+s8);
    }
}
