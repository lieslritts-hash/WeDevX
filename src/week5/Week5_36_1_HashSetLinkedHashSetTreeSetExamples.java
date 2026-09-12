package week5;

/*
5.36.1 HashSet, LinkedHashSet, TreeSet Examples*
easy
|
30 min
|
Share
This Java program demonstrates the functionalities of HashSet, LinkedHashSet and TreeSet Java collections. The code provides examples of sets containing strings. No need to change anything, to see the actual outcomes, click the Submit button, and then expand the received test case.

Code
plain
Copy code
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Create a list of fruits
        List<String> listOfFruits = Arrays.asList("Dragon fruit", "Cherry", "Banana", "Apple");
        /* HashSet does not maintain insertion order, eliminates duplicates,
        and provides constant-time performance for basic operations */
//HashSet<String> hashExample = new HashSet<>(listOfFruits);
/* LinkedHashSet maintains the insertion order, eliminates duplicates,
and has slightly slower performance compared to HashSet */
//LinkedHashSet<String> linkedHashExample = new LinkedHashSet<>(listOfFruits);
/* TreeSet sorts the elements in natural order (if they are Comparable)
or by a Comparator provided at TreeSet construction time */
//TreeSet<String> treeExample = new TreeSet<>(listOfFruits);

       // System.out.println("HashSet:\t" + hashExample);
       // System.out.println("LinkedHashSet:\t" + linkedHashExample);
       // System.out.println("TreeSet:\t" + treeExample);
    //}
           // }
 //*/

public class Week5_36_1_HashSetLinkedHashSetTreeSetExamples {
    public static void main(String[] args) {
        // Create a list of fruits
    }
}
