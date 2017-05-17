package java2;

/**
 * Created by bichtran on 5/17/17.
 */
public class Circle {
//     should have a private radius property that is set though the constructor
    private double radius;
    //final double pi = 3.14159265;
//constructor
    public Circle (double radius) {
        this.radius = radius;
        System.out.println(this.radius);

    }

    public double getArea(){
//area = pi x (radius ^ 2)
        double area = Math.PI * (radius * radius);


        return area;
    }
    public double getCircumference(){
//        circumference = 2 x pi x radius
        double circumference = 2 * Math.PI * radius;

        return circumference;

    }



}
