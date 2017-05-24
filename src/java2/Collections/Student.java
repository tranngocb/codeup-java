package java2.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by bichtran on 5/22/17.
 */
 public class Student {
    List<Integer> grades;//x
    private String studentName;

    public Student(String studentName) {
        this.grades = new ArrayList<>();
        this.studentName = studentName;
    }

    public double getGradeAverage() {
        int gradeCount=0;
        for (Integer grade :grades) {
           //
            // System.out.println(grade);
            gradeCount+= grade;
  }
        return ((double)gradeCount/grades.size());
    }

    public void addGrades(Integer grades) {
        this.grades.add(grades);
    }
    // returns the student's name
    public String getStudentName() {
        return studentName;
    }

//    public void setStudentName(String studentName) {
//        this.studentName = studentName;
//    }
}
