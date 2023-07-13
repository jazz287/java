public class SrringCompression {

public static void main(String args[]){
    String str = "aaabbccd" ;
    // defining new String
    String newStr = "" ;
 
 
    StringBuilder sb = new StringBuilder("");
    for(int i = 0 ; i < str.length()  ; i++){
           int Count = 1;
        while (i< str.length() -1 && str.charAt(i) == str.charAt(i+1)) {
            Count ++ ;
            i ++ ;
        }
        sb.append(str.charAt(i));
        if (Count > 1){

            sb.append(Count);
        }
      
        }

        System.out.print(sb.toString());
        }
    }









