package week5;

/*
5.30 Array List Get Method
1. Overview
Hello superstars! Welcome back to another session! In this
session, we gonna learn about ArrayList get() method.

ArrayList.get() method
ArrayList.get(int index) takes an index and returns an elements at given
index. Index starts from 0 like first element can be retrieved using get(0)
method call and so on.

Declaration
plain
Copy code
public ArrayList.get(int index)
Parameters
index − The index of the element to return. Example 1

java
Copy code
public static void main(String[] args) {
    List<String> companies = new ArrayList<>();
    companies.add("Google");
    companies.add("Apple");
    companies.add("Amazon");
    companies.add("Microsoft");

    String comp = companies.get(0);
    System.out.println(comp);
    comp += " company";
    System.out.println(comp);

    System.out.println(companies);

    List<Double> numList = new ArrayList<>();
    numList.add(12.34);
    numList.add(13.55);
    numList.add(20.00);
    numList.add(13.87);

    System.out.println(numList);
    double num = numList.get(1);
    System.out.println(num);
    double num1 = numList.get(3);
    System.out.println(num1);
}
plain
Copy code
Output is:
Google
Google company
[Google, Apple, Amazon, Microsoft]
[12.34, 13.55, 20.0, 13.87]
13.55
13.87
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.


public class Week5_30_ArrayListGetMethod {
    public static void main(String[] args) {

    }
}
