import java.util.*;
public class Matrices {

    public static int  search(int matrix[][] ){
        int largest = Integer.MAX_VALUE;
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
              if(largest > matrix[i][j] ){
                largest = matrix[i][j];  
              }
            }
    }
    return largest;
}

public static void spiralmatrix(int matrix[][] ){
  int startRow = 0;
  int startCol = 0 ;
  int endRow = matrix.length - 1;
  int endcol = matrix[0].length-1;

  while(startRow <= endRow && startCol <= endcol){
    //top
    for(int j=startCol ; j <= endcol ; j++){
      System.out.print(matrix[startRow][j]+ " ");
    }
    //right
    for(int i=startRow+1 ; i <= endRow ; i++){
      System.out.print(matrix[i][endcol]+" ");
    }
    //bottom 
    for(int j= endcol-1 ; j>=startCol; j--){
      if(startRow == endRow){
        break;
      }
      System.out.print(matrix[endRow][j] + " ");
    }
    //left 
    for(int i = endRow-1 ;i >= startRow+1 ; i--){
      if(startCol == endcol){
        break;
      }
      System.out.print(matrix[i][startCol]+" ");
    }
    startCol++;
    startRow++;
    endRow--;
    endcol--;
    

    
  }
  System.out.println();
}

public static int diagnol(int matrix[][]){
  int sum = 0;
  for(int i = 0; i <= matrix.length-1 ; i++){
    sum += matrix[i][i];

    if(i != matrix.length-1-i)
      sum += matrix[i][matrix.length-i-1];

   
  }
  return sum;
}
    public static void main(String args[]){
      int matrix[][] = {{1,2,3,4}, 
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
         System.out.println( diagnol(matrix)         );
//        int matrix[][] = new int[4][4];
//        int n = matrix.length , m = matrix[0].length;

//        Scanner sc = new Scanner(System.in);

//        for(int i = 0 ; i<n ; i++){
//         for(int j = 0 ; j < m; j++){
//             matrix[i][j] = sc.nextInt();
//         }
//        }
//        for(int i = 0 ; i < n ; i++){
//         for(int j = 0 ; j < m ; j++){
//            System.out.print( matrix[i][j] + " ");
//         }
//         System.out.println();
//     }

//   System.out.println(search(matrix));
    
// }

    }
  }