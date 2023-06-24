import java.util.* ;
public class JavaQue{
 //Reverse an Array
public static void Reverse(int numbers[]){
    int temp[] = new int[numbers.length];
    for(int i = 0 ; i < numbers.length ; i++){
        temp[i] = numbers[numbers.length-1-i];
        
    }
    for (int i = 0 ; i < temp.length ; i++){
        numbers[i]= temp[i];
    }
    
        
    }
    
    
 
 
 
 




    public static void main(String args[]){
        int numbers[] = {4,6,2,8,10,12,14};

        
     Reverse(numbers);
     for(int i = 0 ; i < numbers.length ; i++){
        System.out.println(numbers[i]);
     }

     }

}
 
