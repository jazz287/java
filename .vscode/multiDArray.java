import java.util.*;
public class multiDArray{

public static int Search(int matrix[][],int largest){
  for(int i = 0 ; i <matrix.length ; i++){
    for(int j =0 ; j< matrix[0].length ; j++){
       if(matrix[i][j] > largest){
        largest = matrix[i][j];
       }
  }
  }
return largest ;
}
public static void main (String args[]){
int largest = Integer.MIN_VALUE ;
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
 
 System.out.print(Search(matrix,largest));

}
}
