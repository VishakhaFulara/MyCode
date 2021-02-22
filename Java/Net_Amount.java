//Program to find out the net amount paid by a customer.
package Vishakha;

import java.util.Scanner;
public class NetAmount {

	double check1(double n){
        double net_value=0;
        if(n>=1 && n<=100)
            net_value=n;
        else if(n>=101 && n<=200)
            net_value=n-0.05*n;
        else if(n>=210 && n<=300)
            net_value=n-0.075*n;
        else 
            net_value=n-0.1*n;
        
        return net_value;
    }
    double check2(double n){
    	double net_value=0;
        if(n>=1 && n<=100)
        	net_value=n-0.05*n;
        else if(n>=101 && n<=200)
        	net_value=n-0.075*n;
        else if(n>=210 && n<=300)
        	net_value=n-0.1*n;
        else 
        	net_value=n-0.15*n;
     
        return net_value;
    }
    public static void main(String[] args) {
    	NetAmount obj=new NetAmount();
    	Scanner scan =new Scanner(System.in);
    	System.out.println("enter the amount:");  
        double n=scan.nextDouble();                                         //puchase amount
        System.out.println("enter the item:1.Mill cloth 2.Handloom Items");
        int item=scan.nextInt();
        switch(item){
            case 1:System.out.println("Net amount paid by a customer is:"+obj.check1(n));
                	break;
            case 2:System.out.println("Net amount paid by a customer is:"+obj.check2(n));
                	break;
             default:System.out.println("Wrong choice....");
             		break;

        }
    }
}
