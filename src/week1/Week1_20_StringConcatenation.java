package week1;

/*
Explore the process of combining two or more
strings into a single string in Java through the
use of concatenation operators, methods, and more
in this comprehensive String concatenation tutorial.
 */

public class Week1_20_StringConcatenation {
    public static void main(String[] args) {
        String street = "1 Infinite Loop";
        String city = "Cupertino";
        String state = "California";
        String zipCode = "95014";

        String fullAddress = street + ", " + city + ", " + state + " " + zipCode;
        System.out.println(fullAddress);
    }
}

