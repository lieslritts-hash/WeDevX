package week4;

/*
4.16 Do While Loop 3
Improve the efficiency of your Java code with the do-while loop, as
this lesson provides a thorough explanation of its usage, along with
practical examples that demonstrate how it can be leveraged for
powerful and responsive programming.
 */

import java.util.Scanner;

public class Week4_16_DoWhileLoop3 {
    public static void main(String[] args) {
        //write a program that takes the input from the user for username
        //and password
        //if username matches "hello@wedevx.co"
        //and if the password matches "abc123$$"

        //then say Welcome username

        //other tell the user to enter the credentials again

        //ex output:
        //Please enter your login:  hello@tesla.com
        //Please enter your username: abc123

        //Invalid credentials
        //      //Please enter your login: hello@tesla.com
        //      //Please enter your username: abc123

        //Invalid credentials

        //use do-while loop if you know you have to execute the body
        //of the while loop at least once regardless of any conditions
        //if there si a scenario where you know you don't need to enter
        //the body of the while loop at least once, then just use while loop

        //this is an example of duplicate code and should use do-while loop instead

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your username:");
        String username = sc.nextLine();

        System.out.println("Please enter you password:");
        String password = sc.nextLine();

        if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
            System.out.println("Invalid credentials");
    }

    while (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
        System.out.println("Please enter your username:");
        username = sc.nextLine();

        System.out.println("Please enter you password:");
        password = sc.nextLine();

        if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$"))
            System.out.println("Invalid credentials");
        }

    System.out.println("Welcome " + username);
    }
}
