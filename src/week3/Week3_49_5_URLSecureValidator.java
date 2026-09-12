package week3;

/*
3.49.5 URL Secure Validator
easy
|
30 min
|
Share
Create a static method named validateURL() that takes two parameters: a String url and a boolean secure. The method should determine if the given URL is valid based on the following criteria:

If secure is true, the URL should start with https://;

If secure is false, the URL should start with http://.

The method should return true if the URL is valid according to the criteria, and false otherwise.

Example #1:
plain
Copy code
validateURL("https://www.example.com", true)
Return: boolean

plain
Copy code
true
Example #2:
plain
Copy code
validateURL("https://www.example.com", false)
Return: boolean

plain
Copy code
false
Example #3:
plain
Copy code
validateURL("http://www.example.com", true)
Return: boolean

plain
Copy code
false
Example #4:
plain
Copy code
validateURL("http://www.example.com", false)
Return: boolean

plain
Copy code
true
 */
//write your static method here. No need to add Main class or main method.


public class Week3_49_5_URLSecureValidator {
    public static void main(String[] args) {

       System.out.println(validateURL("https://www.example.com", true));
       System.out.println(validateURL("https://www.example.com", false));
       System.out.println(validateURL("http://www.example.com", true));
       System.out.println(validateURL("http://www.example.com", false));
    }

    public static boolean validateURL(String url, boolean secure) {

        if (url.startsWith("https://") && secure == true) {
            return true;
        } else if (url.startsWith("http://") && secure == false) {
            return true;
        } else {
            return false;
        }
    }
}
