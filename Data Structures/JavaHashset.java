import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
HashSet temp =  new HashSet();
        int check = 1;
        temp.add(pair_left[0]+"_"+pair_right[0]);
        for (int i =0 ; i<t ;i++){
            int beforeSize = temp.size();
            temp.add(pair_left[i]+"_"+pair_right[i]);
            int afterSize = temp.size();
            if(beforeSize != afterSize){
                check++;
            }
            System.out.println(check);
        }




    }