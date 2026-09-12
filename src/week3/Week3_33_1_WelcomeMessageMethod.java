package week3;

/*
3.33.1 Welcome Message Method*
easy
|
30 min
|
Share
Write a static method called welcomeMessage() with a String param for the company name and prints out a welcome message for the company's customers or clients, such as "Welcome to X, your home to level up your entire game!", where X is the value of the param in the method.

Return Type: void

Example:
Parameter:

plain
Copy code
String company = "Google"
Output:

plain
Copy code
Welcome to Google, your home to level up your entire game!
You don't need to create a Main class; jump right into implementing
the method. The Main class and main method are handled in the backend.
Once done implementing the method just go ahead to run and submit.
From now on, it will get hard to cheat on the exercises. :)
 */

public class Week3_33_1_WelcomeMessageMethod {
    public static void main(String[] args) {
        welcomeMessage("Google");
    }

    public static void welcomeMessage(String company) {
        //write your code here
        System.out.println("Welcome to " + company + ", your home to level up your entire game!");

    }
}
