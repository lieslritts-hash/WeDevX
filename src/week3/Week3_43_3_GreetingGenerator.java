package week3;

/*
3.43.3 Greeting Generator
easy
|
30 min
|
Share
Create a program with a static method named generateGreeting() that generates personalized greetings. This method should take a user's name as a String parameter, concatenate it with a standard greeting message, and return the personalized greeting. The standard greeting message is: Hello, [name]! Return Type: String

Example:
Parameter:

plain
Copy code
String name = "Alice"
Return:

plain
Copy code
Hello, Alice!
 */
//write your static method here. No need to add Main class or main method.

public class Week3_43_3_GreetingGenerator {
    public static void main(String[] args) {
        String str1 = "Alice";
        String finalString = generateGreeting(str1);
        System.out.println(finalString);

    }
    public static String generateGreeting(String str1) {
        return "Hello, " + str1.concat("!");

    }

}
