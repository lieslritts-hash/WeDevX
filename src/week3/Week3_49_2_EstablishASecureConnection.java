package week3;

/*
3.49.2 Establish a Secure Connection
easy
|
30 min
|
Share
Write a static method called checkURL() that takes in a String parameter - a URL, and then check if it starts with either https:// or http://.

If the URL starts with https://, the method should print out Establishing a secure connection. If the URL starts with http://, the method should print out Establishing an insecure connection. If the URL does not start with either https:// or http://, the method should print out Bad connection request.

Return Type: void

Example #1:
Parameter:

plain
Copy code
String url = "https://www.google.com"
Output:

plain
Copy code
Establishing a secure connection
Example #2:
Parameter:

plain
Copy code
String url = "http://www.yahoo.com"
Output:

plain
Copy code
Establishing an insecure connection
Example #3:
Parameter:

plain
Copy code
String url = "www.facebook.com"
Output:

plain
Copy code
Bad connection request
What is a URL?
URL stands for Uniform Resource Locator. It's a reference or an address to a resource on the internet. URLs are used to identify resources such as web pages, images, videos, downloadable files, and more. They specify the location of a resource and how to access it.

A URL is composed of several parts:

Scheme: It indicates the protocol used to access the resource. Examples include HTTP (HyperText Transfer Protocol), HTTPS (HTTP Secure), FTP (File Transfer Protocol), etc.

Domain: It represents the location of the server hosting the resource. It can be an IP address or a human-readable name.

Path: Specifies the location of the specific resource on the server.

Parameters: Additional information that can be passed to the server.

Fragment/Anchor: Refers to a specific section within the resource.

Example:
plain
Copy code
https://www.example.com/path/to/resource?param1=value1&param2=value2#section
Scheme: https://

Domain: www.example.com

Path: /path/to/resource

Parameters: ?param1=value1&param2=value2

Anchor: #section
 */
//write your static method here. No need to add Main class or main method.


public class Week3_49_2_EstablishASecureConnection {
    public static void main(String[] args) {

        checkURL("https://www.google.com");
        checkURL("http://www.yahoo.com");
        checkURL("www.facebook.com");
    }

    public static void checkURL(String url) {

        if (url.startsWith("https://")) {
            System.out.println("Establishing a secure connection");
        }  else if (url.startsWith("http://")) {
            System.out.println("Establishing an insecure connection");
        } else {
            System.out.println("Bad connection request");
        }
    }

}
