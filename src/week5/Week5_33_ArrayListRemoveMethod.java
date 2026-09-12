package week5;

/*
5.33 Array List Remove Method
1. Overview
Hello superstars! Welcome back to another session!
In this session,
we gonna learn about ArrayList .remove() method.

2.ArrayList.remove(index) method
ArrayList.remove(index) method removes the element at
the specified index in the list.

Declaration
plain
Copy code
public ArrayList.remove(index)
Parameter:
index - index where to remove the element

Exception
IndexOutOfBoundsException − if the index is out of range.
Example 1

java
Copy code
public static void main(String[] args) {
    List<Double> numList = new ArrayList<>();
    numList.add(12.34);
    numList.add(13.55);
    numList.add(20.00);
    numList.add(13.87);

    System.out.println(numList);
    numList.remove(0);
    numList.remove(2);

    System.out.println(numList);

}
plain
Copy code
Output is:
[12.34, 13.55, 20.0, 13.87]
[13.55, 20.0]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the
next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_33_ArrayListRemoveMethod {
    public static void main(String[] args) {

    }
}
