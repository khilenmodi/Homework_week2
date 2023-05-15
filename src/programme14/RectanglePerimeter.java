package programme14;
/** Write a Java program to print the area and perimeter of a rectangle.

 Test Data:
 Width = 5.5 Height = 8.5

 Expected Output:
 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

import java.util.Scanner;

public class RectanglePerimeter {
 // value of expected output area is 5.6 and given test data in width is 5.5
   public void m1() {

       Scanner sc = new Scanner(System.in);
       double width = 5.6; // user have taken 5.6 rather than 5.5
       double height = 8.5;
       double area = (width * height);
       double Perimeter = (2 * (width + height));
     //  System.out.printf("Area is %.1f * %.1f = %.2f \n", width, hight, area);
       //System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f \n", hight, width, Perimeter);
       System.out.println("Rectangle area :" + area);
       System.out.println("Rectangle perimeter :"+ Perimeter);
   }

    public static void main(String[] args) {
        RectanglePerimeter abj = new RectanglePerimeter();
        abj.m1();
    }

}
