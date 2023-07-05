import java.util.*;
public class palindrome{
    
    // printing if the string is a palindrome 
public static boolean printPalind(String str){

    int n = str.length();
for(int i = 0 ; i < n ; i++){
 if(str.charAt(i) == str.charAt(n-1-i)){
    System.out.print("It is a palindrome");
    return true;
 }

}
System.out.print("It is not a palindrome");
return false;
}






public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String str1 = sc.next();

// printing the palindrome
printPalind(str1);

}







}