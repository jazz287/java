import java.util.* ;
public class JavaQue{
 //Print subarrays


public static void subArrays(int numbers[]){
   int tS = 0;
   
   for(int i = 0 ; i < numbers.length ; i++){
    int start = i;
    
   
   for(int j = i ; j< numbers.length ; j++){
    int end = j;
    int Sum = 0;
    for(int k = start ; k <= end ; k++){
      Sum += numbers[k] ;
      }
       tS++;
      for( int k = start ; k <= end ; k++ ){
         System.out.print( numbers[k] + " ") ;
         
      }

           System.out.println("sum is :" + Sum); 

    }
     
    
   
    System.out.println();
   
  
  
    
   }
   
   
   System.out.print("total number of subArrays are :" + tS);
   }
   
   




       
    
    
    
 
 
 
 




    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8};

        
     subArrays(numbers);
        
     }

     

}
 
