package week5;

/*
5.47 Set removeAll Method
1. Overview
Hello superstars! Welcome back to another session! In this
session, we gonna learn about Set methods. Today we will
cover set.removeAll() method.

2. Set removeAll() method
The removeAll() method is used to remove from this set all
 of its elements that are contained in the specified collection. Syntax:

plain
Copy code
public boolean removeAll(Collection c)
Parameters: This method takes collection c as a parameter
containing elements to be removed from this set. Example 1

java
Copy code
public static void main(String[] args) {

    Set<Double> num1 = new HashSet<>(Arrays.asList
    (2.0, 3.2, 4.5, 6.0));
    Set<Double> num2 = new HashSet<>(Arrays.asList
    (1.0, 2.0, 4.5, 6.1));

    System.out.println("Before remove: "+num1);

    num1.removeAll(num2);
    System.out.println("after remove: "+num1);
}
plain
Copy code
Output is:
Before remove: [2.0, 4.5, 3.2, 6.0]
after remove: [3.2, 6.0]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_47_SetRemoveAllMethod {
    public static void main(String[] args) {

    }
}
