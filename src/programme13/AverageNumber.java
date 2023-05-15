package programme13;
/**
 * Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */

import java.util.Scanner;

public class AverageNumber {

    public  void  m1(){
        Scanner sc = new Scanner(System.in);
           // declare three numbers
           // use the double data type as result could be in decimal numbers.
            double a = 0;
            double b = 0;
            double c= 0;
        /**
         * declare sum variable
         * and initialize with 0
          */
        double sum = 0;
        double avg = 0;
        System.out.println("please enter the first number"); // user can enter any number
        a  = sc.nextDouble();
        System.out.println("please enter the second number");// user can enter any number
        b = sc.nextDouble();
        System.out.println("please enter the third number");// user can enter any number
        c = sc.nextDouble();
        sum = a + b + c;
        avg = sum/3;
        System.out.println("Avarage : " + avg);

    }

    public static void main(String[] args) {
        AverageNumber abj= new AverageNumber();
        abj.m1();

    }
}
