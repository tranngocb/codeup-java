import java.util.Scanner;

/**
 * Created by bichtran on 5/12/17.
 */
public class CalculatorJava {
    public static void main(String[] args) {

        String st1 = getInput("Enter a numeric value: ");
        String st2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation ( + - * /) ");

        double result = 0;
        try {
            switch (op) {
                case "+":
                    result = addValues(st1, st2);
                    break;
                case "-":
                    result = subtractValues(st1, st2);
                    break;
                case "*":
                    result = multiplyValues(st1, st2);
                    break;
                case "/":
                    result = dividetValues(st1, st2);
                    break;
                default:
                    System.out.println("Not defined operation!");
                    return;
                        }
            System.out.println("The answer is: "+result);
        }catch (Exception e) {
            System.out.println(""+ e.getMessage());
        } //catch

    } // Main
    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 + d2;
    }
    private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 - d2;
    }
    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 * d2;
    }
    private static double dividetValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        return d1 / d2;
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
