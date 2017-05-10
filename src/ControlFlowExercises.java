/**
 * Created by bichtran on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

        /*Do While
        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.*/

        int byTwo = 0;
        int byFive = 0;
        double startAt2 = 0;
//        do {
//            System.out.println("Increasing by 2: "+ byTwo);
//            byTwo += 2;
//        }while(byTwo <= 100);
//        System.out.println("End do while! ");
//
        //Alter your loop to count backwards by 5's from 100 to -10.


//        do {
//            System.out.println("Decreasing by 5: " + byFive);
//            byFive -= 5;
//        }while (byFive >= -10);
//
//        //double startAt2 = 2;
//        do {
//            System.out.println("Squared number: " + startAt2);
//            startAt2 = Math.pow(startAt2, 2);
//        }while (startAt2 <1000000);
// Using For loop instead
       /* Create a For loop that runs so long as i is less than or equal to 15
        Each loop iteration, output the current value of i, then increment i by one.  */
        for (int i = 5;i<=15;i++) {
            System.out.println("Start at 5 ; Increasing by 1: "+ i);
        }
        System.out.println("End of Start at 5.");

        for (byTwo = 0; byTwo <= 100; byTwo += 2) {
            System.out.println("Increasing by 2: "+ byTwo);
        }
        System.out.println("End of increasing by 2");

        for (byFive = 100;byFive >= -10; byFive-= 5) {
            System.out.println("Decreasing by 5: " + byFive);
        }
        System.out.println("End of Decreasing by 5");
        for (startAt2 = 2;startAt2<1000000;startAt2 = Math.pow(startAt2, 2)) {
            System.out.println("Squared number: " + startAt2);
        }
        System.out.println("End of Squared of 2");

    }
}
