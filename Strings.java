import java.util.*;
public class Strings{

    public static void printLetteres(String name){
      for(int i = 0; i < name.length(); i++){
        System.out.print((int)name.charAt(i) + " ");
      }
    }

    public static boolean isPalindrome(String str){
      for(int i = 0 ; i < str.length()/2 ; i++){
        int n = str.length();
        if(str.charAt(i) !=  str.charAt(n-1-i)){
          return false;

        }
      }
      return true;
    }

    
    public static float getShortest(String path){
      int x = 0 , y = 0 ;
      for(int i=0; i<path.length();i++){
        char dir = path.charAt(i);

        if(dir == 'S'){
          y--;

        }else if(dir == 'N'){
           y++;

        }else if(dir == 'W'){
          x--;

        }else{
          x++;
          
        }
      }
      int X2 = x*x;
      int Y2 = y*y;
      return (float)Math.sqrt(X2 + Y2);
    }


    public static String substr(String str , int si , int ei){
      String subString = "";
      for(int i=si ; i<ei ; i++){
        subString += str.charAt(i);
      }
      return subString;
   }


     public static void largestStr(String fruits[]){
        String largest = fruits[0];
        for(int i = 1; i < fruits.length;i++){
          if(largest.compareTo(fruits[i])<0){
              largest = fruits[i];
          }
        }
        System.out.println(largest);

     }
     public static String toUppercase(String str){
      StringBuilder sb = new StringBuilder("");
      char ch = Character.toUpperCase(str.charAt(0));
      sb.append(ch);

      for(int i = 1; i<str.length();i++){
        if(str.charAt(i) ==  ' ' && i<str.length()-1){
          sb.append(str.charAt(i));
          i++;
          
         sb.append(Character.toUpperCase(str.charAt(i)));

        }else{
          sb.append(str.charAt(i));
        }
      }
      return sb.toString();
     }

     public static String compress(String str){
      String newstr = " ";
      //aaabbcccdd
      for(int i = 0; i<str.length();i++){
        Integer count = 1;
        while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
          count++;
          i++;
        }
        newstr += str.charAt(i);
        if(count > 1){
          newstr += count.toString();

        }
      }
      return newstr;
     }

     
  public static void main(String args[]){
      // Scanner sc = new Scanner(System.in);
      // String word = sc.next();

      // int count = 0;

      // for(int i = 0; i<word.length() ; i++){
      //    char ch = word.charAt(i);

      //   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
      //     count++;
      //   }
      // }
      // System.out.println("Number of vowels are :- " +count);


    // StringBuilder sb = new StringBuilder("");
    // for(char ch = 'a'; ch <='z';ch++){
    //   sb.append(ch +" ");
    // }
    // System.out.println(sb.length());
     String str = "hello  world";

      // String fruits[] = {"apple" , "mango" , " banana"};
   System.out.println(substr(str, 0, 2));
   
      

    }
    
}
