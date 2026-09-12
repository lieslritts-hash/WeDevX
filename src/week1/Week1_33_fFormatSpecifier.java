package week1;

/*
1.33 %f Format Specifier
Learn about the use of the %f format specifier in Java for
formatting floating-point values, including how to use it with
the printf method, precision, and more, in this comprehensive
%f Format Specifier tutorial.

Important note: Almost all of our exercises expect you to use
"System.out.println()", so use "print" or "printf" only when
the requirements ask for it, otherwise exercise will be
considered as wrong.
 */

public class Week1_33_fFormatSpecifier {
    public static void main(String[] args) {
        double height = 2.03;
        double weight = 113.0;
        double bmi = 113.0 / (2.03 * 2.03);

        System.out.printf(
                "Lebron James' height is %.2f meters\n" +
                        "Lebron James' weight is %.1f kg\n" +
                        "Lebron James' BMI is %.1f", +
                        height,
                weight,
                bmi
        );
    }
}
