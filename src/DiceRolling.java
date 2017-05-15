/**
 * Created by bichtran on 5/12/17.
 */
import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
    public static void main(String[] args) {

        int dice1 = 0;
        int dice2 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of sides of the dice:");
        int side = Integer.parseInt(input.nextLine()); // Determine the Max number for random
        //input.nextLine();  //clear the input line
        System.out.println("The dice had: " + side);
        String yesNo = "Y";
        while (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("Please roll the dices: \n");
            //String type = input.nextLine();
            dice1 = RandomNumberInRange(1,side);
            dice2 = RandomNumberInRange(1,side);
            System.out.println("Dice 1: "+ dice1+"\n");
            System.out.println("Dice 2: "+ dice2);

            System.out.println("Do you want to roll the dices again?[y/n]");
            yesNo = input.nextLine();
        }
    }

    private static int RandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


}
