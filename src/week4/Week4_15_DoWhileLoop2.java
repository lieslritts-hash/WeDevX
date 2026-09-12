package week4;

/*
4.15 Do While Loop 2
Enhance your understanding of loops in Java by exploring the unique capabilities of the do-while loop and its practical applications for iterative operations in this informative tutorial.
 */

import java.util.Scanner;

public class Week4_15_DoWhileLoop2 {
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

        Scanner sc = new Scanner(System.in);

        String username;
        String password;

         do {
             System.out.println("Please enter your username:");
             username = sc.nextLine();

             System.out.println("Please enter your password:");
             password = sc.nextLine();

             if (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$")) {
                 System.out.println("Invalid credentials");
             }

         } while (!username.equalsIgnoreCase("hello@wedevx.co") || !password.equals("abc123$$"));
         //username hello@google.com => true
        //password abc123$$ => false
        //true && false
        //false && false
        //do I really need both of them to be wrong
        //false || true  ===> true
        //true || false ====> true
    }
}
