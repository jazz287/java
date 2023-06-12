import java.util.*;
public class JavaQue{
    public static void main(String arg[]){
     Scanner sc = new Scanner(System.in);
    
     

     do{
       System.out.print("Enter a number :");
        int num = sc.nextInt() ;
      if(num % 10 == 0){
         continue;
      }
   System.out.println("The number was: " + num);
      
     }
      
      while(true);
 
 



    } 
}