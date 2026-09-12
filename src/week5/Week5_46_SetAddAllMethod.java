package week5;

/*
5.46 Set addAll Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about Set methods. Today we will cover set.addAll() method.

2. Set addAll() method
The Set.addAll(Collection C) method is used to append all of the elements from the mentioned collection to the existing set. The elements are added randomly without following any specific order. Syntax:

plain
Copy code
boolean addAll(Collection C)
Parameters: The parameter C is a collection of any type that is to be added to
the set. Return Value: The method returns true if it successfully appends the
elements of the collection C to this Set otherwise it returns False. Example 1

java
Copy code
public static void main(String[] args) {

    Set<Double> num1 = new HashSet<>(Arrays.asList(2.0, 3.2, 4.5, 6.0));
    Set<Double> num2 = new HashSet<>(Arrays.asList(1.0, 0.2, 7.5, 6.0));

    System.out.println("Before union: "+num1);

    num1.addAll(num2);
    System.out.println("after union: "+num1);
}
plain
Copy code
Output is:
Before union: [2.0, 4.5, 3.2, 6.0]
after union: [2.0, 1.0, 4.5, 3.2, 0.2, 6.0, 7.5]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_46_SetAddAllMethod {
    public static void main(String[] args) {

    }
}
