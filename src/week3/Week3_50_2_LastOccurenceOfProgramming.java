package week3;

/*
3.50.2 Last Occurence of Programming*
easy
|
30 min
|
Share
Write a static method called getLastIndexOfProgramming() that takes a string as input and finds the index of the last occurrence of the substring "programming". Params:

A string: the input string to search for the last occurrence of "programming"
Return:

An integer: the index of the last occurrence of "programming" in the input string. If "programming" is not found in the input string, the method should return -1.
Expected Output:

plain
Copy code
findLastIndexOfProgramming("programming is the best way of thinking and creating.") // Output: 0
findLastIndexOfProgramming("I love programming, it's my passion! Let's learn programming together") // Output: 49
findLastIndexOfProgramming("This sentence does not contain the word") // Output: -1
 */
//write your static method here. No need to add Main class or main method.


public class Week3_50_2_LastOccurenceOfProgramming {
    public static void main(String[] args) {

        System.out.println(getLastIndexOfProgramming("programming is the best way of thinking and creating.")); // Output: 0
        System.out.println(getLastIndexOfProgramming("I love programming, it's my passion! Let's learn programming together")); // Output: 49
        System.out.println(getLastIndexOfProgramming("This sentence does not contain the word")); // Output: -1
    }

    public static int getLastIndexOfProgramming(String str) {
        return str.lastIndexOf("programming");
    }
}
