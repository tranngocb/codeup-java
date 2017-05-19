package java2;

/**
 * Created by bichtran on 5/19/17.
 */
public class ShapesTest {
    public static void main(String[] args) {
        //create a variable of the type Rectangle named box1 and assign it a new instance of the
        // Rectangle class with a width of 4 and a length of 5
        Rectangle box1 = new Rectangle(4.0,5.0);
        double rectArea = box1.getArea();
        System.out.println("Rectangle area: "+ rectArea);
        double rectPerimeter = box1.getPerimeter();
        System.out.println("Rectangle area: " + rectPerimeter);
        //create a variable of the type Rectangle named box2 and assign it a new instance of the
        // Square class that has a side value of 5.
        Square box2 = new Square(5);
        double squareArea = box2.getArea(); //callwith no parameter The getArea is called from Rectangle
        System.out.println("Square area: "+ squareArea);
        double squarePerimeter = box2.getPerimeter();
        System.out.println("Square perimeter: "+ squarePerimeter);

    }
}
