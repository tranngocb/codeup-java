package java2;

/**
 * Created by bichtran on 5/16/17.
 */
public class Person {
    private String name;

    public String getName() {
        return this.name;
    }
    //Constructor that accepts a string value and sets the person's name to the passed string.
    public Person(String name){
        this.name = name;
    }

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    };
    // // prints a message to the console using the person's name
    public void sayHello(String name) {
        System.out.println(this.name);
    }


}
