import java.util.Scanner;

/**
 * Created by bichtran on 5/10/17:
 A : 100 - 88
 B : 87 - 80
 C : 79 - 67
 D : 66 - 60
 F : 60 - 0
 */
public class letterGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String yesNo = "Y";
//        int squareNumber;
//        int cubeNumber;
//
        while (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("Please enter a numerical grade from 0 to 100");
            int gradeScore = input.nextInt();

            System.out.println("you have enter"+ gradeScore);
            if (gradeScore>=88 && gradeScore <= 100 ){
                System.out.println("Your grade is A!");
                if (gradeScore >=99 && gradeScore <=100) {
                    System.out.println("You're A +! Wow...");
                };
            } else if (gradeScore >=80 && gradeScore <= 87) {
                System.out.println("Your grade is B!");
            } else if (gradeScore >=67 && gradeScore <= 79) {
                System.out.println("Your grade is C!");
            }
            else if (gradeScore >=60 && gradeScore <= 66) {
                System.out.println("Your grade is D!");
            }else if (gradeScore >= 0 && gradeScore <= 59) {
                System.out.println("Your grade is F!");
            }
            else {
                System.out.println("Can not have more than 100 or negative number!");

            }



            // Only continue if the user agrees to.
            input.nextLine();
            System.out.println("Need to enter another grade? (Y/N)");
            yesNo = input.nextLine();
        }//While
    } //psvm
}