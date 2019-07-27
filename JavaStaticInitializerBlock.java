import java.io.*;
import java.util.*;


class Solution {
    static boolean flag=false;
    static int B=0;
    static int H=0;

    static{
          
        Scanner s1 = new Scanner(System.in);
           B = s1.nextInt();
           H = s1.nextInt();
            if(B>0 && H>0){
                flag=true;
            }else{
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
    }


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

