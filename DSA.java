import java.util.HashSet;

public class DSA {


    // tarpped Rain water M1    
    public static int tarppedRainwater(int height[]){
        int n = height.length;


        //leaft boundry max 
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1 ;i < n;i++){
            leftMax[i] = Math.max(height[i] , leftMax[i-1]);
        }
    

    //rigth boundry max 
    int rigthMax[] = new int[n];
    rigthMax[n-1] = height[n-1];
    for(int i=n-2; i >=0;i--){
        rigthMax[i] = Math.max(height[i] , rigthMax[i+1]);
    }

    int tarppedwater = 0;
    for(int i = 0 ;i<n;i++){
        int waterlevel = Math.min(leftMax[i], rigthMax[i]) ;
        tarppedwater += waterlevel - height[i];
        System.out.println(tarppedwater);
    }
    return tarppedwater;
}

//tarpped Rain water M2
public static int  tarppedRainwaterM2(int hegith[]){
    int n = hegith.length;
    int res = 0; 
    int r = n - 1;
    int l = 0 ;
    int rMax = hegith[r];
    int lMax = hegith[l];

    while(l < r){
       
        if(lMax < rMax){
            l++;  
             lMax = Math.max(lMax, hegith[l]);
              res += lMax - hegith[l];
      }
        else{
            r--;
             rMax = Math.max(rMax, hegith[r]); 
              res += rMax - hegith[r]; 
                 
        }
    }
    return res;
}   

//buy and sell stock
 public static int buyandsellstock(int price[]){
    int buyPrice = Integer.MAX_VALUE;
    int Profit = 0 ;

    for(int i = 0; i < price.length ; i++){
        if( buyPrice < price[i]){
            // int profit = price[i]-buyPrice ;
            Profit = Math.max(Profit, price[i]-buyPrice );

        }else{
            buyPrice = price[i];
        }
    }
    return Profit;

 }

 public static boolean containDuplicate(int nums[]){
    HashSet<Integer> set = new HashSet<>();
    for(int i = 0; i < nums.length; i++){
        if(set.contains(nums[i])){
            return true;
        }else{
            set.add(nums[i]);
        }
    }
    return false;
 }
    public static void main( String args[]){
        int height[] = {1,1,2,3,3};
   System.out.println(containDuplicate(height));

    // int hegith[]={ 1,8,6,2,5,4,8, 3, 7};
    // System.out.println(tarppedRainwater(hegith));
   

    }
    
}
