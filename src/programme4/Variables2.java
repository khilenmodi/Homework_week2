package programme4;

/**  4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.
 *
 */
public class Variables2 {
    static int a = 20;//static variable.
    static int b = 40;
    int c = 10;//instance variable.
    int d = 30;
    // called both static and instance into main method .
    public static void main(String[] args) {
        Variables2 abj = new Variables2();
        abj.k();
        j();
    }
    // one instance method use
    public void k(){
        Variables2 abj = new Variables2();
        System.out.println(abj.c); // two instance variable used
        System.out.println(abj.d);
    }
        // one static method
    public static void j(){
        System.out.println(a);// two static variable used
        System.out.println(b);

    }
}
