import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by bichtran on 5/12/17.
 */
public class MultiLoop {

    public static void main(String[] args) {

        //need to pass 2 parameters
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a numeric: ");
        float firstNumber = input.nextFloat();
        System.out.println("Please enter a numeric: ");
        int seccondNumber = input.nextInt(); // try to easy out the issue with integer instead

         float returnF = multiplyNumbers(firstNumber,seccondNumber);
        System.out.println("Multiply: "+ firstNumber+ " by " + seccondNumber+ " give: " +returnF);
        // Now do it with recursion.
        returnF = recurcionNumber(firstNumber,seccondNumber);
        System.out.println("RECURCION in Action");
        System.out.println("Multiply: "+ firstNumber+ " by " + seccondNumber+ " give: " +returnF);


    }
    private static float recurcionNumber(float parameter1, int parameter2) {

        if (parameter2 <= 0) {
            System.out.println("All done!");
            return 0;
       }
         else return parameter1 + recurcionNumber(parameter1, parameter2 - 1);
    }

    private static float multiplyNumbers(float param1, int param2){
        float tempF= 0.0F;
        for (int i = 1; i <= param2; i++) {
             tempF += param1;
            System.out.println(tempF);
        }
      return tempF;
    }
}
