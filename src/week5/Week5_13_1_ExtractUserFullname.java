package week5;

/*
5.13.1 Extract User Fullname*
easy
|
30 min
|
Share
Create a static method named getUserFullname() that receives a String array
(String[]) containing various user data. Index 0 contains the user's first name,
index 1 contains the last name, index 2 contains the phone number, index 3 contains
the email, index 4 contains the date of birth, and index 5 contains the country.
Utilize the Arrays.copyOf() method to return an array with only the user's first and last names.

Return Type: String[]

Example:
Parameters:

plain
Copy code
String[] user = ["John", "Doe", "123456789", "john@example.com", "1990-01-01", "USA"]
Return:

plain
Copy code
["John", "Doe"]
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;
public class Week5_13_1_ExtractUserFullname {
    public static void main(String[] args) {

        String[] user = {"John", "Doe", "123456789", "john@example.com", "1990-01-01", "USA"};
        String[] fullname = getUserFullname(user);
        System.out.println(Arrays.toString(fullname));

    }

    public static String[] getUserFullname(String[] user) {
        return Arrays.copyOf(user, 2);

    }
}
