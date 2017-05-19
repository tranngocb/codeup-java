package java2;

/**
 * Created by bichtran on 5/16/17.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person testPerson = new Person("Nobody");
        testPerson.setName("Bichovich");
        String retrievedName = testPerson.getName();
        System.out.println(retrievedName);
        //We can also do
        System.out.println(testPerson.getName());
        testPerson.sayHello();
        //Understand references
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");   //Per statement Person person2 = person1; ?
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }



}
