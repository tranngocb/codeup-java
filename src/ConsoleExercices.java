import java.util.Scanner;

/**
 * Created by bichtran on 5/8/17.
 */
public class ConsoleExercices {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int nombreEntier;
        System.out.println("Please enter your age: ");
        nombreEntier = scan.nextInt();
        System.out.println("Your age is: " + nombreEntier);
        scan.nextLine();    //To move the scanner to next line

        //String userInput;
        System.out.println("Please enter 3 words: ");
        String userInput = scan.nextLine();
        System.out.println("The full phrase is: " + userInput);
        String[] pieces = userInput.split("\\s+");
        String one = pieces[0];
        String two = pieces[1];
        String three = pieces[2];
        System.out.println("1st: " + one + " Second: " + two + " Third: " + three);
        String sentence;
        System.out.println("Please enter a sentence");
        //next() catch only the first word of the sentence
        sentence = scan.nextLine();
        System.out.println("Sentence is: " + sentence);
//Bonus Accept decimal entries
        String userInputRoom;
        System.out.println("Please enter the 3 numbers L, W and Height of the room");
        userInputRoom = scan.nextLine();
        pieces = userInputRoom.split("\\s+");
        String lng = pieces[0];
        String lat = pieces[1];
        String hei = pieces[2];
        System.out.println("Length: "+ lng + "Width: " + lat);
        //Convert to number
        //int lngNumber = Integer.parseInt(lng);
        //int latNumber = Integer.parseInt(lat);
        double lngvalue = Double.parseDouble(lng);
        double latvalue = Double.parseDouble(lat);
        double heiValue = Double.parseDouble(hei);
        
        double area = lngvalue * latvalue;
        double perimter = (2 * lngvalue) + (2 * latvalue);
        double volume = lngvalue * latvalue * heiValue;
        System.out.println("Area: " + area + " Perimeter: " + perimter + " Volume: "+ volume);



    }
}
