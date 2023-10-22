public class Patterns2 {

    public static void hallow_rectangle1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void inverted(int n){
      for(int i = 1; i <= n ; i++){

        for(int j = 1 ; j <= n-i; j++){
            System.out.print(" ");
        }
        for(int j = 1; j<= i;j++){
            System.out.print("*");
        }
        System.out.println();
      }
     
    }

    public static void inverted_number (int n){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n-i+1 ;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

     public static void floyd(int n ){
        int counter = 1;

        for(int i = 1 ; i <= n; i++){
            for(int j = 1 ;j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
     }
      
     public static void zero_one(int n ){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
     }


      public static void Butterfly(int n ){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print("  ");
            } 
            for(int j = 1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }


        
      }

      public static void solid_rhombus(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <=n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
      }

      public static void hallow_rectangle(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j <=(n-i); j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n ; j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
               

            }
            System.out.println();
        }
      }
      public static void dimond(int n ){
        for(int i = 1;i<=n ; i++){
            for(int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n;i>=1 ; i--){
            for(int j = 1; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

      }


      public static void number_pyramid(int n){
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j<=n-i ;j++){
                System.out.print(" ");
            }
            for(int j =1 ; j<=i ;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
      }

      public static void Palindromeofthenumber(int n ){
        for(int i = 1; i<=n ; i++){

            for(int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }
              for(int j=i; j>=1; j--){
                System.out.print(j);
              }
              for(int j = 2;j<=i;j++){
                System.out.print(j);
              }
              System.out.println();
        }      
    }


    public static void reverse(int n ){
        for(int i = n ; i >= 1 ; i--){
            System.out.println(i);
        }
    }

    public static void inverted_part1(int n){
        for(int i = 1; i<=n ;i++){
            for(int j = 1 ; j<=n-i ; j++){
                System.out.print("@");
            }
            System.out.println();
        }
    }


    public static void aplha(int n){
        char ch = 'A';
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
      public static void main(String args[]){
      inverted_part1(6);
     

    }
    
}
