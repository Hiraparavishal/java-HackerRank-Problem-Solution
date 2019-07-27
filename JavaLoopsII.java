import java.util.*;
import java.io.*;
import java.lang.Math; 

class Solution{
    static int sum=0;
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int k=0;k<n;k++){
                sum=0;
                for(int j=0;j<=k;j++){
                  
                   sum= sum + (int)Math.pow(2,j)*b; 
                }
             System.out.print(sum + a + " ");
            }
          System.out.println();
        }
    }   
}

