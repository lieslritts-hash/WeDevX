package week4;

/*
4.36 How To Initialize String Builder Class
1. Overview
Hello superstars! Welcome back to another session! In this session, we
gonna learn about how to build String Build class and append() method.

2. Building of String Builder class
Let's see at some example of building StringBuilder class Example 1

java
Copy code
public static void main(String[] args) {

    // creating empty String Builder
    StringBuilder str = new StringBuilder();
    System.out.println(str);

    //Initializing a value to String Builder
    StringBuilder str1 = new StringBuilder("Hello");
    System.out.println(str1);

    //Converting String to Sting Builder
    String word = "John";
    StringBuilder str2 = new StringBuilder(word);
    System.out.println(str2);
plain
Copy code
Output is:
Hello
John
##### 3\. String Builder append() method
StringBuilder.append(String str) method appends the specified string to
the current character sequence.

Syntax:

plain
Copy code
public StringBuilder append(String str)
Parameters: str − This is a string. Return value: This method returns a
reference to this object. Example 2

java
Copy code
public static void main(String[] args) {

    //append method ()
    StringBuilder str3 = new StringBuilder("Welcome");
    str3.append(" wedevx");
    // here we are not creating a new String object
    System.out.println(str3);

    // We can chain append method
    str3.append(" superstar").append(" ").append("java");
    System.out.println(str3);

    // We can use append() method inside a loop
    StringBuilder str4 = new StringBuilder();

    for(int i=0; i<=5; i++){
        str4.append(i).append(" ");
    }
    System.out.println(str4);
}
plain
Copy code
Output is:
Welcome wedevx
Welcome wedevx superstar java
0 1 2 3 4 5
In this example, we have added (appended) a String value to a current String.
When we are modifying the String, we are not creating a new String object,
we are handling with same String object. This is a big difference between
String and StringBuider class. We can save memory usage by using
StringBuilder class.
3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep
working hard!
 */

// append() : Appends the specified string to the end of the current sequence
//StringBuilder is much more efficient than concat
//and concat  is creating a new object and using more memory, where StringBuilder is not

public class Week4_36_HowToInitializeStringBuilderClass {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(); //""
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Hello"); //initialize a value in the constructor
        System.out.println(sb1);

        //Don't do this:
        //StringBuilder sb2 = "Hello";

        String str = "Elon";
        StringBuilder sb2 = new StringBuilder(str); //transform your String into a StringBuilder
        System.out.println(sb2);

        //append -> adds the provided text into the existing String

        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.append(" World").append(1).append(" ").append(23.0);
        System.out.println(sb5);

        StringBuilder sb6 = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb6.append(i).append(" ");
        }
        System.out.println(sb6);

    }
}
