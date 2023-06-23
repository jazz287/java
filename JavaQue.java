import java.util.* ;
public class JavaQue{
 //Reverse an Array
public static void Reverse(int numbers[]){
    int first = 0 , last = numbers.length -1  ;
    while(first < last){
        int temp = numbers[last] ;
        numbers[last] = numbers[first];
        numbers[first] = temp ;
        

        first++;
        last--;
        
    }
    
    
 }
 
 
 




    public static void main(String args[]){
        int numbers[] = {4,6,2,8,10,12,14};

        
     Reverse(numbers);
     //print
     for(int i = 0 ; i < numbers.length ; i++){
        System.out.println(numbers[i]);

     }

}
 
}