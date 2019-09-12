import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n = sc.nextInt();
       ArrayList<Integer> list = new ArrayList<Integer>();
       for(int i=0;i<n;i++){
           int a = sc.nextInt();
           list.add(a);
        }
        int b = sc.nextInt();
        for(int j=0;j<b;j++){
           String c =sc.next();
           if(c.equals("Insert")){
               int x = sc.nextInt();
               int y = sc.nextInt();
               list.add(x,y);
            }
           if(c.equals("Delete")){
               int z = sc.nextInt();
               list.remove(z);
            }
          
        }
        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k)+" ");
        }
    }
   
}

