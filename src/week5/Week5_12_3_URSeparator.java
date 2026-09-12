package week5;

/*
5.12.3 URL Separator*
easy
|
30 min
|
Share
Create a static method named separateURL() that takes a URL
String as a parameter and separates it into its components:
protocol, domain, and path. Implement the method using the
split() method in Java to divide the URL based on its
structure. Assume the URL is well-formatted with a specific
structure: protocol://domain/path.

Return Type: String[]

Example:
Parameters:

plain
Copy code
String url = "https://www.example.com/home"
Return:

plain
Copy code
["https", "www.example.com", "home"]
You can use the split() method referencing elements by
index and create a new array from these elements. For
instance, splitting the URL into two parts, extracting
the protocol (index 0) and the domain/path (index 1).
Then, separate the path from the domain and combine all
three obtained elements into one array.
 */
//write your static method here. No need to add Main class or main method or import anything

import java.util.Arrays;

public class Week5_12_3_URSeparator {
    public static void main(String[] args) {

        String url = "https://www.example.com/home";
        String[] result = separateURL(url);
        System.out.println(Arrays.toString(result));

    }

    public static String[] separateURL(String url) {

        String[] parts = url.split("://");

        String protocol = parts[0];

        String[] domainAndPath = parts[1].split("/");

        String domain = domainAndPath[0];
        String path = domainAndPath[1];

        String[] result = {protocol, domain, path};

        return result;
    }
}
