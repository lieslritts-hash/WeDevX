package week4;

/*
4.40 String Builder Reverse Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about reverse() method of StringBuilder class.

2. What is StringBuilder reverse() method?
The reverse() method of StringBuilder is used to reverse the characters in the StringBuilder. The method helps to this character sequence to be replaced by the reverse of the sequence

Syntax:
public StringBuilder reverse()
Parameter:
NA

Returns:
It returns the reference of this object. Example 1

java
Copy code
public static void main(String[] args) {

   StringBuilder sb2 = new StringBuilder("Superstars");
        sb2.reverse();
        System.out.println(sb2);
}
plain
Copy code
Output is:
sratsrepuS
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week4_40_StringBuilderReverseMethod {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Superstar");
        sb.reverse();
        System.out.println(sb);

    }
}
