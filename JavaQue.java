
public class JavaQue{

public static boolean isPrime(int n){
    boolean isPrime = true;
 for(int i = 2 ;i<=n-1 ; i++){
    if(i % n == 0){
        isPrime = false;
        break;
    }
 }
return isPrime;
}

    public static void main(String arg[]){
    
    System.out.print( isPrime(5));
    

    
    

    
 



    } 
}