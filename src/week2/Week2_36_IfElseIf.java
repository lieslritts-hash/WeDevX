package week2;

import java.util.Scanner;

/*
2.36 If Else If
Increase the sophistication of your Java
programming skills as this video explores the
implementation of if-else-if statements for more
advanced decision-making structures and streamlined code.
 */

public class Week2_36_IfElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter target audience location:");
        String location = sc.nextLine();

        double pricePerClick;
        if (location.equals("United States") || location.equals("united states") || location.equals("US") || location.equals("us")) {
            pricePerClick = 1.5;
        } else {
            pricePerClick = 0.5;
        }

        System.out.println("Price per click: $" + pricePerClick);
    }
}
