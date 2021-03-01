//wap to arrange & merge all the array in ascending order of three different array in java
public class Elements {
	 void Merge(int[] l,int[] r,int[] a,int nl,int nr){
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
	void  Divide(int a[],int n) {
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
	void display(int[] a,int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.printf("\n");
	}
	public static void main(String[] args) {
		Elements obj=new Elements();
		int[] a1= {2,1,9,3};
		int[] a2= {6,4,5,10};
		int[] a3= {12,11,14,8};
		int[] a4=new int[8];
		int[] a5=new int[12];
		obj.Divide(a1,4);
		obj.display(a1,4);
		
		obj.Divide(a2,4);
		obj.display(a2,4);
		
		obj.Divide(a3, 4);
		obj.display(a3,4);
		
		obj.Merge(a1,a2,a4,4,4);         //a1 & a2 is merged
		obj.display(a4,8);

		System.out.println("\nAfter arranging and merging the 3 different array,the new array is:");
		obj.Merge(a4,a3,a5,8,4);             //(a1,a2)=a5,a3 is merged in a5
		obj.display(a5,12);
		

	}

}

