package week3;

/*
3.29.1 Friendly Message*
easy
|
30 min
|
Share
Write a Java class called Main that contains a static method named getGreeting() that takes no parameters and returns the string 'Hey, Wedevx.co Superstars!' In the main() method of your program call the getGreeting() method to retrieve the greeting. Then, print the result to the console. Expected Output:

plain
Copy code
Hey, Wedevx.co Superstars!
 */

public class Week3_29_1_FriendlyMessage {
    public static void main(String[] args) {
        //call the static method here
        String greeting = getGreeting();
        System.out.println(greeting);
    }

    //create your method here
    public static String getGreeting() {
        return "Hey, Wedevx.co Superstars!";
    }
}
