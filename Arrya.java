import java.util.*;
public class Arrya {


    public static int linear(int number[] , int key ){
        for(int i = 0; i < number.length ; i++){
           
            if(number[i] == key){
                return i;
            }
        }
        return -1 ;
    }


    public static int food(String menu[] , String key){
        for(int i = 0; i < menu.length ; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1 ;
    }

    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i<number.length ; i++){
            if(largest < number[i]){
                largest = number[i];
            }
        }
        return largest ;

    }


    public static int binarySearch(int number[] , int key){
        int start = 0 , end = number.length-1;

       while( start <= end ){
        int mid = (start + end)/2;

        if(number[mid]==key){
            return mid;
        }
        if(number[mid] < key){
            start = mid + 1;
        }
        else{
            end = mid -1 ;
        }
       }
       return -1;

        }
    


        public static void reverse(int number[]){
            int first = 0 , last = number.length-1;

            while(first < last){
                int temp = number[last];
                number[last]=number[first];
                number[first] = temp;

                first++;
                last--;

       }
        }

        public static void printpair(int numbers[]){
            int tp = 0;
            for(int i = 0 ; i<numbers.length ;i++){
                int curr = numbers[i];
                for(int j = i+1 ; j < numbers.length ;j++){
                    System.out.print("(" +curr +"," + numbers[j] +")");
                    tp++;
                }
                System.out.println();
            }
            System.out.println(tp);
        }


         public static void subarray(int numbers[]){

            int ttp = 0;
            for(int i = 0 ;i < numbers.length ;i++){
                int start = i;
                for(int j = i ; j<numbers.length ;j++){
                    int end = j;
                    for(int k = start ; k <= end ; k++){
                        System.out.print(numbers[k]+ " ");
                       
                    }
                    ttp++;
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("ttp is : "+ttp);
         }



         public static void Maxsubarraysum(int numbers[]){

            int currsum = 0 ;
            int maxSum = Integer.MIN_VALUE;
            for(int i = 0 ;i < numbers.length ;i++){
                int start = i;
                for(int j = i ; j<numbers.length ;j++){
                    int end = j;
                    currsum = 0;
                    for(int k = start ; k <= end ; k++){
                       currsum+=numbers[k];

                    } 
                   System.out.println(currsum);
                   if(maxSum < currsum){
                    maxSum = currsum ;
                   }
                }
                System.out.println();
            }
            System.out.println("max sum is : "+maxSum);
         }


         public static void Maxsubarraysumperfix(int numbers[]){

            int currsum = 0 ;
            int maxSum = Integer.MIN_VALUE;
            int perfix[] = new int[numbers.length];

            perfix[0] = numbers[0];
            for(int i = 1; i < numbers.length ;i++){
                perfix[i] = perfix[i-1] + numbers[i];
            }

            for(int i = 0 ;i < numbers.length ;i++){
                int start = i;
                for(int j = i ; j<numbers.length ;j++){
                    int end = j;
                       currsum = start == 0 ? perfix[end] : perfix[end]-perfix[start-1];
                       System.out.println(currsum);
                   if(maxSum < currsum){
                    maxSum = currsum ;
                   }
                }
             
            }
            System.out.println("max sum is : "+maxSum);
         }

         public static void kadannes(int numbers[]){
            int cs = 0 ;
            int ms = Integer.MIN_VALUE;

            for(int i = 0 ; i<numbers.length ; i++){
                cs = cs + numbers[i];
                if(cs < 0 ){
                    cs = 0;
                   
                }
              
                ms = Math.max(cs , ms);
                
            }
            System.out.println("max number of subbarrya is : "+ms);
         }







         
     public static void main(String args[]){
      int numbers[] =  {4,5,6,7,0,1,2};
      System.out.println(binarySearch(numbers, 0));
       
       
    //    reverse(number);

    //      for(int i = 0; i<=number.length-1 ;i++){
    //         System.out.print(number[i]+ " ");
    //      }
    //      System.out.println();
      
      





        // int number[] = {2,4,6,8,10,12,14,16,18};
        // int key = 10;


        // int index = linear(number, key);
        // if(index == -1){
        //     System.out.println("key not found");
        // }else{
        //     System.out.println("Key found at index : "+index);
        // }


    //  int marks[] = new int[50];
    //  Scanner sc = new Scanner(System.in);
      
    //  marks[0] = sc.nextInt();
    //  marks[1] = sc.nextInt();
    //  marks[2] = sc.nextInt();

    //  System.out.println("phy : " + marks[0]);
    //  System.out.println("che : " + marks[1]);
    //  System.out.println("math : " + marks[2]);

    //  marks[2] = marks[2] + 1 ;
    //  System.out.println("math : " + marks[2]);

    }
    
}
 