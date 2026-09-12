package week3;

/*
3.50.4 Find the Index of Substring
easy
|
30 min
|
Share
Write a method called findSubstringIndex() that takes a string and a substring as input and returns the index of the first occurrence of the substring in the string.

Return Type: int

Example #1:
Parameters:

plain
Copy code
String input = "Hello World!"
subsequence = "world"
Return:

plain
Copy code
-1
Example #2:
Parameters:

plain
Copy code
String input = "Hello World!"
subsequence = "World"
Return:

plain
Copy code
6
 */
//write your static method here. No need to add Main class or main method.

public class Week3_50_4_FindTheIndexOfSubstring {
    public static void main(String[] args) {

        System.out.println(findSubstringIndex("Hello World!", "world")); //-1
        System.out.println(findSubstringIndex("Hello World!", "World")); //6
    }

    public static int findSubstringIndex(String str, String subsequence) {
        return str.indexOf(subsequence);
    }
}
