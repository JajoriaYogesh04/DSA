// import java.util.*;

// public class ConditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // int age= 15;     IF-else
//         // if (age>=18) {
//         //     System.out.print("ADULT");
//         // }
//         // if (age>=13 && age<18) {
//         //     System.out.print("TEENAGER");
//         // }
//         // else{
//         //     System.out.print("CHILD");
//         // }

//         // int a= 35;       //Largest of two numbers
//         // int b= 20;
//         // if (a>b) {
//         //     System.out.println("LARGEST: A");
//         // }
//         // else{
//         //     System.out.println("LARGEST: B");
//         // }

//         // int num= sc.nextInt();     //Even and odd numbers
//         // if(num%2==0){
//         //     System.out.println("EVEN");
//         // }
//         // else{
//         //     System.out.println("ODD");
//         // }

//         // int age= sc.nextInt();      //Else-if
//         // if(age>=18){
//         //     System.out.println("ADULT");
//         // }
//         // else if(age>=13 && age<18){
//         //     System.out.println("TEENAGER");
//         // }
//         // else{
//         //     System.out.println("CHILD");
//         // }

//         // int income= sc.nextInt();       //Income tax calculator
//         // float tax=0;
//         // if(income<500000){
//         //     tax=0;
//         //     System.out.println("Tax: "+ tax);
//         // }
//         // else if(income>=500000 && income<1000000){
//         //     tax=(0.20f*income);
//         //     System.out.println("Tax: "+ tax);
//         // }
//         // else{
//         //     tax=(0.30f*income);
//         //     System.out.println("Tax: "+ tax);
//         // }
//     }
// }

// import java.util.Scanner;       //Largest of three numbers       
// public class ConditionalStatements {
//     public static void main(String args[]) {
//         Scanner sc= new Scanner(System.in);
//         int a= sc.nextInt();
//         int b= sc.nextInt();
//         int c= sc.nextInt();
//         // if(a<b){
//         //     if(b>c){
//         //         System.out.println("Greatest: B");
//         //     }
//         //     else if(c>b){
//         //         System.out.println("Greatest: C");
//         //     }
//         // }
//         // else if(a>b){
//         //     if(a>c){
//         //         System.out.println("Greatest: A");
//         //     }
//         //     else if(c>a){
//         //         System.out.println("Greatest: C");
//         //     }
//         // }
//         if((a>=b) && (a>=c)){
//             System.out.println("Greatest: A");
//         }
//         else if(b>=c){
//             System.out.println("Greatest: B");
//         }
//         else{
//             System.out.println("Greatest: C");
//         }
//     }
// }


// import java.util.Scanner;       
// public class ConditionalStatements{
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         // int number= sc.nextInt();        //Ternary Operators
//         // String type= (number%2 == 0)?"EVEN":"ODD";
//         // System.out.println(type);
        
//         int marks= sc.nextInt();            //Pass-fail
//         String result= (marks>33)?"PASS":"FAIL";
//         System.out.println(result);
//     }
// }


import java.util.*;
public class ConditionalStatements{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        int choice=sc.nextInt();            //Switch Statements
        switch (choice) {
            case 1: System.out.println("Pizza");
            break;
            case 2: System.out.println("Burger");
            break;
            case 3: System.out.println("Mango Shek");
            break;
            default: System.out.println("Wake up to reality");
        }
    }
}