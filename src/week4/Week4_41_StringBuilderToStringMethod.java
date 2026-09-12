package week4;

/*
4.41 String Builder To String Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about a method that converts StringBuilder into String. This is the las class about StringBuilder class.

2.What is str.toString() method?
This method converts StringBuilder to String, does not take any parameter

Syntax
plain
Copy code
public String toString()
Return:
String value Example 1

java
Copy code
public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Superstars from wedevex");
    sb.append(" is going to the moon");

    String str = sb.toString();
    System.out.println(str);
}
plain
Copy code
Output is:
Superstars from wedevex is going to the moon
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week4_41_StringBuilderToStringMethod {
    public static void main(String[] args) {

        String str = "Superstar from wedevx";
        StringBuilder sb = new StringBuilder(str);

        sb.append(" is going to the moon");

        String str1 = sb.toString();

        System.out.println(str1);

        //sb.equals
        //sb.indexf
        //sb,lastIndexOf
        //all work the same for StringBuilder as String

    }
}
