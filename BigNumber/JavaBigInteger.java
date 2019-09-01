import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        String data1 = sc.nextLine();
        String data2 = sc.nextLine();
        BigInteger b1 = new BigInteger(data1);
        BigInteger b2 = new BigInteger(data2);
        BigInteger mul =  b1.multiply(b2);
        BigInteger add =  b1.add(b2);
        System.out.println(mul);
        System.out.println(add);
        
    }
}

