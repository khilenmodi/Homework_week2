package programme18;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */

import java.util.Scanner;

public class PrintNumbers {
// using static method
    // use of any number instead of just same number as example
    public static void v1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number"  );
        int a = sc.nextInt();//125 instead of this number any number can be input for result
        System.out.println("please enter the second number" );
        int b = sc.nextInt();//24 instead of this number any number can be input for result
        System.out.println("addition of two numbers :" + a + " + " + b + " = " + (a+b));
        System.out.println("subtraction of two numbers :" + a + " - " + b + " = " + (a-b));
        System.out.println("Multiplication of two numbers :" + a + " * " + b + " = " + (a*b));
        System.out.println("Division of two numbers :" + a + " / " + b + " = " + (a/b));
        System.out.println("Remainder of two numbers :" + a + " mod " + b + " = " + (a%b));

    }

    public static void main(String[] args) {
        v1();
    }
}
