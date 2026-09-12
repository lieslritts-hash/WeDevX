package week1;

/*
1.30.1 Passion for the Brand, Performance for the Road*
easy
|
30 min
|
Share
Lamborghini's corporate motto is Passion for the Brand, Performance for the Road. Ferrari's corporate motto is Driven by Passion, Devoted to Performance. Bugatti's corporate motto is Art, Shape, Technology.

Write a program that will print out corporate mottos by declaring variables for the make and moto of each supercar company.

plain
Copy code
___ lamborghini = ______;
___ ferrari = ______;
___ bugatti = ______;

___ lamborghiniMotto = ______;
___ ferrariMotto = ______;
___ bugattiMotto = ______;

//write system printf() statement to print out Lamborghini's
corporate motto
//write system printf() statement to print out Ferrari's
corporate motto
//write system printf() statement to print out Bugatti's
corporate motto
Expected Output:

plain
Copy code
Lamborghini's corporate motto is "Passion for the Brand,
Performance for the Road"
Ferrari's corporate motto is "Driven by Passion, Devoted to
Performance"
Bugatti's corporate motto is "Art, Shape, Technology"
Note: Mottos are wrapped inside double quotes. Use Escape
characters to add double quotes in a String.


 */

public class Week1_30_1_PassionForTheBrandPerformanceForTheRoad {
    public static void main(String[] args) {
        String lamborghini = "Lamborghini";
        String ferrari = "Ferrari";
        String bugatti = "Bugatti";

        String lamborghiniMotto = "Passion for the Brand, Performance for the Road";
        String ferrariMotto = "Driven by Passion, Devoted to Performance";
        String bugattiMotto = "Art, Shape, Technology";

        System.out.printf(
                "%s's corporate motto is \"%s\"\n" +
                        "%s's corporate motto is \"%s\"\n" +
                        "%s's corporate motto is \"%s\"", lamborghini, lamborghiniMotto,
                ferrari, ferrariMotto,
                bugatti, bugattiMotto
        );
    }
}

