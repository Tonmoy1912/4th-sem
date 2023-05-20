package LIBRARY.MEMBERLIST;

public class Member {
    private static int limit=3;
    private String name;
    private String dateOfBirth;
    private int id;
    private int bookIssued;
    public Member(String name,String dateOfBirth,int id){
        this.name=name;
        this.dateOfBirth=dateOfBirth;
        this.id=id;
        bookIssued=0;
    }
    public static void setLimit(int l){
        if(l<0){
            System.out.println("Limit can not be negative");
            return ;
        }
        limit=l;
    }
    public int getId(){
        return id;
    }
    public int getBookIssued(){
        return bookIssued;
    }
    public boolean isEligible(){
        return bookIssued<limit;
    }
    public void incrementBookIssued(){
        bookIssued++;
    }
    public void decrementBookIssued(){
        bookIssued--;
    }
    public void display(){
        System.out.println("Id: "+id+" Name: "+name+" Date of Birth: "+dateOfBirth+" Book issued: "+bookIssued+" Limit: "+limit);
    }
}
