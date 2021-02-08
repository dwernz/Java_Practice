// Fig. 2.7: Addition.java
// Addition program that inputs two numbers then displays their sum
import java.util.Scanner;

public class Addition {
    // main method begins execution of Java application
    public static void main(String[] args) {
        // Create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: "); // prompt
        int number1 = input.nextInt(); // read the first number from the user

        System.out.print("Enter second integer: "); // prompt
        int number2 = input.nextInt(); // read the second number from the user

        int sum = number1 + number2; // add numbers, then store total in sum
        
        System.out.printf("Sum is %d%n", sum); // display sum

        input.close();
    } // end method main
} // end class Addition
