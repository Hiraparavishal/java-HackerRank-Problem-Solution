import java.util.*;
import java.io.*;
class Solution{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        
        while (sc.hasNext()) {
            
            String input=sc.next();
            char[] chars = input.toCharArray();
            Stack<Character> s = new Stack<Character>();
            if(input.length() % 2 == 0){
                int flag=0;
                int flag1=0;
                for(int i=0;i< input.length();i++){
                    if(chars[i] == '{' || chars[i] == '(' || chars[i] == '['){
                       s.push(chars[i]);
                    }else{
                        if(s.empty() == true){
                           flag1=1;
                        }else{
                            char y = (Character) s.pop();
                             if(y == '{' && chars[i] == '}'){
                                flag = 1;
                            }
                            if(y == '[' && chars[i] == ']'){
                                flag = 1;
                            }
                            if(y == '(' && chars[i] == ')'){
                                flag = 1;
                            }
                        }
                    }
    
                } 
                if(flag1==1){
                    System.out.println("false");
                }else if(flag==0)
                {
                    System.out.println("false");
                }else if(flag==1){
                    System.out.println("true");
                }

            }else{
                System.out.println("false");
            }
            

            
        }
        
    }
}



