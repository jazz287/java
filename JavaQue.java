
public class JavaQue{

public static boolean isPrime(int n){
// 1 is neither prime nor composite
  if(n==2){
return true;

}
 for(int i = 2 ;i<= Math.sqrt(n) ; i++){ //optimized code
    if( n % i == 0){
        return false;
    }
    
 }
return true;
}

public static void primesInRange(int n){
for(int i= 2 ; i <= n ; i++) {
    if(isPrime(i)){
        System.out.print(i + " ");
    }
}

}

    public static void main(String args[]){
    
    primesInRange(16);
    

    
    

    
 



    } 
}