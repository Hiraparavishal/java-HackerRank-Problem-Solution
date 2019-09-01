import java.io.*;
import java.util.*;
 class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B) > 0){
             System.out.println("Yes");

        }else{
             System.out.println("No");
        }        
        String s1 = A.substring(0,1).toUpperCase();
        String sTitle1 = s1 + A.substring(1);
        String s2 = B.substring(0,1).toUpperCase();
        String sTitle2 = s2 + B.substring(1);
        System.out.println(sTitle1+" "+sTitle2);
    }
}




