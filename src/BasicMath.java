/**
 * Created by bichtran on 5/11/17.
 */
public class BasicMath {
    public static void main(String[] args) {
       int returnNumber = addMethod(3,7);
        System.out.println(returnNumber);
        returnNumber = subMethod(13,3);
        System.out.println(returnNumber);
        returnNumber = multMethod(130,3);
        System.out.println(returnNumber);
        double returnFloat = divMethod(200.00,9.00);
        System.out.printf("%.3f\n",returnFloat);
        returnFloat = modMethod(10.00,3.00);
        System.out.println(returnFloat);

    }
    public static int addMethod(int a, int b){
        int addReturnV = a+b;
        return addReturnV;
    }
    public static int subMethod(int a, int b) {
        int subReturnV = a - b;
        return subReturnV;
    }
    public static int multMethod(int a, int b) {
        int multReturnV = a  * b ;
        return multReturnV;
    }
    public static double divMethod(double a, double b) {
        double divReturnV = a / b;
        return divReturnV;
    }
    public static double modMethod(double a, double b) {
        double modReturnV = a % b;
        return modReturnV;
    }
}
