/**
 * Created by bichtran on 5/10/17.
 *     If the number has 3 as a factor, output 'Pling'.
 If the number has 5 as a factor, output 'Plang'.
 If the number has 7 as a factor, output 'Plong'.
 If the number does not have 3, 5, or 7 as a factor, just pass the number's digits straight through.
 */
public class ExtraPlong {
    public static void main(String[] args) {

        String p1 = "Pling";
        String p2= "Plang";
        String p3= "Plong";


        for (int i = 1; i <= 100; i++){

            if (i % 3 == 0 || i % 5 == 0|| i % 7 ==0){

                if (i % 3 == 0 && i% 5 == 0 && i % 7 ==0) {
                    System.out.println(p1+p2+p3 + " At line: " +i);
                }else if (i % 3 == 0 && i% 5 == 0) {
                    System.out.println(p1+p2 + " At line: " +i);
                } else if (i % 3 == 0 && i% 7 == 0) {
                    System.out.println(p1 + p3 + " At line: " + i);
                }else if (i % 5 == 0 && i% 7 == 0) {
                    System.out.println(p2 + p3 + " At line: " + i);
                }else if (i%3 == 0){
                    System.out.println( p1 +" At line: " + i);
                }else if (i%5== 0) {
                    System.out.println( p2 +" At line: " + i);
                }else {
                    System.out.println(p3+ " supposed to be divisible by 7 only: " +i);
                }
//                if (i % 3 == 0 && i% 5 == 0 && i % 7 ==0) {
//                System.out.println(p1+p2+p3 " At line: " +i);
//                }else if (i % 3 == 0 ) {
//                    System.out.println(p1+ " At line: " +i);
//                }else if (i % 5 == 0) {
//                    System.out.println(p2 + " At line: " +i);
//                }
//
//                if (i % 3 == 0 && i % 7 == 0) {
//                    System.out.println(p1+p3+ " At line: " +i);
//                }
//                //else if (i % 3 == 0) {
//                  //  System.out.println(p1+ "At line: " +i);
//                //}
//                else if(i % 7 == 0) {
//                    System.out.println(p3 + " At line: " +i);
//                }
//
//                if (i % 3 == 0){
//                    System.out.println(p1+ " At line: " + i);
//                }
//                else if (i % 5 == 0) {
//                    System.out.println(p2 + " At line: " +i);
//                } else if (i % 7 == 0) {
//                    System.out.println(p3 + " At line: " +i);
//                }else if (i % 3 == 0 && i% 5 == 0) {
//                    System.out.println(p1+p2+ "At line: " +i);
//                }
//                else if (i % 3 == 0 && i % 7 == 0) {
//                    System.out.println(p1+ p3+ "At line: " +i);
//                }
//
            } else {
                System.out.println("Not a factor of 3,5 nor 7:  " +i);
            }// Main if
        } // For loop


// do not cross
    }
}
