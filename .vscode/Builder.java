import java.util.*;
public class Builder{


    public static void main(String args []){
    StringBuilder sb = new StringBuilder("");

    for(char ch ='a' ; ch <= 'z' ; ch++){
        sb.append(ch);
    }
    // printing abcdefghijklmnopqrstuvwxyz
    System.out.print(sb);
    }
}