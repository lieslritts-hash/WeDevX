package week3;

/*
3.45.3 File Name Validator
easy
|
30 min
|
Share
Create a Java program with a static method called validateFileName() that takes a string as input and checks whether it is a valid file name. A valid file name should not be empty and should not contain any of the following special characters: /|?. Use isEmpty() and contains() String methods. The method should return true if the input string is a valid file name and false otherwise.

Example #1:
Parameters:

plain
Copy code
validateFileName("")
Return: boolean

plain
Copy code
false
Example #2:
Parameters:

plain
Copy code
validateFileName("important|document.txt")
Return: boolean

plain
Copy code
false
Example #3:
Parameters:

plain
Copy code
validateFileName("document.pdf")
Return: boolean

plain
Copy code
true
 */
//write your static method here. No need to add Main class or main method.

public class Week3_45_3_FileNameValidator {
    public static void main(String[] args) {

        System.out.println(validateFileName(""));
        System.out.println(validateFileName("important|document.txt"));
        System.out.println(validateFileName("document.pdf"));

    }

   public static boolean validateFileName(String fileName) {

        if (fileName.isEmpty()) {
            return false;
        } else if (fileName.contains("/")
                || fileName.contains("|")
                || fileName.contains("?")) {
            return false;
        } else {
            return true;
       }
    }

}
