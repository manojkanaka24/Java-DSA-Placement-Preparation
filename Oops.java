public class Oops {
    public static void main (String[] args){
     
     Queen r = new Queen();

    r.moves();

    } 
}

interface chessPlayer{
  void moves();
}
  
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("1 2 3 4 5 6 ");
    }

}

class Rook implements chessPlayer{
    public void moves(){
        System.out.println("1  ");
    }

}

class King implements chessPlayer{
    public void moves(){
        System.out.println("1 2 ");
    }

}


// abstract class Animal{

//     void eat(){
//         System.out.println("eats");
//     }
     
//     abstract void walk();
//     Animal(){
//         System.out.println("animal constructor is called ");
//     }

// }
//  class Horse extends Animal{

//     void walk(){
//         System.out.println("walks on 4 legs");
//     }
//     Horse(){
//         System.out.println("Horse constructor is called ");
//     }
//  }

// //   class chiken extends Animal{
// //     void walk(){
// //         System.out.println("walks on 2 leges");
// //     }
// //   }
//  class Mustang extends Horse{
//    Mustang(){
//         System.out.println("Mustang constructor is called ");
//     }
//  }

// //   class Animal{
// //     String color;

// //     void eat(){
// //         System.out.println("eats");
// //     }

// //     void breath(){
// //         System.out.println("YES");
// //     }


// //   }

// //   class Mammal extends Animal{
// //     int legs;
// //   }

// //   class Dog extends Mammal{
// //     String breed;
// //   }

// // //   class fish extends Animal{
// // //     int fins;

// // //       void swim(){
// // //         System.out.println("swims in water");
// // //       }
// // //   }
// //     //  pen p1 =  new pen();
// //     //  p1.setcolor("bule");
// //     //  System.out.println(p1.getColor());
// //     //  p1.settip(6);
// //     //  System.out.println(p1.getTip());
   

// //     // Student s1 = new Student();
// //     // s1.name = "Manojknaka";
// //     // s1.Rollnumber = 31;
// //     // s1.password = "Smk@06";
// //     // s1.marks[0] = 100;
// //     // s1.marks[1] = 20;
// //     // s1.marks[2] = 34;


// //     //  Student s2 = new Student(s1);
// //     //  s2.password = "xyz";

// //     //  s1.marks[2] = 100;
// //     //  for(int i = 0; i < 3; i++){
// //     //     System.out.println(s2.marks[i]);
// //     //  }


    


// //     //   bankAccount myACC = new bankAccount();
// //     //   myACC.username = "manoj kanaka";
// //     //   myACC.setPassword("bdbfkjhsvjhsd");
  

// // // class bankAccount{
// // //     public String username;
// // //     private String password;
// // //       public void setPassword(String pwd) {
// // //         password = pwd;
// // //     } 
// // // }



// // //Constructor 
// // class Student{
// //     String name;
// //     int Rollnumber;
// //     String password;
// //     int marks[];
 
// //     //shallow copy Constructor
// // //   Student(Student s1){
// // //    marks = new int[3];
// // //    this.name = s1.name;
// // //    this.Rollnumber = s1.Rollnumber;
// // //    this.marks = s1.marks;
// // //   }

// //     // Deep copy Constructor
// //     Student(Student s1){
// //         marks = new int[3];
// //         this.name = s1.name;
// //         this.Rollnumber = s1.Rollnumber;
// //         for(int i = 0 ; i < marks.length ; i++){
// //             this.marks[i] = s1.marks[i];
// //         }
// //        }
     


// //     Student(){//Non parameterzied
// //         marks = new int[3];
// //     System.out.println("Hi, Welcome...");
// //     }
// //     Student(String name ){// parameterzied
// //         marks = new int[3];
// //      this.name = name;
// //         }
// //         Student(int Rollnumber){// parameterzied
// //             marks = new int[3];
// //             this.Rollnumber = Rollnumber;
// //                }

// // }
// // class pen {
// //     private String color;
// //     private int tip;
      
// //     String getColor(){
// //         return this.color;
// //     }
// //     int getTip(){
// //         return this.tip;
// //     }

// //     void setcolor(String newColor){
// //         color = newColor;

// //     }
    
// //     void settip(int newTip){
// //         tip = newTip;
// //     }
// // }
