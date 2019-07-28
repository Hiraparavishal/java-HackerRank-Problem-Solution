import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
       
        if(a % 2 != 0){
            System.out.println("Weird");
        }else if(a>=2 && a<5 ){
           System.out.println("Not Weird"); 
        }else if(a>=6 && a<=20){
           System.out.println("Weird");   
        }if(a>20){
            System.out.println("Not Weird");
        }
    }
}