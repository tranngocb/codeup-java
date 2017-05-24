package java2.Shapes;


/**
 * Created by bichtran on 5/19/17.
 * Create a class named Square that extends Rectangle. Square should define a constructor that accepts one argument,
 * side, and calls the parent's constructor to set both the length and width to the value of side
 */
public class Square extends Quadralateral implements Measurable {
    public Square(double side) {
        super(side, side);
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        width = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        length = width;
    }
}