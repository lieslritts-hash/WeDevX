package week3;

/*
3.50.1 First Occurrence of Java*
easy
|
30 min
|
Share
Description: Your task is to write a static method called findJavaIndex() that takes in a string as input and then finds the index of the first occurrence of the substring "Java". The method should return the index of the first occurrence of "Java" if it exists in the input string or -1 if it does not. Param: A string: The input string in which to find the index of the first occurrence of "Java". Return: An integer: The index of the first occurrence of "Java" in the input string, or -1 if it does not exist. Expected Output:

plain
Copy code
findIndexOfJava("This is a Java program"); // Expected output: 10
findIndexOfJava("Java is a popular programming language"); // Expected output: 0
findIndexOfJava("This string does not contain the word"); // Expected output: -1
 */
//write your static method here. No need to add Main class or main method.


public class Week3_50_1_FirstOccurrenceOfJava {
    public static void main(String[] args) {

        System.out.println(findJavaIndex("This is a Java program")); // Expected output: 10
        System.out.println(findJavaIndex("Java is a popular programming language")); // Expected output: 0
        System.out.println(findJavaIndex("This string does not contain the word")); // Expected output: -1)
    }
        public static int findJavaIndex(String str) {
        return str.indexOf("Java");
    }
}
