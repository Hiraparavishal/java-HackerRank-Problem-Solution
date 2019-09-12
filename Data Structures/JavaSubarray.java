import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count=0;
        int n = sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               sum = sum+a[j];
               if(sum<0){
                  count++;
               }
            }
        }
        System.out.println(count);
        
    }
}

