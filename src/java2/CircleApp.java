package java2;

/**
 * Created by bichtran on 5/17/17.
 */
public class CircleApp {
    public static void main(String[] args) {
        //Create a Circle Object

        Input keyboard = new Input();   //Call the Constructor Input
        System.out.println("Plesase enter the raduis for your circle, Maximun 3959 miles: ");
        double inputRadius = keyboard.getDouble(0.0, 3959.00); //Raduis of the Earth
        Circle appCircle = new Circle(inputRadius);
        // called to calculate the Area of that circle
        double userArea = appCircle.getArea();
        System.out.println(userArea);
        System.out.println("Do you want to also have the circumference?");
        boolean userYesNo = keyboard.yesNo();
        if (userYesNo) {

            System.out.println(appCircle.getCircumference());
        }
    }
}
