package week5;

/*
5.14 For Each Loop
1. Overview
Hello superstars! Welcome back to another session! In this session,
we gonna learn about for each loop. Since for each loop works only with
Collections, it is a right time to cover for each loop with Arrays.

1. What is for each loop?
The Java for-each loop traverses the array or collection until the last element.
For each element, it stores the element in the variable and executes the body of the
for-each loop. It is mainly used to traverse the array or collection elements. Syntax:

for(data_type variable : array | collection){

//body of for-each loop

} Image illustration of for - each loop

0*FeWQtdQTc4ajqbU3.png

3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */


public class Week5_14_ForEachLoop {
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
