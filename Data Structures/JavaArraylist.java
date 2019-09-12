import java.awt.List;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.ArrayList;
public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> listarray[]=new ArrayList[n];
        for (int i = 0; i < n; i++) { 
            listarray[i] = new ArrayList<Integer>(); 
        }
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            for(int j=0;j<d;j++){
                int b = sc.nextInt();
                listarray[i].add(b);
            }
        }
        int v=sc.nextInt();
        for(int i=0;i<v;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            try{
               System.out.println(listarray[a-1].get(b-1));   
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}

