package LIBRARY.BOOKLIST;

import java.util.ArrayList;
import LIBRARY.BOOKLIST.Book;

public class BookList {
    private int newId;//contains the id of the next new book to ensure uniqueness of book id
    private ArrayList<Book> arr;
    public BookList(){
        newId=0;
        arr=new ArrayList<Book>();
    }
    public void addBook(String title,int copies){
        Book temp=new Book(newId, title, copies);//create new book instance
        arr.add(temp);//add the book in the list
        System.out.println("The id of the book is : "+newId);//show the book id of the newly added book
        newId++;
    }
    public boolean isPresent(int id){
        if(id<0||id>=newId){
            return false;
        }
        return true;
    }
    public Book getBook(int id){
        return arr.get(id);//return the book instance with id = id
    }
    public void display(){
        System.out.println("BookList: ");
        for(int i=0;i<newId;i++){
            arr.get(i).display();
        }
    }
}
