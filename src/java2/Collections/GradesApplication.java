package java2.Collections;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by bichtran on 5/22/17.
 */
public class GradesApplication {
    public static void main(String[] args) {
//        List<Integer> li = new ArrayList<>();
//        li.add(70);
//        li.add(80);
//        li.add(90);
        Student Bich = new Student("Bich"); //the List
        Bich.addGrades(90);
        Bich.addGrades(80);
        Bich.addGrades(85);
        Student jason = new Student("Jason");
        jason.addGrades(35);
        jason.addGrades(50);
        jason.addGrades(56);
        Student Violet = new Student("Violet");
        Violet.addGrades(92);
        Violet.addGrades(95);
        Violet.addGrades(92);
        Student Benoit = new Student("Benoit");
        Benoit.addGrades(100);
        Benoit.addGrades(107);
        Benoit.addGrades(108);
        Map<String, Student> students = new HashMap(); //The Map
        students.put("Bich", Bich);
        students.put("jason", jason);
        students.put("Violet", Violet);
        students.put("Benoit",Benoit);

//        Student student = students.get("Ben");
//        System.out.println("Var student" + student.toString());
        String yesNo;
        do {
            System.out.println("Welcome to Codeup!");
            System.out.println("Here are the GitHub usernames of our students: ");
            students.forEach((username, student) -> {
                System.out.print("|" + username + "|  ");

            });
            System.out.println();   //Just make a
            //Which user they would like to see
            System.out.println("What student would you like to see more information on?");
            Scanner keyboard = new Scanner(System.in);
            String userInput = keyboard.nextLine();

            //Student storedName = students.get(userInput);
            if (!students.containsKey(userInput)) {
                System.out.println("Sorry, no student found with the github username of " + userInput + ".");
            }else {
                Student student = students.get(userInput);
                System.out.println("Name: " + student.getStudentName() + " - Gihub Username: " + userInput);
                System.out.println("Current Average: " + student.getGradeAverage());
            }

            students.forEach((username, student) -> {
                System.out.println("username: " + username + " student: " + student.getGradeAverage());
            });
            System.out.println("Would you like to see another student? (y/n)");
            yesNo = keyboard.next();

        } while ("y".equalsIgnoreCase(yesNo));
    }

}
