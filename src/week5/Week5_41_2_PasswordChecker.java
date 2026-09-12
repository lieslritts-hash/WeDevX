package week5;

/*
5.41.2 Password Checker*
easy
|
30 min
|
Share
You are tasked with implementing a password checker for a
banking application registration process. The goal is to
ensure that the user's chosen password has not been
previously compromised by checking against a database of
leaked passwords available in the public domain. You should
create a static method named isSecurePassword() that takes a
Set and a user-provided password as a String parameter and
returns a boolean value indicating whether the password is
secure. Your isSecurePassword() method should perform the
following checks:

Check if the password contains at least 8 characters.

Verify that the password is not a common password found
in the database of known leaked passwords in lowercase.

Example #1:
Parameters:

plain
Copy code
Set<String> leakedPasswords = {"password123", "qwerty",
"12345678"}
String password = "SecurePassword"
Return: boolean

plain
Copy code
true
Example #2:
Parameters:

plain
Copy code
Set<String> leakedPasswords = {"password123", "qwerty",
"12345678"}
String password = "Secure"
Return: boolean

plain
Copy code
false
Example #3:
Parameters:

plain
Copy code
Set<String> leakedPasswords = {"password123", "qwerty",
"12345678"}
String password = "pAsSwOrD123"
Return: boolean

plain
Copy code
false
 */
//write your static method here. No need to add Main class or main method.

public class Week5_41_2_PasswordChecker {
    public static void main(String[] args) {

    }
}
