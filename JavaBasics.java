import java.util.*;
public class JavaBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       //Question1: In a program , input 3 numbers : A,B and C. You have to output the average of these 3 numbers.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();

        // int Average = a + b + c / 3;
        // System.out.println("Average of 3 numbers : " + Average );

       //Question2: In a program , input the side of a square. You have to output the area of the square.
    //    int r = sc.nextInt();

    //    int square = r * r ;
    //    System.out.println("Area of the squre : " +square);

   /* Question3: Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. 
   You have to output the total cost of the items back to the user as their bill.
   (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)*/

   float pencil = sc.nextInt();
   float pen = sc.nextInt();
   float eraser = sc.nextInt();

   float total = pencil + pen + eraser;

   System.out.println("Total cost of the iteam : " +total);

   float tax = (total * 0.18f) + total;
   System.out.println("Tax to the iteam in bill :" +tax);



      
     }
}