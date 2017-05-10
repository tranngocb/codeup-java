/**
 * Created by bichtran on 5/9/17.
 * One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.

 Write a program that prints the numbers from 1 to 100.
 For multiples of three print “Fizz” instead of the number
 For the multiples of five print “Buzz”.
 For numbers which are multiples of both three and five print “FizzBuzz”.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

    String f = "Fizz";
    String b = "Buzz";

    for (int i = 1; i <= 100; i++){

        if (i%3 == 0 || i%5 == 0){
            if (i%3 == 0 && i%5 == 0){
                System.out.println(f + b + " At line: " + i);
            }
            else if (i%3 == 0) {
                System.out.println(f + "At line: " +i);
            } else if (i%5 == 0) {
                System.out.println(b + "At line: " +i);
            }

        } else {System.out.println("At line: " +i);
        }// Main if
    } // For loop


// do not cross
    }
}
