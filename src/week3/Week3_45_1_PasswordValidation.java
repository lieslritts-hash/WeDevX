package week3;

/*
3.45.1 Password validation*
easy
|
30 min
|
Share
Description: Your task is to write a static method called login() that takes in two input parameters: the username (a String) and the password (also a String). The method should then check if both the username and password are not empty, and if they are not empty, check if they are valid. If both the username and password are not empty and are valid, the method should print out "logging in". If the username is empty, the method should print out "username is empty". If the password is empty, the method should print out "password is empty". If the username or password is incorrect, the method should print out "invalid credentials". Valid username is "superstar" and valid pass is "password123" Params: Two strings: the username and the password. Return: A Void: The appropriate message based on the validity of the credentials should be printed out. Expected Output:

plain
Copy code
login("", "password123") // Output: "Username is empty"
login("superstar", "") // Output: "Password is empty"
login("superstar", "password123") // Output: "Logging in"
login("superstar", "wrongpassword") // Output: "Invalid credentials"
 */
//write your static method here. No need to add Main class or main method.


public class Week3_45_1_PasswordValidation {
    public static void main(String[] args) {

        login("", "password123");
        login("superstar", "");
        login("superstar", "password123");
        login("superstar", "wrongpassword");

    }

    public static void login(String username, String password) {
        if (username.isEmpty()) {
            System.out.println("Username is empty");
        } else if (password.isEmpty()) {
            System.out.println("Password is empty");
        } else if (username.equals("superstar") && password.equals("password123")) {
            System.out.println("Logging in");
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
