package programme17;
//Write a Java program to convert a decimal number to binary number.

import java.util.Scanner;

public class DecimalToBinary {
    // using instance method
    public void m1() {
        Scanner sc = new Scanner(System.in); //using scanner syntax
        System.out.println("please enter the decimal number");
        int a = sc.nextInt();
        System.out.println("Binary number : " + Integer.toBinaryString(a));// used integer to binary syntax
    }

    public static void main(String[] args) {
        DecimalToBinary abj= new DecimalToBinary();
        abj.m1();
    }
}
