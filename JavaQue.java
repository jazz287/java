
public class JavaQue{

public static int binaryConversion(int n){
     int pow = 0;
     int decNum = 0;
    while(n>0){
        int lastDigit = n % 10;
        decNum = decNum + (lastDigit * (int) Math.pow(2,pow));
        pow++;
        n = n / 10 ;
    }

return decNum;
}

    public static void main(String args[]){
    
    System.out.print( binaryConversion(100));
    

    } 
}