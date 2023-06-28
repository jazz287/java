import java.util.*;
public class profit{
// findinf max profit for stocks
public static void stocks(int Prices[]){

int bP[] = new int[Prices.length];
 bP[0] = Integer.MAX_VALUE ;


int sP[] = new int[Prices.length];
 sP[0] = 0 ;

for(int i = 1 ; i < Prices.length ; i++){
    sP[i] = Math.max(Prices[i] , Prices[i-1]);
}

for ( int i = 1 ; i<Prices.length ; i++){


 bP[i] = Math.min(bP[i-1] , Prices[i-1]);
 
}

int profit[] = new int[Prices.length];
 profit[0] = 0;
int maxProfit = 0 ;
for (int i = 1 ; i < Prices.length ; i++){
     profit[i] = sP[i]- bP[i];
    
  maxProfit = Math.max(profit[i],profit[i-1]);
}

System.out.print("max profit is :" + maxProfit );


}








    public static void main (String args[]){

 int Prices[] = {7,1,5,3,6,4};

 stocks(Prices);
    }
}