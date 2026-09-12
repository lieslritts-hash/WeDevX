package week2;

import java.util.Scanner;

/*
2.41 Soft-Skills - Agile

 */

public class Week2_41_SoftSkillsAgile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Celsius:");
        double temperature = sc.nextDouble();

        if (temperature <0) {
            System.out.println("It's freezing cold!");
        } else if (temperature >= 0 && temperature < 10) {
            System.out.println("It's very cold");
        } else if (temperature >= 10 && temperature < 20) {
            System.out.println("It's cold");
        } else if (temperature >= 20 && temperature < 30) {
            System.out.println("It's mild");
        } else if (temperature >= 30 && temperature < 40) {
            System.out.println("It's warm");
        } else {
            System.out.println("It's hot!");
        }
    }
}
