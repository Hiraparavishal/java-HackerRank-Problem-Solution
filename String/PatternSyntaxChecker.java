import java.util.Scanner;
import java.util.regex.*;

 class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
         
      for(int i=0;i<testCases;i++){
         try{
            Scanner in1 = new Scanner(System.in);
            String pattern = in1.nextLine();
            Pattern.compile(pattern);
            System.out.println("valid");
             
         }catch(Exception exception){
             System.out.println("InValid");
            }
           
        }
        
		
	}
}



