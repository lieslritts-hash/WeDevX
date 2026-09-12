package week3;

/*
3.46.1 Number of Characters*
easy
|
30 min
|
Share
Description: Your task is to write a static method called countCharacter() that takes in a single input parameter, a string, and then calculates the number of characters in the string. Param: One string: The input string whose length needs to be calculated. Return: An integer: The number of characters in the input string. Expected Output:

plain
Copy code
String str1 = "hello";
int length1 = countCharacter(str1); // length1 = 5

String str2 = "";
int length2 = countCharacter(str2); // length2 = 0

String str3 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce finibus erat enim, ut ultrices mauris fringilla ut.";
int length3 = countCharacter(str3); // length3 = 102
 */
//write your static method here. No need to add Main class or main method.

public class Week3_46_1_NumberOfCharacters {
    public static void main(String[] args) {

        String str1 = "hello";
        int length1 = countCharacter(str1); // length1 = 5
        System.out.println(length1);

        String str2 = "";
        int length2 = countCharacter(str2); // length2 = 0
        System.out.println(length2);

        String str3 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce finibus erat enim, ut ultrices mauris fringilla ut.";
        int length3 = countCharacter(str3); // length3 = 102
        System.out.println(length3);
    }

    public static int countCharacter(String characters) {
        return characters.length();
    }
}
