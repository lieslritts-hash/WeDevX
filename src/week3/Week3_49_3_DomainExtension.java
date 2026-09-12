package week3;

/*
3.49.3 Domain Extension
easy
|
30 min
|
Share
Write a static method called checkDomain() that takes a String as input and checks if it ends with ".com", ".org", or ".net". The method should return true if the String ends with one of these suffixes, and false otherwise. Param: String for domain Return boolean Expected Output:

plain
Copy code
isUrlValid("https://www.google.com"); // Expected output: true
isUrlValid("https://www.yahoo.org"); // Expected output: true
isUrlValid("https://www.microsoft.net"); // Expected output: true
isUrlValid("https://www.facebook.co.uk"); // Expected output: false
isUrlValid("https://www.amazon.xyz"); // Expected output: false
 */
//write your static method here. No need to add Main class or main method.


public class Week3_49_3_DomainExtension {
    public static void main(String[] args) {

        System.out.println(checkDomain("https://www.google.com")); // Expected output: true
        System.out.println(checkDomain("https://www.yahoo.org")); // Expected output: true
        System.out.println(checkDomain("https://www.microsoft.net")); // Expected output: true
        System.out.println(checkDomain("https://www.facebook.co.uk")); // Expected output: false
        System.out.println(checkDomain("https://www.amazon.xyz")); // Expected output: false
    }

    public static boolean checkDomain(String domain) {

        if (domain.endsWith(".com") || domain.endsWith(".org") || domain.endsWith(".net")) {
            return true;
        } else {
            return false;
        }
    }

}
