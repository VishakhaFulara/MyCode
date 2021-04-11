import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void Bubble_sort(int []a,int n){
        int flag,swap=0,temp=0;
        for(int i=1;i<n;i++){
            flag=0;
            for(int j=0;j<n-i;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                    swap++;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println("Array is sorted in "+swap+" swaps.");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // Write Your Code Here
        Bubble_sort(a,n);
    }
}
