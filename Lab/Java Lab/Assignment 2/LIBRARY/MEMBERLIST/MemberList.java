package LIBRARY.MEMBERLIST;

import LIBRARY.MEMBERLIST.Member;
import java.util.ArrayList;

public class MemberList {
    private int newId;
    private ArrayList<Member> arr;
    public MemberList(){
        newId=0;
        arr=new ArrayList<Member>();
    }
    public void addMember(String name,String dateOfBirth){
        Member temp=new Member(name, dateOfBirth, newId);//creating member instance
        arr.add(temp);//add the member in the list
        System.out.println("The id of the member is : "+newId);//show the id of newly added member
        newId++;
    }
    public boolean isPresent(int id){
        if(id<0||id>=newId){
            return false;
        }
        return true;
    }
    public Member getMember(int id){
        return arr.get(id);//return the member instance with id = id
    }
    public void display(){
        System.out.println("Member list: ");
        for(int i=0;i<newId;i++){
            arr.get(i).display();
        }
    }
}
