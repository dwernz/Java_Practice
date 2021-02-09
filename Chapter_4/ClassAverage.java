package Chapter_4;
// Fig. 4.8: ClassAverage.java
// Solving the class-average problem using counter-controlled iteration.
import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialize phase
        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 1; // intialize # of grade to be entered next

        // processing phase uses counter-controlled iteration
        while (gradeCounter <= 10) { // loop 10 times
            System.out.print("Enter grade: "); // prompt
            int grade = input.nextInt(); // input next grade
            total = total + grade;
            gradeCounter = gradeCounter + 1; // increment counter by 1
        }

        // termination phase
        int average = total / 10; // integer division yeilds integer result

        // display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %d%n", average);

        input.close();
    }
}
