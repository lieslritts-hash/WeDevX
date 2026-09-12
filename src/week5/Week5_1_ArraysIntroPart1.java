package week5;

/*
5.1 Arrays Intro. Part 1
1. Overview
Hello superstars! Welcome back to another session! In this session, we gonna learn about Arrays.

2. What is Java Collection?
Collection in Java is a framework that provides an architecture to store and manipulate the group of objects. Before we were learning primitive data types, as you know primitive data types can hold one variable. In programming, everything is about manipulating with data, searching, modifing and etc. So, in this cases, it is suggested to use and work with collections to store and manipulate with data easily. And, today we gonna learn about the first type of Java Collections, Arrays.

What is Array in Java?
Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type. Instead of declaring individual variables, such as number0, number1, ..., and number99, you declare one array variable such as numbers and use numbers[0], numbers[1], and ..., numbers[99] to represent individual variables. This tutorial introduces how to declare array variables, create arrays, and process arrays using indexed variables.

Creating Arrays
You can create an array by using the new operator with the following syntax −

Syntax
plain
Copy code
arrayRefVar = new dataType[arraySize];
The above statement does two things −

It creates an array using new dataType[arraySize].

It assigns the reference of the newly created array to the variable arrayRefVar.

Declaring an array variable, creating an array, and assigning the reference of the array to the variable can be combined in one statement, as shown below − array-in-java.jpg 1*GEmaa3Teeoi9m_fzVZOljw.png

3. Conclusion
I hope today's class was helpful. See you guys in the next class! Keep working hard!
 */
//What are Collections?
//The Collection in Java is a framework that provides an architecture
//to store and manipulate the group of objects.
//Java collections can achieve all the operations that you perform on a data
//such as searching, sorting, insertion, manipulation, and deletion.
//
//Arrays
//What are they?
//Java provides a data structure, the array, which stores a fixed-size sequential
//collection of elements of the same type. An array is used to store a collection of data,
//but it is often more useful to think of an array as a collection of variables of the same type.
//Instead of declaring individual variables, such as number0, number1,..., and number99,
//you declare one array variable such as numbers and use numbers[0], numbers[1], and ..., numbers[99]
//to represent individual variables.
//Arrays
//How to declare and create?
//dataType[] arrayRefVar = new dataType[size]; //preferred way
//or
//dataType arrayRefVar[] = new dataType[size]; //works but not preferred way
//
//ex:
//double[] mylist = new double[5]; //prefered way
//or
//double myList[] = new double[5]; //works bit not preferred way
//
// Type of array
//      |     _______ Array symbol (required)
//      |    |
//      \/  \/
//      int [] numbers = new int[3];
//                              /\
//              size of array____|
//
//Array Properties
//Fixed Length: Once an array is created, we cannot change its size.
//So consider using arrays when the numbers of elements are known and fixed.
//Fast access: It's very fast access any elements in an array (by index of the elements)
//in constant time: accessing the 1st element takes same time as accessing the last element.
//So performance is another factor when choosing arrays.
//An array can hold primitives or objects.
//An array of objects stores only references of the objects.
//In Java, the position of an element is specified by index which is zero-based
//means the first element is at index 0, the second element at index 1, and so on.
//An array itself is actually an object.

public class Week5_1_ArraysIntroPart1 {
    public static void main(String[] args) {
        System.out.print("Hello, World!");

    }
}
