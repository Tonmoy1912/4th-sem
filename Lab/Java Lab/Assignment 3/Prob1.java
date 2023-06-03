/*
 * 1.  Each department s described by dept code (unique), dept name, location. Each employee is described by emp code (unique), emp name , basic and dept code.  Maintain list of departments and list of employees such that one can:
i) add employee (emp code  unique and dept code must exist), add department (dept code unique)
ii) display the details  for a given emp code along with corresponding department details.
iii) display details of all employees
iv) find total basic pay for a department
v) remove an employee (given an emp code)
vi) modify basic of an employee
vii) sort the employee list -- according to basic in descending order, according to dept code, according to emp code
Design and implement the classes. Do the same once considering the list as an array like collection and again as an linked list like collection.
 */

import java.util.*;

import javax.xml.transform.SourceLocator;

class Dept{
    private int code;
    private String name;
    private String location;
    public Dept(int code,String name,String location){
        this.code=code;
        this.name=name;
        this.location=location;
    }
    public int getCode(){
        return code;
    }
    @Override
    public String toString(){
        return ("Department name: "+name+" Code: "+code+" Location: "+location);
    }
}

class Employee{
    private int code;
    private String name;
    private int basic;
    private int deptCode;
    public Employee(int code,String name,int basic,int deptCode){
        this.code=code;
        this.name=name;
        this.basic=basic;
        this.deptCode=deptCode;
    }
    public int getDeptCode(){
        return deptCode;
    }
    public int getBasic(){
        return basic;
    }
    public int getEmpCode(){
        return code;
    }
    public void setBasic(int b){
        basic=b;
    }
    @Override
    public String toString(){
        return ("Name: "+name+" Employee Code: "+code+" Basic: "+basic+" Department Code: "+deptCode); 
    }
}

class BasicCom implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        if(e1.getBasic()<e2.getBasic()){
            return 1;
        }
        return -1;
    }
}

class DeptCodeCom implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.getDeptCode()-e2.getDeptCode();
    }
}

class EmpCodeCom implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2){
        return e1.getEmpCode()-e2.getEmpCode();
    }
}

