package week4;
/*
4.34 String Builder Intro
4.34 String Builder Intro
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna learn about String Builder.

2.What is String Builder?
String Builder handles with a sequence of characters as a String.
But, as you know already that String class is immutable. There are
so many cases where we need to modify String, remove, concatenate
and etc. Every time when we modify a String, we create a new object
in Java heap, we are consuming a lot of memory size. To avoid wasting
memory, the Java developers have created String Builder class. In String
Builder class, when we manipulate with Strings, remove, replace or add some
characters to a String, we handle with only one String object. That is why,
it is reasonable to use String Builder class in certain cases. We will learn more about String Builder class in the next sessions.

3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

//What is a StringBuilder in Java?
//A StringBuilder
//in Java is a mutable (modifiable) class that is used to build a sequence of characters.
//Unlike the String class, which is immutable,
//StringBuilder provides methods to append, insert, delete, or replace characters in the sequence
//This makes StringBuilder more efficient for cases where frequent modifications to a string are needed
//as it avoids the overhead of creating a new String object every time the string is modified
//The StringBuilder class is part of Jav standard library and can be found in the java,lang package


public class Week4_34_StringBuilderIntro {
    public static void main(String[] args) {

    }
}
