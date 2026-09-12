package week5;

/*
5.37 Initializing HashSet, LinkedHashSet, TreeSet in Java
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn how to initialise Sets.

2. Initialization of Sets in Java
We need to import import java.util.set package. HashSet

plain
Copy code
Set<String> set = new HashSet<>();
LinkedHashSet

plain
Copy code
Set<String> linkSet = new LinkedHashSet<>();
TreeSet

plain
Copy code
Set<String> treeSet = new TreeSet<>();
Example 1

java
Copy code
public static void main(String[] args) {

    //unique elements
    // unordered
    Set<String> set = new HashSet<>();

    //ordered set based on insertion order
    Set<String> linkSet = new LinkedHashSet<>();

    //ordered set based on logic order which provided
    Set<String> treeSet = new TreeSet<>();

    // we can convert ArrayList to Set

    List<String> list = new ArrayList<>();
    list.add("Helloword");
    list.add("Hi");
    list.add("Selenium");
    list.add("Java");
    list.add("DB");
    list.add("Hi");
    System.out.println("ArrayList: "+list);

    Set<String> set1 = new HashSet<>(list);

    System.out.println(set1);                      // we will get a list of unordered unique elements

    Set<String> set2 = new LinkedHashSet<>(list);
    System.out.println(set2);                         // we will get a list of ordered  unique elements

    Set<String> set3 = new TreeSet<>(list);
    System.out.println(set3);
}
plain
Copy code
Output is:
ArrayList: [Helloword, Hi, Selenium, Java, DB, Hi]
[Hi, Java, Helloword, Selenium, DB]
[Helloword, Hi, Selenium, Java, DB]
[DB, Helloword, Hi, Java, Selenium]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_37_InitializingHashSetLinkedHashSetTreeSetInJava {
    public static void main(String[] args) {

    }
}
