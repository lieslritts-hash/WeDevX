package week2;

import java.util.Scanner;

/*
2.32 If Else Practice
Put your if-else skills into practice, which offers a
range of coding exercises to help you master this fundamental
building block of Java programming.
 */

public class Week2_32_If_ElsePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter true or false to indicate whether the light is on or off:");
        boolean lightOn = sc.nextBoolean();

        if(lightOn) {
            System.out.println("Light is on");

        } else {
            System.out.println("Light is off");
        }
    }
}
