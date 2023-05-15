package programme8;

//Write a program to calculate the area of a triangle.

public class TriangleArea {

    // using instance method create an object
     public void v1 () {
         float a = 5;
         float h = 13, area;
         area = (a * h) / 2;
         System.out.println("Area of Triangle is:" + area);
     }


    public static void main(String[] args) {
         TriangleArea abj = new TriangleArea();
         abj.v1();

    }
}
