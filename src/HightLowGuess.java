import java.util.Random;
import java.util.Scanner;

/**
 * Created by bichtran on 5/14/17.
 */
public class HightLowGuess {
    public static void main(String[] args) {
        // statistic of user number guesses
        int userGuess = 0;
        //Game pick a random number between 1 anf 100

        Scanner input = new Scanner(System.in);
        String yesNo = "Y";
        while (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("Please guess the generated number:");
            int userAnswer = input.nextInt();
            System.out.println("Your guess number Is: "+ userAnswer);
            int randomNumber = RandomNumberInRange(1,100);
            System.out.println("Generated number:  " + randomNumber);
            if (userAnswer > randomNumber){
                System.out.println("LOWER!");
            } else if (userAnswer < randomNumber) {
                System.out.println("HIGHER!");
            } else System.out.println("GOOD GUESS");
            // Guesses a user makes
            userGuess++;
            // Set upper limit on the number of guesses
            if (userGuess > 2)
            {
                System.out.println("You have reach a limit of guess! Game End");
            break;
            }
            System.out.println("Do you want to guess again?[y/n]");
            input.nextLine();
            yesNo = input.nextLine();
        }
        System.out.println("Number of user guesses: " + userGuess);
    }




    private static int RandomNumberInRange(int min, int max){

        if(min>=max){
        throw new IllegalArgumentException("max must be greater than min");
        }

        Random r=new Random();
        return r.nextInt((max-min)+1)+min;
        }
}
