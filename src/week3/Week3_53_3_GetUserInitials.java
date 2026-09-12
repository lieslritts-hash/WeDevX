package week3;

/*
3.53.3 Get User Initials
easy
|
30 min
|
Share
Write a method called getUserInitials() that takes a name and a surname as input and returns their initials in uppercase. Use charAt() and toUpperCase() methods. Also, you can use two ways to convert chars to Strings:

String.valueOf() - example: String str = String.valueOf(name.charAt(0))

Concatenate the empty string with 2 chars - example: String str = "" + char1 + char2

Params: String name: The user's name. String surname: The user's surname. Return: String: The user's initials.

Examples:
Input:

plain
Copy code
name = "John"
surname = "Doe"
Output:

plain
Copy code
JD
Input:

plain
Copy code
name = "steve"
surname = "jobs"
Output:

plain
Copy code
SJ
Input:

plain
Copy code
name = "ELON"
surname = "MUSK"
Output:

plain
Copy code
EM
Input:

plain
Copy code
name = "jeff"
surname = "bezos"
Output:

plain
Copy code
JB
 */
//write your static method here. No need to add Main class or main method.

public class Week3_53_3_GetUserInitials {
    public static void main(String[] args) {

        System.out.println(getUserInitials("John", "Doe"));
        System.out.println(getUserInitials("steve", "jobs"));
        System.out.println(getUserInitials("ELON", "MUSK"));
        System.out.println(getUserInitials("jeff", "bezos"));

        System.out.println(getUserInitials2("John", "Doe"));
        System.out.println(getUserInitials2("steve", "jobs"));
        System.out.println(getUserInitials2("ELON", "MUSK"));
        System.out.println(getUserInitials2("jeff", "bezos"));
    }

    public static String getUserInitials(String name, String surName) {
        String firstInitial = String.valueOf(name.charAt(0)).toUpperCase();
        String lastInitial = String.valueOf(surName.charAt(0)).toUpperCase();

       return firstInitial + lastInitial;
    }

    public static String getUserInitials2(String name, String surName) {

        char char1 = name.toUpperCase().charAt(0);
        char char2 = surName.toUpperCase().charAt(0);

        return "" + char1 + char2;
    }
}
