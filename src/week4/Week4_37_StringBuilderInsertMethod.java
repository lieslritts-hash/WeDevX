package week4;

/*
4.37 String Builder Insert Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna
learn about String Builder insert() method.

2. String Builder insert method()
The insert() method of the Java StringBuilder class is used to insert the
given value at the specified index. This method takes 2 parameters: int index, char
or String value. Syntax:

plain
Copy code
public StringBuilder insert(int index, String c)
Return Value
This method returns a reference to this object. Let's look at some examples.
Example 1

java
Copy code
public static void main(String[] args) {

    StringBuilder str = new StringBuilder("wedevxco");
    str.insert(6,".");
    System.out.println(str);

    StringBuilder str1 = new StringBuilder("John Doe");
    str1.insert(5,"Black Hand ");
    System.out.println(str1);

}
plain
Copy code
Output is:
wedevx.co
John Black Hand Doe
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep
working
hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week4_37_StringBuilderInsertMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("wedevxco");
        //insert(int index, String str);
        sb.insert(6, ".");
        System.out.println(sb);

        StringBuilder sb1= new StringBuilder("John Doe");
        sb1.insert(4, " Black Hand");
        System.out.println(sb1);

    }
}
