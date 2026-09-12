package week4;

/*
4.39 String Builder Replace Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about replace() method of StringBuilder class.

2. What is StringBuilder replace() method?
The Java StringBuilder replace() method is used to replace the characters in a substring of a StringBuilder object with characters in the specified String. The substring begins at the specified start and extends to the character at index end - 1 or to the end of the sequence. It accepts 3 parameters, int starting point, int end point and String value.

Syntax
plain
Copy code
public StringBuilder replace(int start, int end, String str)
Parameters
start − This is the beginning index, inclusive.

end − This is the ending index, exclusive.

str − This is the String that will replace previous contents.

Return Value
This method returns this object. Example 1

java
Copy code
public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Java, Junit, Selenium, API");
    // int point, end point, String to replace
    sb.replace(6,11, "Cucumber");
    System.out.println(sb);

    StringBuilder sb1 = new StringBuilder("Let's get down the business");
    sb1.replace(10,18, "some");
    System.out.println(sb1);

}
plain
Copy code
Output is:
Java, Cucumber, Selenium, API
Let's get some business
In the above example, we replaced Junit to **Cucumber** and down the to **some**.
3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week4_39_StringBuilderReplaceMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java, Junit, Selenium, API");
        //replace(int startIndex, int endIndex, String strToReplace)
        sb.replace(6, 11, "Cucumber");
        System.out.println(sb);

        StringBuilder sb1 = new StringBuilder("Let's get down to business");
        //Let's get some business done
        sb1.replace(10, 18, "some ").append(" done");
        System.out.println(sb1);

    }
}
