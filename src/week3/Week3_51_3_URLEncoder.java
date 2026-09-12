package week3;

/*
3.51.3 URL Encoder
easy
|
30 min
|
Share
Create a Java program that takes a URL as String parameter and encodes it by replacing all special characters with their URL-encoded equivalents. You need to implement a static method named encodeURL() that takes a String representing the URL as input and returns the encoded URL as a String. In the URL encoding process, replace spaces ( ) with %20, question marks (?) with %3F, ampersands (&) with %26, equals (=) with %3D.

Example:
Parameters:

plain
Copy code
String "https://www.example.com/programming languages & URL encoding"
Return: String

plain
Copy code
"https://www.example.com/programming%20languages%20%26%20URL%20encoding"
 */
//write your static method here. No need to add Main class or main method.

public class Week3_51_3_URLEncoder {
    public static void main(String[] args) {

        System.out.println(encodeURL(
                "https://www.example.com/programming languages & URL encoding"
        ));
    }

    public static String encodeURL(String url) {

        url = url.replace(" ", "%20");
        url = url.replace("?", "%3F");
        url = url.replace("&", "%26");
        url = url.replace("=", "%3D");

        return url;
    }
}
