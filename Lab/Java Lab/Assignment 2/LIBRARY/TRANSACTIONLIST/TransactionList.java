package LIBRARY.TRANSACTIONLIST;

import java.util.ArrayList;
import LIBRARY.TRANSACTIONLIST.Transaction;

public class TransactionList {
    private ArrayList<Transaction> arr;
    public TransactionList(){
        arr=new ArrayList<Transaction>();
    }
    public Transaction getEmptyTransaction(){//this is used to add a transaction
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i).getMemberId().equals("xxxx")){
                return arr.get(i);// a transaction will be reused
            }
        }
        Transaction temp=new Transaction();
        arr.add(temp);// a new transaction is created
        return temp;
    }
    public boolean isPresent(String memberId,int bookId){
        int n=arr.size();
        for(int i=0;i<n;i++){
            Transaction temp=arr.get(i);
            if(temp.getBookId()==bookId&&temp.getMemberId().equals(memberId)){
                return true;
            }
        }
        return false;
    }
    public Transaction getTransaction(String memberId,int bookId){
        int n=arr.size();
        Transaction temp=null;
        for(int i=0;i<n;i++){
            temp=arr.get(i);
            if(temp.getBookId()==bookId&&temp.getMemberId().equals(memberId)){
                break;
            }
        }
        return temp;
    }
    public ArrayList<Integer> getBookIds(String memberId){
        ArrayList<Integer> arrId=new ArrayList<Integer>();
        int n=arr.size();
        for(int i=0;i<n;i++){
            if(arr.get(i).getMemberId().equals(memberId)){
                arrId.add(arr.get(i).getBookId());
            }
        }
        return arrId;
    }
    public void display(){
        int n=arr.size();
        for(int i=0;i<n;i++){
            arr.get(i).display();
        }
    }
}
