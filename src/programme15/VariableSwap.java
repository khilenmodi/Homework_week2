package programme15;

import java.util.Scanner;

public class VariableSwap {
    //Write a Java program to swap two variables.
    // using of Instance method
    public void V1(){
        Scanner sc = new Scanner(System.in);
        int a = 6, b = 7;
        int temp; // temp is created to switch the value of int a
        temp = a;
        a = b;
        b = temp;
        System.out.println("value after swapping");
        System.out.println("a="+a+ " b=" + b);
    }

    public static void main(String[] args) {
        VariableSwap abj= new VariableSwap();// objective created to support Instance method
        abj.V1();
    }
}
