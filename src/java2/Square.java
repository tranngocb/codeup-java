package java2;
import static java.lang.StrictMath.sqrt;

/**
 * Created by bichtran on 5/19/17.
 * Create a class named Square that extends Rectangle. Square should define a constructor that accepts one argument,
 * side, and calls the parent's constructor to set both the length and width to the value of side
 */
public class Square extends Rectangle{
    public Square(double side){
    setLength(side);
    setWidth(side);
    }

//    In the Square class, override the getArea and getPerimeter methods with the following definitions for a square
public double getArea(double side) {
    System.out.println("In Square: getArea");
    return (Math.pow(side,2));
}
//    public double getArea() {
//        //double area = length * width;
//        return (Math.pow(side,2)) ;
//    }
    public double getPerimeter(double side) {
        System.out.println("In Square: getPerimeter");
        return (side * 4);
    }
//    public double getPerimeter() {
//        return (this.side * 4);
}
