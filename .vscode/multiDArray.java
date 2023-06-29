import java.util.*;
public class multiDArray{

public static boolean Search(int matrix[][],int key,int n , int m){
  for(int i = 0 ; i <n ; i++){
    for(int j =0 ; j< m ; j++){
        if(matrix[i][j]==key){
        System.out.println("key found at"+ "(" + i +"," + j + ")");
        return true ;
        }  
}
  }
  System.out.print("key not found");
  return false;
}

public static void main (String args[]){
int matrix[][] = new int [3][3];
int n = matrix.length , m = matrix[0].length;

Scanner sc = new Scanner(System.in);
for(int i = 0 ; i <n ; i++){
    for(int j =0 ; j< m ; j++){
     matrix[i][j] = sc.nextInt();
    }
}

//for printing output
for(int i = 0 ; i<n ; i++){
    for(int j = 0 ; j< m ; j++){
        System.out.print( matrix[i][j] + " " );
    }
    System.out.println();
}
 
 Search(matrix,5,n,m);

}
}
