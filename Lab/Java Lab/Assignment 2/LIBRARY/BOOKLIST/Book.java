package LIBRARY.BOOKLIST;

public class Book {
    // private static int nextId=1;
    private int id;
    private String title;
    private int copies;
    private int issued;
    public Book(int id,String title,int copies){
        this.id=id;
        this.title=title;
        this.copies=copies;
        issued=0;
    }
    public String getTitle(){
        return title;
    }
    public int getCopies(){
        return copies;
    }
    public int getId(){
        return id;
    }
    public int getIssued(){
        return issued;
    }
    public int getAvailabe(){
        return copies-issued;
    }
    public void addCopies(int t){
        copies+=t;
    }
    public void incrementIssued(){
        issued++;
    }
    public void decrementIssued(){
        issued--;
    }
    public void display(){
        System.out.println("Id: "+id+" Title: "+title+" Copies: "+copies+" Issued: "+issued+" Available: "+getAvailabe());
    }
}
