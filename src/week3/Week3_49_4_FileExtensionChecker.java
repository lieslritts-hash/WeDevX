package week3;

/*
3.49.4 File Extension Checker
easy
|
30 min
|
Share
Create a Java program that checks if a given filename corresponds to a specified file type category (e.g., image, audio, video, document, etc.). You should create a static method named checkFileType() that takes two parameters: a String representing the filename and a String representing the expected file type category. The file type categories to check for are:

"image": Image files (.jpg, .png)

"audio": Audio files (.mp3, .wav)

"video": Video files (.mp4, .avi)

"document": Document files (.pdf, .docx)

The method should return a boolean indicating whether the filename corresponds to the expected file type category.

Example #1:
Parameters:

plain
Copy code
String fileName = "space.jpg"
String fileType = "image"
Return: boolean

plain
Copy code
true
Example #2:
Parameters:

plain
Copy code
String fileName = "music.mp3"
String fileType = "video"
Return: boolean

plain
Copy code
false
 */
//write your static method here. No need to add Main class or main method.

public class Week3_49_4_FileExtensionChecker {
    public static void main(String[] args) {

        System.out.println(checkFileType("space.jpg", "image"));
        System.out.println(checkFileType("music.mp3", "video"));
    }

    public static boolean checkFileType(String fileName, String fileType) {

        if ((fileName.endsWith(".jpg") || fileName.endsWith(".png"))
                && fileType.equals("image")) {
            return true;
        } else if ((fileName.endsWith(".mp3") || fileName.endsWith(".wav"))
                && fileType.equals("audio")) {
            return true;
        } else if ((fileName.endsWith(".mp4") || fileName.endsWith(".avi"))
                && fileType.equals("video")) {
            return true;
        } else if ((fileName.endsWith(".pdf") || fileName.endsWith(".docx"))
                && fileType.equals("document")) {
            return true;
        } else {
            return false;
        }
    }
}
