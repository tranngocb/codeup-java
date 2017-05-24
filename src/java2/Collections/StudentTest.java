package java2.Collections;
//import java2.Collections.Student;

//import static java2.Collections.Student.getGradeAverage;

/**
 * Created by bichtran on 5/22/17.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student students = new Student("Johny");
        int gradeCount = 0;
        students.grades.add(60);
        students.grades.add(80);
        students.grades.add(90);
        students.grades.add(97);
//        for (int grade : students.grades) {
//            System.out.println(grade);
//            gradeCount= gradeCount+ grade;
//        }
        //System.out.println(gradeCount);
        double averageScore = students.getGradeAverage();

        System.out.println("Student Name: "+ students.getStudentName()+" His Average Score: " + averageScore);
    }

}
