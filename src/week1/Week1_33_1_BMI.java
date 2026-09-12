package week1;

/*
1.33.1 BMI*
easy
|
30 min
|
Share
Write a program that calculates the body mass index
(BMI) of Lebron James, given his height is 2.03 meters
and weight is 113.0 kg. The program should store height,
weight and BMI values in variables and print the BMI using
the %f format specifier. Formula for finding BMI = weight /
(height * height); Note BMI should be rounded to 1 decimal point.

Expected output:

plain
Copy code
Lebron James' height is 2.03 meters
Lebron James' weight is 113.0 kg
Lebron James' BMI is X
Where X is the value of BMI.
 */

public class Week1_33_1_BMI {
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

