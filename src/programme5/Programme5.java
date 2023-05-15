package programme5;
/**
 * Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */


import java.util.Scanner;

public class Programme5 {
// scanner method is used to scan the value
 // no return with parameters
    public static void main(String[] args) {
       Programme5 obj = new Programme5();
        Scanner sc = new Scanner(System.in);
        addition(10,30); // parameters
        division(30,15);
        obj.substraction(50,20);
        obj.multiplication(40,10);

    }
    //  two static method
    public static void addition (int a, int b) {
        int ans = a + b;
        System.out.println("Addition of two numbers " + a + " and " + b + " is :" + ans);
    }
    public static void division (int a, int b) {
        int ans = a/b;
        System.out.println("division of two numbers" + a + " and "+ b + " is :"+ ans);
    }
    // two  instance method
    public void multiplication (int a, int b) {
        int z= a*b;
        System.out.println("multiplication of two number" + a + " and " + b + " is : " + z);
    }
    public void substraction (int a, int b) {
        int v=a-b;
        System.out.println("substraticon of two number " + a + "and" + b + " is :" + v);
    }
}
