package week5;

/*
5.20 Wrapper Class Initialization
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna learn how to initialise wrapper class values. This concept
is not really common used in real practice. But, it is good to know.

2. Wrapper class initialization.
java
Copy code
public static void main(String[] args) {

    Integer x = new Integer(25);
    Double d = new Double(23.5);
    Character ch = new Character('k');
    Boolean b = new Boolean(true);

    System.out.println(x);
    System.out.println(d+4.5);
    System.out.println(ch);
}
plain
Copy code
Output is:
25
28.0
k
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_20_WrapperClassInitialization {
    public static void main(String[] args) {
        Integer num = new Integer(25);
        Double d = new Double(23.5);
        Character c = new Character('h');
        Boolean b = new Boolean(true);

        System.out.print(num);
        System.out.println(d + 3.0);
    }
}
