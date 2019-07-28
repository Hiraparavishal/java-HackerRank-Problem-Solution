// this code is not Work on Vscode

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {
     
    public static String findDay(int month, int day, int year) {
       String date = day +"/"+month+"/"+year;
       int dayOfWeek=0;
          try {
            SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
            Date dt1 = format1.parse(date);
            Calendar c = Calendar.getInstance();
            c.setTime(dt1);
            dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            
          } catch(Exception e) {
              System.out.println(e);
            }
               String res=null;
             if(dayOfWeek == 1) res="SUNDAY";
              if(dayOfWeek == 2) res="MONDAY";
               if(dayOfWeek == 3) res="TUESDAY";
                if(dayOfWeek == 4) res="WEDNESDAY";
                 if(dayOfWeek == 5) res="THURSDAY";
                  if(dayOfWeek == 6) res="FRIDAY";
                   if(dayOfWeek == 7) res="SATURDAY";
                   return res;
        }


}



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
