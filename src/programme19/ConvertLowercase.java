package programme19;

import java.util.*;

public class ConvertLowercase {
//Write a Java program to convert a given string into lowercase.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("input a string :"); // Please enter any string or line in capital letter
        String line = in.nextLine();  // preferred sting would be " THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"
        line = line.toLowerCase(Locale.ROOT);
        System.out.println(line);


    }

}
