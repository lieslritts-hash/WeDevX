package week1;

/*
1.21.5 Think Different 3
easy
|
30 min
|
Share
Write a program that declares a String that stores
the following message on multiple lines: using \n to
break the line and include double quotes. Then prints
out the value of the String.

java
Copy code
____ apple = _____;
System.out.println(apple);
Expected Output:

plain
Copy code
Apple Inc.
"Think Different"
 */

public class Week1_21_5_ThinkDifferent3 {
    public static void main(String[] args) {
        String apple = "Apple Inc.\n\"Think Different\"";
        System.out.println(apple);
    }
}

