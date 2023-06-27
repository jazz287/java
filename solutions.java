import java.util.*;

public class solutions {
// calculating trapped water in blocks using the most optimized approach Time complexity : O(n)

public static void trappedWater(int height[]){
// calculate left max boundary - array
// calculate right max boundary- array

// loop for both the operations and to calculate the water level
// waterlevel
// trapped water = water level - height[i]

int n = height.length;
int leftmax [] = new int [n];
leftmax[0] = height[0];
for(int i = 1 ; i < n ; i++){
leftmax[i] = Math.max(height[i] , leftmax [i -1]);

}


int rightmax[] = new int [n];
rightmax[n-1] = height[n-1];
for(int i = n-2 ; i >= 0 ; i--){
rightmax[i] = Math.max(height[i] , rightmax[i+1])  ;

}
int trappedWater = 0;
for(int i = 0 ; i < n ; i++) {
int waterlevel = Math.min(leftmax[i] , rightmax[i]);
 trappedWater += waterlevel - height[i];
}

System.out.print("trapped water is" + trappedWater);

}









public static void main(String args[]){

int height [] = {4,2,0,6,3,2,5};

trappedWater(height);



}


}