import java.util.*;
public class conditionalsat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int a = 1, b = 3 , c = 6;

        // if((a>=b) && (a>=c)){
        //     System.out.println("a is great");
        // }
        // else if (b>=c){
        //     System.out.println("b is great");
        // }
        // else{
        //     System.out.println("c is great");
        // }



    //    int marks = 34;
    //    String result = (marks >= 33)?"Pass" :" fail";
    //    System.out.println(result);

    // System.out.println("Enter a : ");
    // int a = sc.nextInt();
    // System.out.println("Enter b : ");
    // int b = sc.nextInt();
    // System.out.println("Enter operator : ");
    // char operator = sc.next().charAt(0);

    System.out.println("INPUT THE YEAR : ");
    int year = sc.nextInt();

    boolean x = (year % 4) == 0;
    boolean y = (year % 100)!= 0;
    boolean z = (year % 100 == 0 && year % 400 == 0);

    if(x && (y || z)){
        System.out.println(year+ "is leap year");
    }
    else {
        System.out.println(year+ "is not a leap year");
    }

    }
    
}
