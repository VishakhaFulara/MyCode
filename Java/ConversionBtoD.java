//Java Program to Convert Binary Number to Decimal and vice-versa.
import java.util.Scanner;
import java.lang.Math;
class ConversionBtoD {
	
	//Conversion from binary to decimal
	static void BtoD(int []arr) {
		int sum=0;
		for(int i=0;i<4;i++) {
			sum=(int)(sum+arr[i]*(Math.pow(2,4-i-1)));
		}
		System.out.println("Binary to decimal conversion "+sum);
	}
	//Conversion from decimal to binary
	static void DtoB(int num,int[] rem) {
		int j=0,m;
		while(num>0) {
			m=num%2;
			rem[j++]=m;
			num=num/2;
		}
		j--;
		System.out.println("Decimal to Binary Conversion ");
		for(int i=j;i>=0;i--) {
			System.out.print(rem[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the binary number:");
		int[] arr=new int[4];
		for(int i=0;i<4;i++) {
			arr[i]=scan.nextInt();
		}
		BtoD(arr);
		
		System.out.println("\nenter the Decimal number:");
		int num=scan.nextInt();
		int[] rem=new int[20];
		DtoB(num,rem);
		scan.close();
	}

}
