import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest= "";
        String largest = "";
        int j= s.length();
        smallest = s.substring(0,k);
        largest = s.substring(0,k);
        for(int i=0;i<=j-k;i++){
             String ex = s.substring(i,i+k);
            if(ex.compareTo(smallest) < 0){
                smallest=ex;
            }
            if(ex.compareTo(largest) > 0){
              largest=ex;
            }
        }
        
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}