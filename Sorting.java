import java.util.*;
import java.util.Collection;

public class Sorting {

    public static void bubbleSort(int arr[]){
      for(int trun = 0 ; trun < arr.length -1 ; trun++){
        for(int j=0 ; j < arr.length-1-trun ; j++){
            if(arr[j] > arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
             }
        }
      }
    }
    

  

    public static void  selectionSort(int arr[]){
        for(int i=0 ; i < arr.length-1 ; i++){
            int minpos = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                    
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int arr[]){
        for(int i=0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }






    
    public static void insertionSort(int arr[]){
        for(int i=1; i < arr.length ; i++){
            int curr = arr[i] ;
            int prv = i - 1;    
            while(prv >= 0 && arr[prv] > curr){
                arr[prv+1]=arr[prv];
                prv--;
               
            }
            arr[prv+1]=curr;
            System.out.println(arr[prv+1]);     
        }
    }
    // public static void printArr(int arr[]){
    //     for(int i=0 ; i < arr.length ; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    // }









    
    public static void CountSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
            // System.out.println(largest);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i <arr.length ; i++){
        
            System.out.println(count[arr[i]]++);

        }
        int j = 0;
        for(int i=0;i< count.length; i++){
            while(count[i] > 0 ){
                arr[j] = i ;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // Integer arr[] = {3,6,2,1,8,7,4,5,3,1};
        // Arrays.sort(arr);
        // Arrays.sort(arr,  Collections.reverseOrder());
        // insertionSort(arr);
        
      CountSort(arr);
        printArr(arr);
    }
    
}
