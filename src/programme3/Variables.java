package programme3;

/** 3.1 Declare one instance and one static variable.
 3.2 Declare one instance method.
 3.3 Declare one static method.
 3.4 Call both instance and static variables into both instance and static methods inside the
 print statement.
 3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Variables {
    static int a = 15;
    int b =30;
 // main method with objective called due to instance method.
    public static void main(String[] args) {
        Variables abj = new Variables();
        abj.v2();
        v1();

    }
 // one static method
    public static void v1(){
        Variables abj = new Variables();
        System.out.println(a);
        System.out.println(abj.b);
    }
    // one instance method
    public void v2(){
        System.out.println(a);
        System.out.println(b);
    }
}
