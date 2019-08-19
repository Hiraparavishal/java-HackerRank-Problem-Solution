import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
      int a=0;
      int b=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = a/b;
             System.out.println(c);
        }catch(InputMismatchException e){
             System.out.println("java.util.InputMismatchException");
        }catch(Exception e){
            System.out.println(e);
        }
    
    
    }
}

