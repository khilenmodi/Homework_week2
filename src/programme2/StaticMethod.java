package programme2;
  /** 2.1 Declare two static variables
   2.2 Declare one static method
   2.3 Call both static variables into the static method inside the print statement.
   2.4 Declare the Main method.
   2.5 Call the static method into the Main method and Run the programme.
   */
public class StaticMethod {
   static int a = 10;
    static int b= 20;

    public static void main(String[] args) {
        m1(); // directly call the method as we have use static method at below

    }

    public static void m1(){
        System.out.println(a); // using of static method
        System.out.println(b);
    }
}
