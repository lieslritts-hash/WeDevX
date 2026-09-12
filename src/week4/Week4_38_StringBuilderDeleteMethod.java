package week4;

/*
4.38 String Builder Delete Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about delete() method of StringBuilder class.

2. StringBuilder delete() method
The delete(int start, int end) method of StringBuilder class removes the characters starting from index start to index end-1 from String contained by StringBuilder. This method takes two indexes as a parameter first start represents index of the first character and endIndex represents index after the last character of the substring to be removed from String contained by StringBuilder and returns the remaining String as StringBuilder Object.

Syntax
Following is the syntax of the Java StringBuilder delete() method −

plain
Copy code
public StringBuilder delete(int start, int end)
Parameters
start − This is the beginning index, inclusive.

end − This is the ending index, exclusive.

Return Value
This method returns the substring of this sequnece. Example 1

java
Copy code
public static void main(String[] args) {

    StringBuilder str = new StringBuilder("Hello Superstars");
    str.delete(0,5);
    System.out.println(str);

    StringBuilder str1 = new StringBuilder("Java is my a future carrer");
    str1.delete(5,13);
    System.out.println(str1);
}
plain
Copy code
Output is:
Superstars
Java future carrer
 */
//write your static method here. No need to add Main class or main method.

public class Week4_38_StringBuilderDeleteMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello Superstar");

        sb.delete(0,6);
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("SDET is my future career");
        sb1.delete(10,17);
        System.out.println(sb1);
    }
}
