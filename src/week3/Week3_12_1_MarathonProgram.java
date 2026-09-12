package week3;

/*
3.12.1 Marathon program*
easy
|
30 min
|
Share
Write a program that determines the eligibility of a person to participate in a fitness program based on their health status and fitness level. The program prompts the user to enter their health status and fitness level to determine if the person is eligible to participate in the fitness program based on their health status and fitness level. health status can be good/bad fitness level can be high/medium/low. Conditions: If the user's health status is good and fitness level is high, then print out We recommend you to prepare for a full marathon If the user's health status is good and fitness level is medium, then print out We recommend you to prepare for a half marathon If the user's health status is good and fitness level is low, then print out We recommend you to prepare for a 5k run If the user's health status is bad, then print out We recommend you to participate in the marathon by walking and running as much as you can if the user enters the wrong input for health status, print out Wrong entry for health status if the user enters the wrong input for fitness level, print out Wrong entry for fitness level The program should ask for

plain
Copy code
Enter your fitness level (high/medium/low):
only if the health status is good. Expected Result: Test Case 1: good high
 */

import java.util.Scanner;

public class Week3_12_1_MarathonProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your health status (good/bad):");
                String healthStatus = sc.nextLine();

        if (healthStatus.equalsIgnoreCase("good")) {
            System.out.println("Enter your fitness level (high/medium/low):");
            String fitnessLevel = sc.nextLine();

            if (fitnessLevel.equalsIgnoreCase ("high")) {
                System.out.println("We recommend you to prepare for a full marathon");
            } else if (fitnessLevel.equalsIgnoreCase("medium")) {
                System.out.println("We recommend you to prepare for a half marathon");
            } else if (fitnessLevel.equalsIgnoreCase("low")) {
                System.out.println("We recommend you to prepare for a 5k run");
            } else {
                System.out.println("Wrong entry for fitness level");
            }

        } else if (healthStatus.equalsIgnoreCase("bad")) {
            System.out.println("We recommend you to participate in the marathon by walking and running as much as you can");
        }else {
            System.out.println("Wrong entry for health status");
        }

        sc.close();

    }

    public static class Class3_13 {
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


            int firstOption = sc.nextInt();
            sc.nextLine(); // consume leftover newline

            if (firstOption == 1) {
                System.out.println("1.  Spring Rolls");
                System.out.println("2.  Egg Rolls");

                int appetizerChoice = sc.nextInt();

                if (appetizerChoice == 1) {
                    System.out.println("Your Spring Rolls are being prepared.");
                } else if (appetizerChoice == 2) {
                    System.out.println("Your Egg Rolls are being prepared.");
                } else {
                    System.out.println("Invalid Appetizer Choice, try again.");
                }
            } else if(firstOption == 2) {
                System.out.println("1.  Chicken Curry");
                System.out.println("2.  New York Rib Eye Steak");

                int mainCourseChoice = sc.nextInt();

                if (mainCourseChoice == 1) {
                    System.out.println("Your Chicken Curry is being prepared by our Chef.");
                } else if (mainCourseChoice == 2) {
                    System.out.println("Your New York Rib Eye Steak is being grilled by our Chef.");
                } else {
                    System.out.println("Invalid Main Course Choice, try again.");
                }
            } else {
                System.out.println("Invalid Option. Only Appetizers and Main Courses are available.");
            }
        }
    }

    public static class Week3_12 {
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

            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to DevX Restaurant!\n");
            System.out.println("Please choose from the following options:");
            System.out.println("1.  Appetizers");
            System.out.println("2.  Main Course");


            int firstOption = sc.nextInt();
            sc.nextLine(); // consume leftover newline

                if (firstOption == 1) {
                    System.out.println("1.  Spring Rolls");
                    System.out.println("2.  Egg Rolls");

                    int appetizerChoice = sc.nextInt();

                if (appetizerChoice == 1) {
                    System.out.println("Your Spring Rolls are being prepared.");
                    } else if (appetizerChoice == 2) {
                    System.out.println("Your Egg Rolls are being prepared.");
                    } else {
                    System.out.println("Invalid Input. Please try again.");
                }

                sc.close();


            }




        }
    }
}
