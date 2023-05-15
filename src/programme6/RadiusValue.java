package programme6;
/**
 * Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class RadiusValue {

    double PI = 3.1428; // pie value 22/7 = 3.1428 (use double data type due to decimal answer)

 // instance method with object created.
    public void v1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius");
        double r = sc.nextDouble();
        double area = (PI*r*r);
        System.out.println("Area of circle is :" + area);
    }
    // main method called.
    public static void main(String[] args) {
        RadiusValue abj = new RadiusValue();
        abj.v1();


    }
}
