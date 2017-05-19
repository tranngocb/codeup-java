package java2;

import java.util.Random;

/**
 * Created by bichtran on 5/18/17.
 */
public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"Stubborn", "Gentle", "Beautifull", "Scary", "Whatever", "Nice", "Wisdom", "VII", "The Nine", "The Ten"};
        String[] names = {"Ben", "Bee", "Beep", "Bich", "Roxanne", "Johny", "Mai-Anh", "Francine", "Louis", "Francine"};


        int randomNumber = RandomNumberInRange(0, 10);
        int randomNumber1 = RandomNumberInRange(0, 10);
        System.out.println("The Random number is:" + randomNumber);
        System.out.println("The Random number is:" + randomNumber1);
        System.out.print("The name is:" + names[randomNumber] + " And ");
        System.out.println("The adjective is:" + adjectives[randomNumber1]);
    }

    //GENERIC RANDOM generator
    private static int RandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
