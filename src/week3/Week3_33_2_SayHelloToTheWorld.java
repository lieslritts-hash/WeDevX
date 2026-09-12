package week3;

/*
3.33.2 Say Hello to the World*
easy
|
30 min
|
Share
You take the input with the name. Write a method to say
hello in 3 specified languages to that name.

Expected output:
Hello, {name}! Merhaba, {name}! Hola, {name}!

Example of output
plain
Copy code
Hello, John!
Merhaba, John!
Hola, John!
 */

public class Week3_33_2_SayHelloToTheWorld {
    public static void main(String[] args) {
        sayHello("John");

    }


    public static void sayHello(String name) {
        // print the hello message 3 times in different languages
        System.out.println("Hello, " + name + "!");
        System.out.println("Merhaba, " + name + "!");
        System.out.println("Hola, " + name + "!");

    }
}
