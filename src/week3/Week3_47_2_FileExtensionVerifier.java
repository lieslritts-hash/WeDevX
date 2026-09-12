package week3;

/*
3.47.2 File Extension Verifier*
easy
|
30 min
|
Share
Create a static method named checkFileExtension() that takes two parameters: a user-entered file extension (String) and the expected file extension (String). The method should compare the file's extension to the expected extension and return a boolean value indicating whether they match. You can use all learned String methods to verify the file extension.

The file name provided by the user will contain a full file name with an extension (e.g. document.pdf).

The expected extension is provided as a separate String parameter.

Your task is to implement the checkFileExtension() method, ensuring that it correctly identifies whether the user-provided file name has the expected extension. The comparison should be case-insensitive, meaning file.pdf and file.PDF should be considered the same. Return Type: boolean

Example #1:
Parameters:

plain
Copy code
String fileExtension = ".PdF"
String expectedExtension = ".pdf"
Return:

plain
Copy code
true
Example #2:
Parameters:

plain
Copy code
String fileExtension = "image.png"
String expectedExtension = ".jpg"
Return:

plain
Copy code
false
 */
//write your static method here. No need to add Main class or main method.

public class Week3_47_2_FileExtensionVerifier {
    public static void main(String[] args) {

        System.out.println(checkFileExtension(".PdF", ".pdf"));
        System.out.println(checkFileExtension("image.png", ".jpg"));
    }

    public static boolean checkFileExtension(String fileExtension, String expectedExtension) {
        return fileExtension.equalsIgnoreCase(expectedExtension);
    }
}
