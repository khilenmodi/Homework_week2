package programme7;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */


public class TemperatureValue {
// run the programme into the main method directly
    public static void main(String[] args) {
        int  Fahrenheit, Celsius;
        Fahrenheit = 32;
        Celsius = ((Fahrenheit-32)* 5/9);
        System.out.println("Temperature in celsius is : "+ Celsius);
    }


}
