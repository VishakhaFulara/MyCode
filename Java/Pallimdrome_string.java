import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int n=A.length(),count=0;
        for(int i=0;i<n/2;i++){
            if(A.charAt(i)==A.charAt(n-1-i))
                count++;
        }
        if(count==n/2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}


