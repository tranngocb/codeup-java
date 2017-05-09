/**
 * Created by bichtran on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

        /*Do Whil
        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.*/

        int byTwo = 0;
        do {
            System.out.println("Incrieasing by 2: "+ byTwo);
            byTwo += 2;
        }while(byTwo <= 100);
        System.out.println("End do while! ");
    }
}
