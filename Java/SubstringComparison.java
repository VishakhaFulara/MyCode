//Given a string,s1 , and an integer,k , complete the function so that it finds the lexicographically smallest and largest substrings of length .
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s1, int k) {
        String small = "";
        String larg = "";
        String s2;
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        small=larg=s1.substring(0,k);
        int len=s1.length()-k;
        for(int i=1;i<=len;i++){
            s2=s1.substring(i,k+i);
            if(s2.compareTo(larg)>0)
                larg=s2;
            if(s2.compareTo(small)<0)
                small=s2;
        }
        return small + "\n" + larg;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
