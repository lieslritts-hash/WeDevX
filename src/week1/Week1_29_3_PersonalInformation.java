package week1;

/*
1.29.3 Personal Information*
easy
|
30 min
|
Share
Write a program that prints out a person's name, age and birthdate variables using System.out.printf();

plain
Copy code
_____ name = "Bard";
_____ age = 10;
_____ birthdate = "August 18, 2013";
Expected output:
plain
Copy code
My name is Bard, and I am 10 years old.
I was born on August 18, 2013.
 */

public class Week1_29_3_PersonalInformation {
    public static void main(String[] args) {
        String name = "Bard";
        String age = "10";
        String birthdate = "August 18, 2013";

        System.out.printf("My name is %s, and I am %s years old.\nI was born on %s.", name, age, birthdate);
    }
}
