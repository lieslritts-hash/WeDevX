package week3;

/*
3.47.1 Login Credentials*
easy
|
30 min
|
Share
Write a static method called checkCredentials() that takes two strings for username and password and checks if they are valid credentials. The correct username is "superstar" (not case sensitive), and the correct password is "Hardpassword!" (case sensitive). Params: Two strings for the username and password. Return: A boolean value indicating whether or not the given username and password are valid. Expected Output:

plain
Copy code
checkCredentials("Superstar", "Hardpassword!"); //  true
checkCredentials("superstar", "hardpassword!"); //  false
checkCredentials("johnsmith", "password123"); //false
 */
//write your static method here. No need to add Main class or main method.

public class Week3_47_1_LoginCredentials {
    public static void main(String[] args) {

        System.out.println(checkCredentials("Superstar", "Hardpassword!"));
        System.out.println(checkCredentials("superstar", "hardpassword!"));
        System.out.println(checkCredentials("johnsmith", "password123"));
    }

    public static boolean checkCredentials(String username, String password) {

        if (username.equalsIgnoreCase("Superstar") && password.equals("Hardpassword!")) {
            return true;
        } else {
            return false;
        }
    }


}
