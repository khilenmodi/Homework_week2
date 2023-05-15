package programme12;

/**
 * Write a Java program to compute the specified expressions and print the
 * output.
 * Test Data:
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 * Expected Output : 2.138888888888889
 */


public class SpecificExpression {
     public  void m1(){
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the first number");
        // String str = sc.nextLine();
         //System.out.println("enter the second number");
         double a = 25.5;
         double b= 3.5;
         double c = 40.5;
         double d = 4.5;
         double v = (a*b-b*b);
       //  double z = (b*b);
         double x = (c-d);
         System.out.println(v/x);


     }

    public static void main(String[] args) {
         SpecificExpression abj = new SpecificExpression();
        abj.m1();
    }
}
