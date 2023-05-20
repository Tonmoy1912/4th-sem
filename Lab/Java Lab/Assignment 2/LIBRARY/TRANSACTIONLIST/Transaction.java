package LIBRARY.TRANSACTIONLIST;

public class Transaction {
    private int bookId;
    private String memberId="xxxx";
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public void setMemberId(String memberId){
        this.memberId=memberId;
    }
    public int getBookId(){
        return bookId;
    }
    public String getMemberId(){
        return memberId;
    }
    public void display(){
        System.out.println("Member id: "+memberId+" Book id: "+bookId);
    }
}
