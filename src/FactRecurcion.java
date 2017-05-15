/**
 * Created by bichtran on 5/12/17.
 * Use Recursion to implement a factorial in Java
 *
 */
public class FactRecurcion {

    public static void main(String[] args) {
        System.out.println("Starting Factorial recursion");
        int numberPara = 5, factorialReturn;

        factorialReturn =  factorial(numberPara);
        System.out.println("Factorial of: " + factorialReturn);
    }
    public static int factorial(int numberF) {

        if (numberF == 0) {
            System.out.println("END of factorial");
            return 1;
        }else return (numberF * factorial(numberF - 1));
        // return(n * factorial(n-1));
        //System.out.println("Here: "+ numberF * Factorial(numberF-1));
        //numberF = numberF * Factorial(numberF-1);
        //numberF -- ;



        //System.out.println("numberF2:  " + numberF);

        //return numberF * Factorial(numberF-1);
    }
}
