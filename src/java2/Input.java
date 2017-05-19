package java2;

import java.util.Scanner;

/**
 * Created by bichtran on 5/17/17.
 */

public class Input {

    private Scanner scanner; // = new Scanner(System.in); This is the scanner property/attribute/field/instance variable
    private String inputString = "";


    //Constructor that accepts a string value
    public Input (){
        scanner = new Scanner(System.in);
    }
    public Boolean yesNo (){
        //Continue until user type n
        String yesNo ;  //= inputString;
        boolean endDo = false;
        do {

            System.out.println("Do you want to continue? [y/n][Yes]: ");
           // yesNo = scanner.next();
            yesNo = scanner.next().toUpperCase();
            switch (yesNo) {
                case "Y":
                    return true;
                case "YES":
                    return true;
                case "YEP":
                    return true;

            }
            endDo = false;
        } while (endDo ==false);
    return true;
    }
    public int getInt() {
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        int enterInt; // = scanner.nextInt();
    do {

            System.out.println("please give an integer within: " + min + " and " + max);
            enterInt = scanner.nextInt();

    }while (enterInt < min || enterInt > max);

    return enterInt;
    }

    public double getDouble(double min, double max){
        double enterDouble ; //scanner.nextDouble();

        do {
            System.out.println("please give an double within: " + min + " and " + max);
            enterDouble = scanner.nextDouble();
        }while (enterDouble < min || enterDouble >max);
        return enterDouble;
    }
    public String getString(){
        return inputString = scanner.next();
//        inputString = scanner.next();

//    return inputString;
    }

}

