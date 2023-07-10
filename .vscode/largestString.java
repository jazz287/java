public class largestString {





// prints largest substring using lexical demogrphy . 

public static void main(String args[]){
 String fruits [] = {"apple" , "mango" , "banana"} ;
 String largest = fruits[0];
// using compareTo method
 for(int i = 0 ; i<fruits.length ; i++){
    if(largest.compareTo(fruits[i]) < 0){
        largest = fruits[i];
    }
 }
System.out.print(largest);
 }
}
// Time complexity O(x*n) , where x is number of characters and n are number of strings