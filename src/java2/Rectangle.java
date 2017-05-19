package java2;

/**
 * Created by bichtran on 5/19/17.
 */
public class Rectangle {
    private double length;
    private double width;
    //2 Constructors
    public Rectangle() {
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getArea(double length, double width) {
        //double area = length * width;
        return length * width;
    }
    public double getArea() {
        //double area = length * width;
        return this.length * this.width;
    }
    public double getPerimeter(double length, double width) {
        return ((2 * length) + (2 * width));
    }
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }


    public void setWidth(double width) {
        this.width=width;
    }

    public void setLength(double length) {
        this.length = length;
    }
} //Class
