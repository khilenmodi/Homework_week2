package Programme16;
/** Write a Java program to add two binary numbers.
    Input Data:
    Input first binary number: 10
    Input second binary number: 11

 s – the String containing the integer representation to be parsed
 radix – the radix to be used while parsing s.
 */

import java.util.Scanner;

public class BinaryNumbers {
    long b1= 0;
    long b2= 0;
    public static void m1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first binary numbers ="); //10
        String b1 = sc.nextLine();
        System.out.println("enter the second binary numbers =");//11
        String b2 = sc.nextLine();
        int num1 = Integer.parseInt(b1,2);
        int num2 = Integer.parseInt(b2,2);
        int ans = num1 + num2 ;
        System.out.println("Answer =" + Integer.toBinaryString(ans));//Integer is converted into a string.
    }

    public static void main(String[] args) {
        m1();
    }

}
