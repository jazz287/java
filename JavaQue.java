import java.util.* ;
public class JavaQue{
 // kandanes for negative numbers
        public static void kandanes(int numbers[]) {
       int ms = numbers[0];
       int cS = numbers[0] ;
       for(int i = 1 ; i< numbers.length ; i++){
        cS = Math.max(cS , cS + numbers[i] );
         ms = Math.max(cS,ms);
       }
       
       System.out.print("max number is :" + ms);
        } 
        
      
   
   
    public static void main(String args[]){
        int numbers[] = {-1,-2,-3,-4,-5,-6,-7,-8};

        
     kandanes(numbers);
        
     }

     

}
 
