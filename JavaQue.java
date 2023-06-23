import java.util.* ;
public class JavaQue{
 //BinarySearch
public static int BinarySearch(int numbers[],int key){
    int start = 0 ,end = numbers.length-1 ;
    while(start <= end){
        int mid = (start + end)/2 ;
         if(key==numbers[mid]){
            return mid;
         }
         if(key < numbers[mid]){
            end = mid -1;
         }
         else{
            start = mid +1;
         }
    }
    return -1 ;
    
 }
 
 
 




    public static void main(String args[]){
        int numbers[] = {4,6,2,8,10,12,14};
        int key = 10;
        int index = BinarySearch(numbers,key) ;
        System.out.println("number is : " + index);



}
 
}