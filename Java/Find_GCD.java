//GDP of two numbers
package Practice;
import java.util.Scanner;
class Number{
	int gcd;
	public void Display_factors(int[] a,int num) {
		System.out.println("Factors of "+num+" are:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.printf("%n");
	}
	public void Find_factor(int a,int b,int[] a1,int[] a2) {
		int j=0;
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				a1[j++]=i;
			}
		}
		Display_factors(a1,a);
		j=0;
		for(int i=1;i<b;i++) {
			if(b%i==0) {
				a2[j++]=i;
			}
		}
		Display_factors(a2,b);
	}
	public void Find_gcd(int[] a1,int[] a2) {
		gcd=1;
		for(int i=0;i<a1.length;i++) {
			for(int j=0;j<a2.length;j++) {
				if(a1[i]==a2[j] && a1[i]>gcd) {
					gcd=a1[i];
					break;
				}
				else if(a1[i]<a2[j]) {
					break;
				}
			}
		}
		System.out.println(gcd);
	}
}
public class GCD{
	public static void main(String[] args) {
		int[] a1=new int[10];
		int[] a2=new int[10];
		Number obj=new Number();
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a=s.nextInt(),b=s.nextInt();
		obj.Find_factor(a, b,a1,a2);
		obj.Find_gcd(a1,a2);
		
	}
}

