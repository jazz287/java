import java.util.*;
public class palindrome{
    
    // printing if the string is a palindrome 
public static boolean printPalind(String str){

    int n = str.length();
for(int i = 0 ; i < n/2 ; i++){
 if(str.charAt(i) == str.charAt(n-1-i)){
    System.out.println("It is a palindrome");
    return true;   
 }

}
System.out.println("It is not a palindrome");
return false;
}






public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str1 = sc.next();

// printing the palindrome

System.out.print (printPalind(str1));

}







}