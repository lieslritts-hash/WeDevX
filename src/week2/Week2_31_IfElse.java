package week2;

import java.util.Scanner;

/*
2.31 If Else
Learn how to use the if-else statement in Java to
create more sophisticated and responsive code in this
practical tutorial.
 */

public class Week2_31_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a temperature:");
        double temperature = sc.nextDouble();

        if (temperature < 70) {
            System.out.println("Wear a light jacket or long sleeves");
        }   else {
            System.out.println("Wear a t-shirt or summer clothing");
        }
    }
}
