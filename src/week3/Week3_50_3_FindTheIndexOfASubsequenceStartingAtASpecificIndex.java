package week3;

/*
3.50.3 Find the Index of a Subsequence Starting at a Specific Index
easy
|
30 min
|
Share
Write a method called findSubsequenceIndex() that takes a string, a subsequence, and a starting index as input and returns the index of the first occurrence of the subsequence in the string starting at the specified index. Params: String input: The string to be searched. String subsequence: The subsequence to be found. int startIndex: The starting index of the search. Return: int: The index of the first occurrence of the subsequence in the string starting at the specified index, or -1 if the subsequence is not found.

Examples:
Input: input = "Hello World!" subsequence = "l" startIndex = 5 Output: 9
 */
//write your static method here. No need to add Main class or main method.

public class Week3_50_3_FindTheIndexOfASubsequenceStartingAtASpecificIndex {
    public static void main(String[] args) {

        System.out.println(findSubsequenceIndex("Hello World!","l", 5)); //9
    }

    public static int findSubsequenceIndex(String str, String subsequence, int startIndex) {
        return str.indexOf(subsequence, startIndex);
    }

}
