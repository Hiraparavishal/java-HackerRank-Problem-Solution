import java.io.*;
import java.util.*;
 class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] a = s.split("[ !,?\\._'@]+",0); 
        System.out.println(a.length +1);

        for (String a1 : a) 
            System.out.println(a1); 
        scan.close();
    }
}

