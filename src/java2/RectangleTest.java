package java2;

/**
 * Created by bichtran on 5/19/17.
 */
public class RectangleTest {
    public static void main(String[] args) {
        Rectangle demoRectangle = new Rectangle();
        double myArea = demoRectangle.getArea(2.0,5.0);
        System.out.println("Rectangle Area(in square): " + myArea);
        double myPerimeter = demoRectangle.getPerimeter(2,5);
        System.out.println("Rectangle perimeter: " + myPerimeter);
    }
}
