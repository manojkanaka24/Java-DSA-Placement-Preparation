import java.util.*;
public class Functions {

    public static void printhwlloworld(){
        System.out.println("Hello wolrd");
    }


     public static void swap(int a , int b ){

        int temp = a;
        a = b ;
         b = temp;
        System.out.println("a = "+a);
        System.out.println("b = "+b);


     }

     public static void multiple(int a , int b ){
        int product = a * b;
        System.out.println(product);
       
     }

     public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n ;i++){
            f *= i;
        }
        return f ;
     }

     public static int bincoff(int n , int r ){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        
        int bincoff = fact_n / (fact_r * fact_nmr);
        return bincoff;
     }


     public static int sum(int a , int b ){
        return a + b;
     }
     public static int sum (int a , int b , int c ){
        return a + b + c ;
     }


     public static boolean isPrime(int n ){


        if(n == 2 ){
            return true ;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
               return false;
            }
        }
        return true;

     }


     public static void primeinRange(int n){
        for(int i = 2 ; i <= n ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
     }

      public static void binTodec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        
        while(binNum > 0){
            int lastdigite = binNum % 10 ;
            decNum = decNum + (lastdigite *(int) Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal of " +myNum + " = "+decNum);
      }

      public static void decTobin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        
        while(n > 0){
            int rem = n % 2 ;
            System.out.println(rem);
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("binary from of " +myNum + " = "+binNum);

      }

      public static boolean isPalindrome(int number){
        int Palindrome = number;
        int rev = 0;

        while(Palindrome != 0){
            int rem = Palindrome % 10;
            rev = rev * 10 + rem;
            Palindrome = Palindrome / 10;
        }

        if( number == rev){
            return true ;
        }
        
            return false;
        }
      
     public static void main(String args[]){
       decTobin(7);
    //   System.out.println("Please enter a number :");
    //   Scanner sc = new Scanner(System.in);
    //   int Palindrome = sc.nextInt();


    //   if(isPalindrome(Palindrome)){
    //     System.out.println("yes");
    //   }else {
    //     System.out.println("NO");
    //   }

    
     }
}
