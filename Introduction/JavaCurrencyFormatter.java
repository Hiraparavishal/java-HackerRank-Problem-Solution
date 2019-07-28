
import java.util.*;
import java.text.*;
import java.util.Locale;
import java.text.NumberFormat;
 class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale India= new Locale("en", "IN");
        NumberFormat us1 = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india1 = NumberFormat.getCurrencyInstance(India);
        NumberFormat china1 =NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);

          String us = us1.format(payment);
          String india = india1.format(payment);
          String china = china1.format(payment);
          String france = france1.format(payment);
        
        
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

