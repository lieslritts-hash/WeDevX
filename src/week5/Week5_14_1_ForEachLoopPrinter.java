package week5;

/*
5.14.1 For Each Loop Printer*
easy
|
30 min
|
Share
This is a simple exercise showcasing the usage of a for-each loop to print all values from an array on separate lines. Click the Submit button to complete the task effortlessly. In addition to printing, a for-each loop is versatile and can be employed not only for displaying information but also for tasks such as accumulating the sum of numeric array values or manipulating individual elements. For example, you could use it to find the number of vowels in each array element.

Input:
plain
Copy code
{"Red", "Green", "Blue", "Yellow"}
Expected Output:
plain
Copy code
Red
Green
Blue
Yellow
Solution:
java
Copy code
public class Main {
  public static void main(String[] args) {
    String[] array = {"Red", "Green", "Blue", "Yellow"};

    forEachPrinter(array);
  }

  static void forEachPrinter(String[] inputArray) {
    for (String element : inputArray) {
      System.out.println(element);
    }
  }
}
 */




public class Week5_14_1_ForEachLoopPrinter {
    public static void main(String[] args) {
        String[] array = {"Red", "Green", "Blue", "Yellow"};

        forEachPrinter(array);
    }

    static void forEachPrinter(String[] inputArray) {
        for (String element : inputArray) {
            System.out.println(element);
        }
    }
}
