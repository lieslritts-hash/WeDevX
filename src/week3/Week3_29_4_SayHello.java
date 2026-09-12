package week3;

/*
3.29.4 Say Hello
easy
|
30 min
|
Share
You are given a name. Write a method to say hello to the person with that name. For example, if the name is "John", the method should print the following:

plain
Copy code
Hello, John!
Try to solve this exercise in 2 ways: using a String variable and without using a variable.

Hint
You need to call sayHello() method and put inside it a String with a name as a parameter.

Don't forget that this method just returns the String, it doesn't print it.

You can store the result of this method into a variable or put it directly to System.out.println()
 */

public class Week3_29_4_SayHello {
    public static void main(String[] args) {
        String name = "John";
        System.out.println(sayHello(name));
    }
    public static String sayHello(String name) {
        return "Hello, " + name + "!";
    }
}