class EmployeeDeptList{
    private ArrayList<Dept> arrDept=new ArrayList<Dept>();
    private ArrayList<Employee> arrEmp=new ArrayList<Employee>();
    HashMap<Integer,Integer> mapDept=new HashMap<Integer,Integer>();//to store the index for a department code
    HashMap<Integer,Integer> mapEmp=new HashMap<Integer,Integer>();//to store the index for a employee code
    // private LinkedList<Dept> arrDept=new LinkedList<Dept>();
    // private LinkedList<Employee> arrEmp=new LinkedList<Employee>();
    public void addDept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the department code");
        int code=sc.nextInt();
        if(mapDept.containsKey(code)){
            System.out.println("Enter an unique Department Code");
            return ;
        }
        sc.nextLine();
        System.out.println("Enter the department name");
        String name=sc.nextLine();
        System.out.println("Enter the location");
        String location=sc.nextLine();
        arrDept.add(new Dept(code, name, location));
        System.out.println("Department is added successfully");
        mapDept.put(code,arrDept.size()-1);
        // System.out.println("Department index: "+(arrDept.size()-1));
    }
    public void addEmp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee code");
        int code=sc.nextInt();
        if(mapEmp.containsKey(code)){
            System.out.println("Enter an unique Employee Code");
            return ;
        }
        sc.nextLine();
        System.out.println("Enter the Employee name");
        String name=sc.nextLine();
        System.out.println("Enter the Department code");
        int deptCode=sc.nextInt();
        if(mapDept.containsKey(deptCode)==false){
            System.out.println("The department code doesn't exist");
            return ;
        }
        System.out.println("Enter the basic");
        int basic=sc.nextInt();
        arrEmp.add(new Employee(code, name, basic, deptCode));
        System.out.println("Employee is added successfully");
        mapEmp.put(code,arrEmp.size()-1);
    }
    public void displayEmp(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee code");
        int code=sc.nextInt();
        if(mapEmp.containsKey(code)==false){
            System.out.println("The employee code doesn't exist");
            return ;
        }
        int empIndex=mapEmp.get(code);
        System.out.println(arrEmp.get(empIndex));
        int deptCode=arrEmp.get(empIndex).getDeptCode();
        int deptIndex=mapDept.get(deptCode);
        System.out.println(arrDept.get(deptIndex));
    }
    public void display(){
        for(Employee it:arrEmp){
            System.out.println(it);
        }
    }
    public void totalBasic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Department Code");
        int deptCode=sc.nextInt();
        if(mapDept.containsKey(deptCode)==false){
            System.out.println("The department code doesn't exist");
            return ;
        }
        int sum=0;
        for(Employee it:arrEmp){
            if(deptCode==it.getDeptCode()){
                sum+=it.getBasic();
            }
        }
        System.out.println("The total basic of the department : "+sum);
    }
    public void modifyBasic(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee code");
        int code=sc.nextInt();
        if(mapEmp.containsKey(code)==false){
            System.out.println("The employee code doesn't exist");
            return ;
        }
        int empIndex=mapEmp.get(code);
        Employee e=arrEmp.get(empIndex);
        System.out.println("Enter the new basic");
        int newBasic=sc.nextInt();
        e.setBasic(newBasic);
        System.out.println("The basic is set successfully");
    }
    public void removeEmployee(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the employee code");
        int code=sc.nextInt();
        if(mapEmp.containsKey(code)==false){
            System.out.println("The employee code doesn't exist");
            return ;
        }
        int empIndex=mapEmp.get(code);
        // Employee e=arrEmp.get(empIndex);
        arrEmp.remove(empIndex);
        mapEmp.remove(code);
        for(Map.Entry<Integer,Integer> e:mapEmp.entrySet()){
            int key=e.getKey();
            int val=e.getValue();
            if(val>=empIndex){
                mapEmp.put(key,val-1);
            }
        }
        System.out.println("The employee is removed successfully");
    }
    public void sortList(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose:");
        System.out.println("1.Descending order of basic");
        System.out.println("2.Ascending order of department code");
        System.out.println("3.Ascending order of employee code");
        int c=sc.nextInt();
        if(c==1){
            Collections.sort(arrEmp,new BasicCom());
        }
        else if(c==2){
            Collections.sort(arrEmp,new DeptCodeCom());
        }
        else if(c==3){
            Collections.sort(arrEmp,new EmpCodeCom());
        }
        int index=0;
        int n=arrEmp.size();
        for(int i=0;i<n;i++){//for rearranging the index against employee code
            int empCode=arrEmp.get(i).getEmpCode();
            mapEmp.put(empCode, i);
        }
    }
}

public class Prob1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeDeptList list=new EmployeeDeptList();
        while(true){
            System.out.println("Choose");
            System.out.println("1.Add Department");
            System.out.println("2.Add Employee");
            System.out.println("3.Display employee with a given employee id");
            System.out.println("4.Show details of all employee");
            System.out.println("5.Find the total basic of a department");
            System.out.println("6.Remove an employee");
            System.out.println("7.Modify basic");
            System.out.println("8.Sort employee list");
            System.out.println("9.Exit");
            int c=sc.nextInt();
            if(c==1){
                list.addDept();
            }
            else if(c==2){
                list.addEmp();
            }
            else if(c==3){
                list.displayEmp();
            }
            else if(c==4){
                list.display();
            }
            else if(c==5){
                list.totalBasic();
            }
            else if(c==6){
                list.removeEmployee();
            }
            else if(c==7){
                list.modifyBasic();
            }
            else if(c==8){
                list.sortList();
            }
            else{
                break;
            }
        }
    }
}