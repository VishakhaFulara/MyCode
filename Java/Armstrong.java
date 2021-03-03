//Java Program to Display Armstrong Number Between Two Intervals (Numbers must be taken as command line arguments).
//import java.util.*;
public class Armstrong {

	static void Find_Armstrong_no(int a,int b) {
		int n,m,r;
		System.out.println("Armstrong no. between "+a+" and "+b+" are:");
		for(int i=a;i<=b;i++) {
			n=i;
			r=0;
			while(n>0) {
				m=n%10;
				r=r+m*m*m;
				n=n/10;
			}
			n=i;
			if(r==n) {
				System.out.print(r+" ");
			}
		}		
	}
	public static void main(String[] args) {
		//Scanner scan=new Scanner(System.in);
		System.out.println("Enter the interval:");
		int a=Integer.parseInt(args[0]),b=Integer.parseInt(args[1]);
		//int a=scan.nextInt(),b=scan.nextInt();
		Find_Armstrong_no(a,b);
	//	scan.close();
		
	}
}
