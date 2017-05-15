import java.util.Scanner;

/**
 * Created by bichtran on 5/12/17.
 */
public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo = "Y";
        long factNumber = 1;
//        System.out.println(Long.MAX_VALUE);
        // Loop only if user agreed
        while (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("Please enter a number between 1 and 10");
            int userEntry = input.nextInt();
            if (userEntry > 0 && userEntry  <11) {

                for (int i = 1; i <= userEntry; i++) {
                    factNumber = factNumber * i;
                    System.out.println(factNumber);

                }
                System.out.println("The factorial number of: " + userEntry + " is: " + factNumber);
            }
            System.out.println("Please enter a number between 1 and 10!");
                factNumber = 1;   //reset the number
                System.out.println("Do you want to continue (Y/N)");
                input.nextLine();
                yesNo = input.nextLine();
           //} // if loop
        }
    }
}
