package week5;

/*
5.40 Set Size, Clear, isEmpty Methods
1. Overview
Hello superstars! Welcome back to another session!
In this session, we gonna learn about Set methods.
Today we will cover set.size() , set.clear(),
set.isEmpty() methods.

2. Set methods
2.1. Set size() method
set.size() method is used to get the size of the Set or
the number of elements present in the Set. Syntax:

plain
Copy code
int size();
2.2. Set clear() method
set.clear() method is used to remove all the elements
from a Set. Using the clear() method only clears all
the element from the set and not deletes the set.
In other words, we can say that the clear() method is
used to only empty an existing Set. Syntax:

plain
Copy code
void clear();
2.2. Set isEmpty() method
set.isEmty() method checks whether Set is empty or not.
It returns true if Set is empty , otherwise it will
return false. Syntax:

plain
Copy code
boolean isEmpty();
Example 1

java
Copy code
public static void main(String[] args) {

    Set<Double> salaries = new HashSet<>();
        salaries.add(100.00);
        salaries.add(145.78);
        salaries.add(198.97);
        salaries.add(152.97);

        System.out.println(salaries);
        System.out.println("Size is: "+salaries.size());

     salaries.clear();
        System.out.println(salaries);

        System.out.println(salaries.isEmpty());

        salaries.add(123.98);
        salaries.add(87.89);
        System.out.println(salaries.isEmpty());

}
plain
Copy code
Output is:
[145.78, 198.97, 100.0, 152.97]
Size is: 4
[]
true
false
##### **3\. Conclusion**
I hope today's class was helpful. See you guys in the
next class! Keep working hard!
 */
//write your static method here. No need to add Main class or main method.

public class Week5_40_SetSizeClearIsEmptyMethods {
    public static void main(String[] args) {

    }
}
