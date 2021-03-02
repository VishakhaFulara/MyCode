WAP to implement the single inheritance with the  following scenerio.Create a class student containing roll no,name,fees as 
data members and create a constructor to initialize the data members of a class.Create another class marks containing m1,m2,m3 as 
data member and a constructor to initialize the data members of a class.Then create a method to find out average marks and create a 
display function to display all the information.*/

import java.util.*;
class Student{
    int rollNo;
    String name;
    double fees;
    
    Student(int r,String n,double f){
        rollNo=r;
        name=n;
        fees=f;
    }
}

class Marks extends Student{
    int m1,m2,m3;
    double avg;
    Marks(int r,String n,double f,int x,int y,int z){
        super(r,n,f);                                       //super class used to call constructor of super class
        m1=x;
        m2=y;
        m3=z;
    }
    void Average_marks(){
        avg=(m1+m2+m3)/3;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Roll no:"+rollNo);
        System.out.println("Fees:"+fees);
        System.out.println("Average marks:"+avg);
    }
}

public class Implement{

    public static void main(String[] args){
    	int r,x,y,z;
    	String n;
    	double f;
    	Scanner scan=new Scanner(System.in);
        System.out.println("enter the roll no:");
        r=scan.nextInt();
        System.out.println("enter the name:");
        scan.nextLine();
        n=scan.nextLine();
        System.out.println("enter the fees:");
        f=scan.nextDouble();
        System.out.println("enter the marks of subject 1:");
        x=scan.nextInt();
        System.out.println("enter the marks of subject 2:");
        y=scan.nextInt();
        System.out.println("enter the marks of subject 3:");
        z=scan.nextInt();
        Marks obj=new Marks(r,n,f,x,y,z);
        obj.Average_marks();
        obj.display();
        scan.close();
    }
}   


