package Vishakha;
import java.util.Scanner;

class Cars{
	Scanner scan=new Scanner(System.in);
	int[][] a=new int[4][4];
	int[] count=new int[4];
	
	void input_data() {
		System.out.println("Enter the no. of cars:");
		for(int i=0;i<4;i++) {
			count[i]=0;
			for(int j=0;j<4;j++) {
				a[i][j]=scan.nextInt();
				count[i]=count[i]+a[i][j];
			}
		}
	}
	void display_data() {
		System.out.println("	   Maruti-K10  Zen-Astole  Wagner  Maruti-Sx4  Total_CarModels\n");
		System.out.println("Delhi   	"+a[0][0]+"	"+a[0][1]+"	    "+a[0][2]+"	     "+a[0][3]+"     	"+count[0]+"\n");
		System.out.println("Mumbai  	"+a[1][0]+"	"+a[1][1]+"	    "+a[1][2]+"	     "+a[1][3]+"     	"+count[1]+"\n");
		System.out.println("Chennai 	"+a[2][0]+"	"+a[2][1]+"	    "+a[2][2]+"	     "+a[2][3]+"     	"+count[2]+"\n");
		System.out.println("Kolkata 	"+a[3][0]+"	"+a[3][1]+"	    "+a[3][2]+"	     "+a[3][3]+"     	"+count[3]+"\n");
	}
}
public class Models {

	public static void main(String[] args) {
		Cars obj=new Cars();
		obj.input_data();
		obj.display_data();
	}
	

}
