package week5;

/*
5.41 Set Contains Method
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna learn about Set methods. Today we will cover set.contains() method.

2. Set contains() method
The contains() method is used to check if this HashSet contains the specified
element or not. It returns true if element is found otherwise, returns false.

Syntax
public boolean contains(Object e) Parameter: e - element to be checked; Example 1

java
Copy code
public static void main(String[] args) {

    Set<String> username = new HashSet<>();

    username.add("alex@gmail.com");
    username.add("elon@musk.com");

    System.out.println(username.contains("Elon"));

    if(username.contains("elon@musk.com")){
        System.out.println("Contained");
    }
}
plain
Copy code
Output is:
false
Contained
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_41_SetContainsMethod {
    public static void main(String[] args) {

    }
}
