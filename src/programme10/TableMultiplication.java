package programme10;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */


import java.util.Scanner;
public class TableMultiplication {

    public static void table (){ // static method
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int a= sc.nextInt();
        int b = 1;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;// increase value b of every time it goes to next line
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b)); b++;
        System.out.println(a+" * " + b +" = " +(a*b));

    }

    public static void main(String[] args) {
        table();
    }
}
