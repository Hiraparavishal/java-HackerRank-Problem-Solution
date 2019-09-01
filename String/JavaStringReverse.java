import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int flag=0;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int j=A.length()-1;
        int n=(A.length())/2;
        for(int i=0;i<n;i++){
         char x =  A.charAt(i); 
         char y =  A.charAt(j);
         if(x != y){
             System.out.println("No");
             flag=1;
             break;
         } 
           j--;
        }
        if(flag==0){
            System.out.println("Yes");
        }
        
    }
}



