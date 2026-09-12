package week3;

/*
Master the use of double return types in Java methods to
perform calculations, return double values, and enable
decision-making based on double conditions.
 */

public class Week3_27_MethodsWithDoubleReturnType {
    public static void main(String[] args) {
        double var = work();
        System.out.println(var);

        double taxToBePaid = calculateTax();
        System.out.println(taxToBePaid);

    }

    public static double work() {
        return 1.6;
    }

    public static double calculateTax() {
        double salary = 1000000;
        double tax = 0.1;

        return salary * tax;
    }
}
