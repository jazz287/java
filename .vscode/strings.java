import java.util.*;
public class strings{
public static void printStr(String str){

for(int i = 0 ; i < str.length() ; i++){
     System.out.print(str.charAt(i) + " ");
}



}

    public static void main(String args[]){
     /*char arr[] = {'a', 'b', 'c','d','e'};   
     String str = "abcde" ;
     String str2 = new String("xyz") ;

     Scanner sc = new  Scanner(System.in);
     String name = sc.nextLine();
     System.out.println(name); */
    
    String name = "Jasmine";
    String surname = "Wadhwa";
    String fullname = name + " " + surname ;

    // calling out the strings

  printStr(fullname);
   
    }

}