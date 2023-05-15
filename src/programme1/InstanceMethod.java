package programme1;

/** 1.1 Declare two instance variables.
 1.2 Declare one instance method.
 1.3 Call both instance variables into the instance method inside the print statement.
 1.4 Declare the Main method.
 1.5 Call the above instance method into the Main method and Run the programme.
 *
 */

public class InstanceMethod {
    int a = 50;
    int b = 30;// int variable
    //main method
    public static void main(String[] args) {
        InstanceMethod abj = new InstanceMethod();
        abj.method();

    }
        //instance method
     public void method(){
        InstanceMethod abj = new InstanceMethod(); // instance method so we create an objective
         System.out.println(abj.a);
         System.out.println(abj.b);
    }
    }

