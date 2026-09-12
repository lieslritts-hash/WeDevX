package week5;

/*
5.43 Set Practice
1. Overview
Hello superstars! Welcome back to another session! In this
session, we gonna get
our hands dirty in practice Set collection.

2. Set collection practice
We need to write a program that converts Array of word into a
Set and counts unique words. Example 1

java
Copy code
public static void main(String[] args) {

    String[] words = {"apple", "car", "java", "car",
    "selenium", "apple", "word", "db", "api"};
    System.out.println(Arrays.toString(words));

    Set<String> setWord = new HashSet<>(Arrays.asList(words));
    System.out.println("Unique words " +setWord);
    System.out.println("Size of unique words "+setWord.size());
}
plain
Copy code
Output is:
[apple, car, java, car, selenium, apple, word, db, api]
Unique words [apple, java, selenium, car, api, word, db]
Size of unique words 7
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the next
class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_43_SetPractice {
    public static void main(String[] args) {

    }
}
