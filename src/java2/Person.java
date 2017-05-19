package java2;

/**
 * Created by bichtran on 5/16/17.
 */
public class Person {
    private String name;

    //Constructor that accepts a string value and sets the person's name to the passed string.
    public Person(String personName) {
      name=personName;
    }
    public String getName() {
        return this.name;
    }


    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    };

    // // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Java says Hello to: "+this.name);
    }


}
