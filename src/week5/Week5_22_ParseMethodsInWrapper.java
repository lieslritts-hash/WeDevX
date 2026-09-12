package week5;

/*
5.22 Parse Methods in Wrapper
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about Wrapper class methods. As we know already, wrapper class is an object representative of primitive data types. So as an object, they have some useful methods. We will discuss about parse() method.

2. parseXxx() Method
We can use parseXxx() methods to convert String to primitive. A. primitive parseXxx(String s): Every Wrapper class except the character class contains the following parseXxx() method to find primitive for the given String object. Syntax:

plain
Copy code
public static primitive parseXxx(String s);
plain
Copy code
int i = Integer.parseInt(str);
byte b = Byte.parseByte(str);
double d = Double.parseDouble(str);
boolean bl = Boolean.parseBoolean(str);
**Example 1**
java
Copy code
public static void main(String[] args) {
     String str = "25";
     byte b = Byte.parseByte(str);

    System.out.println(str);
    System.out.println(b);

    int sum = b+10;
    System.out.println(sum);

    String str2 = "2500";
    short sh = Short.parseShort(str2);
    int multiple = sh * 10;
    System.out.println(multiple);

    String str3 = "10000";
    int n = Integer.parseInt(str3);
    int s = n + 10;
    System.out.println(s);

    String str4 = "2.5";
    double db = Double.parseDouble(str4);
    double calculation = d +3.0;
    System.out.println(calculation);

    String str5 = "true";
    boolean trueFalse = Boolean.parseBoolean(str5);
    System.out.println(trueFalse);

    String str6 = "C";
    char ch = str6.charAt(0);
    System.out.println(ch);

}
plain
Copy code
Output is:
25
25
35
25000
10010
5.5
true
C
In above example, we converted String value to primitive
data types using parseXxx() method. And, converted primitive
data type values we used in some calculations.
3. Conclusion
I hope today's class was helpful. See you guys in the next
class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_22_ParseMethodsInWrapper {
    public static void main(String[] args) {

        String str = "25";
        byte num = Byte.parseByte(str);
        System.out.println(str);

        System.out.println(num);

        int b = num+10;
        System.out.println(b);


    }
}
