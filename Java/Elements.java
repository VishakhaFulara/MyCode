//WAP to arrange & merge all the array in ascending order of three different array in java

import java.util.Scanner;
public class Elements {
	
	static Scanner scan=new Scanner(System.in);
	static void Merge(int[] l,int[] r,int[] a,int nl,int nr){
		int i=0,j=0,k=0;
		while(i<nl && j<nr){
			if(l[i]<r[j]){
				a[k]=l[i];
				i++;
			}
			else{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<nl)      a[k++]=l[i++];
		while(j<nr)      a[k++]=r[j++];
	}
	static void  Divide(int a[],int n) {
		int i,j=0;
		if(n==1)
			return;
		int nl=n/2;
		int nr=n-nl;
		int[] l=new int[nl];
		int[] r=new int[nr];
		for(i=0;i<nl;i++) {
			l[i]=a[i];
		}
		for(i=nl;i<n;i++) {
			r[j++]=a[i];
		}
		Divide(l,nl);
		Divide(r,nr);
		Merge(l,r,a,nl,nr);
	}
	static void input_element(int[] arr,int n) {
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
	}
	static void display(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.printf("\n");
	}
	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.println("enter size of array 1:");
		n1=scan.nextInt();
		int[] a1= new int[n1];
		System.out.println("enter the element of array 1:");
		input_element(a1,n1);
		
		System.out.println("enter size of array 2:");
		n2=scan.nextInt();
		int[] a2= new int[n2];
		System.out.println("enter the element of array 2:");
		input_element(a2,n2);
		
		System.out.println("enter size of array 3:");
		n3=scan.nextInt();
		int[] a3= new int[n3];
		System.out.println("enter the element of array 3:");
		input_element(a3,n3);
		
		int[] a4=new int[n1+n2];
		int[] a5=new int[n1+n2+n3];
		
		Divide(a1,n1);
		display(a1,n1);
		
		Divide(a2,n2);
		display(a2,n2);
		
		Divide(a3, n3);
		display(a3,n3);
		
		Merge(a1,a2,a4,n1,n2);         //a1 & a2 is merged
		display(a4,n1+n2);

		System.out.println("\nAfter arranging and merging the 3 different array,the new array is:");
		Merge(a4,a3,a5,n1+n2,n3);             //(a1,a2)=a5,a3 is merged in a5
		display(a5,n1+n2+n3);
		scan.close();

	}

}

