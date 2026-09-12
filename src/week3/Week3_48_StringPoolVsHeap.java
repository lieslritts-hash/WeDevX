package week3;

/*
3.48 String Pool vs Heap
 */

//String str = "Hello"; //literals
//String str1 = new String("Hello');

//String str = "devx";
//String str2 = "devx";
//there is only one instance of the same value. No duplicate values in string pool.

//String str = new String("Cars");
//String str2 = new String('Cars");
//str == str2 //false because are two different objects

//Can you tell me the differnce between String Pool and Java Heap?
//String Pool is a memory location inside Java Heap that optimizes the memory usage of Strings.
//All String values that are assigned using String Literals are saved in the String Pool.
//There are no duplicate values allowed inside String Pool.
//Whenever you are creating the same string with two literals,
//it means two variables will be pointing to the same exact value in the String Pool.
//vs using a new String keyword, which means you are creating a new object
//all new ojects are stored in the Java Heap.
//in Java heap you can have duplicate values.
//so if you are always creating a new word in java heap
//which will add up in your memory usage

public class Week3_48_StringPoolVsHeap {
    public static void main(String args[]) {

        System.out.println("Well done! Keep up the great work!");

        String str = "devx";
        String str2 = "devx";
        String str3 = new String("devx");
        String str4 = new String("devx");

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        //checks the value and doesn't care about memory location.
        System.out.println(str.equals(str4));

        //== -> compares the memory location, doesn't care abou the value
        boolean isEquals = str == str4; //false
        System.out.println(isEquals);

        boolean isEquals2 = str == str2;
        System.out.println(isEquals2);

    }
}

