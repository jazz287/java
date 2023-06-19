
public class JavaQue{

public static int binaryConversion(int n){
     int pow = 0;
     int decNum = 0;
    for(  n = n  ; n > 0  ; n= n/10 , pow++ ){
        int lastDigit = n % 10;
        decNum = decNum + (lastDigit * (int) Math.pow(2,pow));
        
    }

return decNum;
}

    public static void main(String args[]){
    
    System.out.print( binaryConversion(100));
    

    
    

    
 



    } 
}