package programme9;

//Write a program to convert the upper case to lower case.

import java.util.Scanner;

public class ConvertUpperCase {

       public void m1(){
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the uppercase");
           String str = sc.nextLine();
           System.out.println(str.toLowerCase());
       }




    public static void main(String[] args) {
           ConvertUpperCase abj = new ConvertUpperCase();
           abj.m1();

    }

}
