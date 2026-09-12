package week2;

import java.util.Scanner;

/*
2.40 Soft Skills - Mirror Your Interviewer
This soft skills class provides practical tips on
how to create a positive first impression during an
interview, including preparing and practicing your body
language, being early, smiling, showing a positive state
of mind, mirroring the interviewer's body language, and
maintaining eye contact.
 */

public class Week2_40_SoftSkillsMirrorYourInterviewer {
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
