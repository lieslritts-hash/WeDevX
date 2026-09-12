package week5;

/*
5.29 Array List Add Method
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn
about ArrayList add() methods.

1. ArrayList add() methods
There two ways of ArrayList.add() methods:

**ArrayList.add( E elemen)**method inserts the given element at the end of this list.
Declaration

plain
Copy code
public void add E element)
**ArrayList.add(int index, E elemen)**method inserts the specified
element E at the specified position in this list. Declaration

plain
Copy code
public void add(int index, E element)
Exception
IndexOutOfBoundsException − if the index is out of range.
If we will specify the index which is not on the list, the program
will throw IndexOutOfBoundsException. Example 1

java
Copy code
public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("BMW");
    list.add("Golf");
    list.add("Bugatti");
    System.out.println(list);

    List<Double> revenue = new ArrayList<>();
    revenue.add(185.78);
    revenue.add(243.67);
    revenue.add(100.00);
    System.out.println("Revenue is "+revenue);

    // add method with index
    List<Integer> numList = new ArrayList<>();
    numList.add(12);
    numList.add(56);
    numList.add(67);
    System.out.println(numList);

    numList.add(1,35);
    System.out.println("New list "+numList);

}
plain
Copy code
Output is:
[BMW, Golf, Bugatti]
Revenue is [185.78, 243.67, 100.0]
[12, 56, 67]
New list [12, 35, 56, 67]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_29_ArrayListAddMethod {
    public static void main(String[] args) {

    }
}
