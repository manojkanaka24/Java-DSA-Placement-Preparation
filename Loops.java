import java.util.*;

public class Loops {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int counter = 1;
        // int sum = 0;
       
        // while(counter <= n){
        //     sum += counter;
        //     counter++;
        // }
        // System.out.println("Sum is : " +sum);


        // for(int i = 1 ; i<=4 ;i++){
        //     System.out.println("* * * *");
        // 

        // int i = 1;
        // while(i<=4){
        //     System.out.println("* * * *");
        //     i++;
        // }
        // System.out.println();



        // int n = 10899;
        // while( n > 0) {
        //     int lastdigite = n % 10 ;
        //     System.out.print(lastdigite+ " ");
        //     n = n / 10 ;

            
        // }
        // System.out.println();


        // int n = 10899;
        // int rev = 0 ;
        
        // while(n > 0){
        //     int lastdigite = n % 10;
        //     rev = ( rev * 10 ) + lastdigite;
        //     n = n / 10;
        // }
        // System.out.println( rev  );



        //    int counter = 1;

        // do{
        //     System.out.println("hello world");
        //     counter++;

        // }while(counter <=10);


    //    do{
    //     System.out.println("Enter the number : ");
    //     int w = sc.nextInt();

    //     if(w % 10 == 0 ){
    //         continue;
    //     }
    //     System.out.println(w);
    //    }while(true);


    // for(int i = 1 ; i <= 10 ; i++){
    //     if(i == 8){
    //         continue;
    //     }
    //     System.out.println(i);
    // }



    // System.out.println("Enter number ");
    // int n = sc.nextInt();
    
    // if(n == 2){
    //  System.out.println("n is prime number ");
    // }else{
    //     boolean isPrime = true;
    //     for(int i=2 ;i<= Math.sqrt(n);i++){
    //         if(n % i == 0){
    //             isPrime = false;
    //         }
    //     }
    
    // if(isPrime == true){
    //     System.out.println("n is the prime number");
    // }else{
    //     System.out.println("n is not a prime number");
    // }
    // }


    int choice;
    int evenSum = 0;
    int oddSum = 0;

    do{
        System.out.println("Enter any number : ");
        int number = sc.nextInt();

        if( number % 2 == 0) {
            evenSum += number;
        } else {
            oddSum += number;
        
        }

        System.out.print("Do you want to continue? Press 1 for yes or 0 for no");

         choice = sc.nextInt();

    }  while(choice == 1);
    System.out.println("Sum of even numbers: " + evenSum);

       System.out.println("Sum of odd numbers: " + oddSum);
   }
}
    





    

