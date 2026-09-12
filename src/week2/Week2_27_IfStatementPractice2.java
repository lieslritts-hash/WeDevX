package week2;

import java.util.Scanner;

/*
2.27 If Statement Practice 2
Take your Java skills to the next level by combining
if statements with operators and boolean expressions in
this class.
 */

public class Week2_27_IfStatementPractice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Body Temperature:");
        double temperature = sc.nextDouble();

        if(temperature < 97.7) {
            System.out.println("Drink Some Hot Tea to Warm Up");
        }

        if(temperature > 99.5) {
            System.out.println("Take Tylenol to Bring Your Temperature Down");
        }
    }
}
