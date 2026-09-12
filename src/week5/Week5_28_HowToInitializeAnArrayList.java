package week5;

/*
5.28 How To Initialize An Array List
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about ArrayList initialization.

2. How to initialise an ArrayList?
There different ways to initialise ArrayList

ArrayList arraylist = new ArrayList(); - without defining data type

ArrayList arraylist = new ArrayList(); - restricting only to String

ArrayList  arraylist = new ArrayList<>(); - with only one diamond

List  arraylist = new ArrayList<>(); - with List interface

But, this way of ArrayList initialization is the most popular and industry standard.

plain
Copy code
List<Integer> list1 = new ArrayList<>();
Example 1

java
Copy code
public static void main(String[] args) {
    // first thing we need to import statement for ArrayList
    // import java.util.ArrayList;

    ArrayList arraylist = new ArrayList();
    // in this initialization, we are not specifying data type

    arraylist.add("word");
    arraylist.add(2);
    System.out.println(arraylist);

    //initialize and restrict to only String
    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("Michele");
    // we can add String without any problem
    //arrayList1.add(20);
    // can not add int, it throws compilation error

    System.out.println(arrayList1);

    //initialize with only one diamond
    ArrayList<String> arrayList2 = new ArrayList<>();
    arrayList2.add("Java");
    arrayList2.add("Selenium");
    System.out.println(arrayList2);

    //initialize with List interface
    List<Integer> list1 = new ArrayList<>();
    list1.add(22);
    list1.add(11);
    list1.add(12);
    System.out.println(list1);

}
plain
Copy code
Output is:
[word, 2]
[Michele]
[Java, Selenium]
[22, 11, 12]
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next
class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_28_HowToInitializeAnArrayList {
    public static void main(String[] args) {

    }
}
