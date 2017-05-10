/**
 * Created by bichtran on 5/10/17.  Display a table of powers.
 * Prompt the user to enter an integer.
 Display a table of squares and cubes from 1 to the value entered.
 Ask if the user wants to continue.
 Assume that the user will enter valid data.
 Only continue if the user agrees to.
 */

import java.util.Scanner;

public class TablePower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo = "Y";
        int squareNumber;
        int cubeNumber;

        while (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("What number would you like to go up to?");
            int number = input.nextInt();
            System.out.printf("%7s", "Number  |");
            System.out.printf("%8s" ,"Squared   |");
            System.out.printf("%5s" ,"cubed \n");


            for (int i = 1;i<=number;i++){
                squareNumber = i * i; // Math.pow(i,2);
                cubeNumber = i * i * i ;
                System.out.printf("%-7d |",i);
                System.out.printf("%-8d  |" , squareNumber);
                System.out.printf("%-5d \n", cubeNumber);
            }


        // Only continue if the user agrees to.
            input.nextLine();
            System.out.println("Need another table? (Y/N)");
            yesNo = input.nextLine();
        }//While
    } //psvm
}
