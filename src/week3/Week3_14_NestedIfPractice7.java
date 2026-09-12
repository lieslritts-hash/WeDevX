package week3;

/*
This class will further expand on the previous class's teachings
and explore more advanced techniques and best practices for using
nested "if" statements in Java programming. We will dive deeper
into the topic and provide you with a more comprehensive
understanding of how to use nested "if" statements effectively.
 */

import java.util.Scanner;

public class Week3_14_NestedIfPractice7 {
    public static void main(String[] args) {

//Restaurant menu app.

//write a program that will display the menu options
//first it should prompt the options like
//1. Appetizers
//2. Main Course

//if the user picks Appetizers then
//user should be displayed with the following two options
//1. Spring rolls
//2. Egg rolls

//user should be able to choose from th above options;
//if the user chooses 1. Spring Rolls
//then the user should see a message displayed
//Your Spring Rolls are being prepared
//if the user chooses 2. Egg Rolls
//then the user should see a message displayed
//Your Egg Rolls are being prepared

//if user selects main course
//user should be displayed with two main course options
//1.  Chicken Curry
//2.  New York Rib Eye Steak

//users should be able to pick one of the above main course options
//if user picks 1.  Chicken Curry then the user should be printed out with a message
//Your Chicken Curry is being prepared by our Chef
//if user picks 2.  New York Rib Eye Steak then the user should be printed out with a message
//Your New York Rib Eye Steak is being grilled by our Chef


Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to DevX Restaurant!\n");
        System.out.println("Please choose from the following options:");
        System.out.println("1.  Appetizers");
        System.out.println("2.  Main Course");


String firstOption = sc.nextLine();

        if (firstOption.equals("1") || firstOption.equalsIgnoreCase("Appetizers")) {
        System.out.println("1.  Spring Rolls");
            System.out.println("2.  Egg Rolls");

String appetizerChoice = sc.nextLine();

            if (appetizerChoice.equals("1") || appetizerChoice.equalsIgnoreCase("Spring Rolls")) {
        System.out.println("Your Spring Rolls are being prepared.");
            } else if (appetizerChoice.equals("2") || appetizerChoice.equalsIgnoreCase("Egg Rolls")) {
        System.out.println("Your Egg Rolls are being prepared.");
            } else {
                    System.out.println("Invalid Appetizer Choice, try again.");
            }
                    } else if(firstOption.equals("2") || firstOption.equalsIgnoreCase("Main Course")) {
        System.out.println("1.  Chicken Curry");
            System.out.println("2.  New York Rib Eye Steak");

String mainCourseChoice = sc.nextLine();

            if (mainCourseChoice.equals("1") || mainCourseChoice.equalsIgnoreCase("New York Rib Eye")) {
        System.out.println("Your Chicken Curry is being prepared by our Chef.");
            } else if (mainCourseChoice.equals("2") || mainCourseChoice.equalsIgnoreCase("New York Rib Eye Steak")) {
        System.out.println("Your New York Rib Eye Steak is being grilled by our Chef.");
            } else {
                    System.out.println("Invalid Main Course Choice, try again.");
            }
                    } else {
                    System.out.println("Invalid Option. Only Appetizers and Main Courses are available.");
                     }
    }

    public static class Class3_16 {
        public static void main(String[] args) {
            int num = 3;

            //print out Hello if the num is 1
            //switch statements are always comparing if the variable expression
            //and the case value are EQUAL.

            switch(num) {
                case 1:
                    System.out.println("Hello");
                    System.out.println("DevX");
                    //the body of the case goes until the next case, or default
                    //or the end of the switch statement
                    break;
                case 2:
                    System.out.println("Hello Mars");
                    break;
                case 3:
                    System.out.println("Hello Jupiter");
                    break;

           }

           //if the case doesn't end ith a break statement
            //it means your after the case was executed
            //the program ill continue the next cases
            //it will keep going to next cases and the default until
            //the program executes break statement or reaches end of
            //the switch statement
        }

    }

    public static class Class3_16_1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 7:");
            int num = sc.nextInt();

            switch(num) {
                case 1:
                    System.out.println("The corresponding day of the week is Sunday");
                  break;
                case 2:
                    System.out.println("The corresponding day of the week is Monday");
                  break;
                case 3:
                    System.out.println("The corresponding day of the week is Tuesday");
                  break;
                case 4:
                    System.out.println("The corresponding day of the week is Wednesday");
                  break;
                case 5:
                    System.out.println("The corresponding day of the week is Thursday");
                  break;
                case 6:
                    System.out.println("The corresponding day of the week is Friday");
                  break;
                case 7:
                    System.out.println("The corresponding day of the week is Saturday");
                  break;
                default:
                    System.out.println("Invalid number. Please enter a number between 1 and 7.");
            }
        }
    }

    public static class Class3_16_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter a number between 1 and 12:");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("The corresponding month of the year is January");
                    break;
                case 2:
                    System.out.println("The corresponding month of the year is February");
                    break;
                case 3:
                    System.out.println("The corresponding month of the year is March");
                    break;
                case 4:
                    System.out.println("The corresponding month of the year is April");
                    break;
                case 5:
                    System.out.println("The corresponding month of the year is May");
                    break;
                case 6:
                    System.out.println("The corresponding month of the year is June");
                    break;
                case 7:
                    System.out.println("The corresponding month of the year is July");
                    break;
                case 8:
                    System.out.println("The corresponding month of the year is August");
                    break;
                case 9:
                    System.out.println("The corresponding month of the year is September");
                    break;
                case 10:
                    System.out.println("The corresponding month of the year is October");
                    break;
                case 11:
                    System.out.println("The corresponding month of the year is November");
                    break;
                case 12:
                    System.out.println("The corresponding month of the year is December");
                    break;
                default:
                    System.out.println("Invalid number. Please enter a number between 1 and 12.");
            }
        }
    }
}
