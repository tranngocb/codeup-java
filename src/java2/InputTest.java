package java2;

import java2.Input;

/**
 * Created by bichtran on 5/17/17.
 */
public class InputTest {
    public static void main(String[] args) {
        Input keyboard = new Input();   //Constructor
        System.out.println("On next step please type an integer between 10,20");
        int retInt = keyboard.getInt(10,20);
        System.out.println(retInt);
        System.out.println("On next step please type an integer between 10.5,20.5");
        double retDouble= keyboard.getDouble(10.5,20.5);
        System.out.println(retDouble);
        //Boolean
        System.out.println("Do you want to continue? [Yes/No][Y/N]");
        boolean question = keyboard.yesNo();
        if (question==true)
        System.out.println(question);
        else System.out.println("Wrong return answer");
        System.out.println("Please enter the word you want to get: ");
        String stringRequest = keyboard.getString();
        System.out.println(stringRequest);
    }
}
