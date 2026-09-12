package week5;

/*
5.42 Loop Through Set
1. Overview
Hello superstars! Welcome back to another session! In this
session, we gonna learn about how to loop through a Set
collections.

2. Loop in a Set collection
As we know already, there is no get() method in a Set
collections as an ArrayList. It is not possible to access
an element in Set collection based on index. Set collection
is a collection of unordered elements. That's why we will
use for each loop to go through an element in Set collection.
Example 1

java
Copy code
public static void main(String[] args) {

    Set<String> username = new HashSet<>();
    username.add("abd@apple.com");
    username.add("acd@google.com");
    username.add("akl@microsoft.com");

    for(String var: username){
        System.out.println(var);
    }

    }
plain
Copy code
Output is:
akl@microsoft.com
abd@apple.com
acd@google.com
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next
class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_42_LoopThroughSet {
    public static void main(String[] args) {

    }
}
