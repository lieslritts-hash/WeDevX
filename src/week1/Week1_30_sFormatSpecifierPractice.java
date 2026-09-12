package week1;

/*
Practice and reinforce your understanding of the %s
format specifier in Java, including how to use it for
formatting string values, through a series of hands-on
exercises and challenges in this %s Format Specifier
Practice tutorial.

Important note: Almost all of our exercises expect you to
 use "System.out.println()", so use "print" or "printf"
 only when the requirements ask for it, otherwise exercise
 will be considered as wrong.
 */

public class Week1_30_sFormatSpecifierPractice {
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

