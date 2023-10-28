public class Bitwise {


    public static void oddoreven(int n){
     int bitMask = 1;
     if((n & bitMask) == 0 ){
        System.out.println("even number");
     }else{
        System.out.println("Odd number");
     }
    }

    public static int getbit(int n , int i  ){
        int bitMask = 1<<i;
        if((n & bitMask)== 0){
            return 0; 
        }else{
        return 1;
        }
    }

    public static int Setbit(int n , int i  ){
        int bitMask = 1<<i;
       return n | bitMask;
    }
    public static int clearbit(int n , int i ){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int update(int n , int i , int newbit){
        n = clearbit(n, i);
        int bitMask = newbit<<i;
        return n | bitMask ;
    }

    public static int clearlastbit(int n , int i){
        int bitMask =(~0)<<i;
        return n & bitMask;
    }
   
    public static int countSitbits(int n ){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0 ){
                count++;
            }
            n = n>>1;

        }
        return count;
    }


    public static int clearrangeinbits(int n , int j , int i ){
        int a = ((~0)<<(j+1));
        int b = (i<<1)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static int fastExpo(int a , int n ){
        int ans = 1;
         while(n > 0){
            if((n & 1) != 0 ){
                ans = ans * a;

            }
            a = a * a;
            n = n>>1;

         }
         return ans;
    }

    public static int fastExpoinmod(int a , int n , int z){
        int ans = 1;
         while(n > 0){
            if((n & 1) != 0 ){
                ans = ans * a;

            }
            a = a * a;
            n = n>>1;

         }
         return ans % z;
    }
  public static void main(String args[]){
    System.out.println(countSitbits());
    // int x = 3, y = 4;
    //    System.out.println("Before swap: x = " + x + " and y = " + y);
    //    //swap using xor
    //    x = x ^ y;
    //    System.out.println(x);
    //    y = x ^ y;
    //    System.out.println(y);
    //    x = x ^ y;
    //    System.out.println(x);
    //    System.out.println("After swap: x = " + x + " and y = " + y);
    //    int x = 6;
    //    System.out.println(x + " + " + 1 + " is " + -~x);
    //    x = -4;
    //    System.out.println(x + " + " + 1 + " is " + -~x);
    //    x = 0;
    //    System.out.println(x + " + " + 1 + " is " + -~x);
  
    // System.out.println(5 & 6);
    // System.out.println(5 | 6);
    // System.out.println(~6);
    // System.out.println(5 << 1);
    // System.out.println(5 >> 1);
}
}
