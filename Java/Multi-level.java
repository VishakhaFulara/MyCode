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
	double avg1;
	Marks(int r,String n,double f,int x,int y,int z){
    super(r,n,f);
    m1=x;
    m2=y;
    m3=z;
}
void Average_marks1(){
    avg1=(m1+m2+m3)/3;
}
void display1(){
    System.out.println("Name:"+name);
    System.out.println("Roll no:"+rollNo);
    System.out.println("Fees:"+fees);
}
}
class Sport extends Marks{
	int s;
	double avg2;
	Sport(int r,String n,double f,int x,int y,int z,int s){
    super(r,n,f,x,y,z);
    this.s=s;
}
double Average_marks2(){
    avg2=(m1+m2+m3+s)/4;
    return avg2;
}
void display2(){
    display1();
    System.out.println("Total Average:"+avg2);
}
void check(double avg){
    if(avg>90)
        System.out.println("first division");
    else if(avg>70 && avg<90)
        System.out.println("second division");
    else if(avg>50 && avg<70)
        System.out.println("third division");
    else if(avg>30 && avg<50)
        System.out.println("fourth division");
    else
        System.out.println("Fail");
}
    
}

public class Implement{

	public static void main(String[] args){
	int r,x,y,z,s;
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
    System.out.println("enter the marks of sport:");
    s=scan.nextInt();
    Sport obj=new Sport(r,n,f,x,y,z,s);
    double avg=obj.Average_marks2();
    obj.display2();
    obj.check(avg);
    scan.close();
	}
}  
