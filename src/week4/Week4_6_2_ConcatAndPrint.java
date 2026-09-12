package week4;

/*
4.6.2 Concat and Print*
easy
|
30 min
|
Share
Write a static method named printConcatenatedString() that takes two Strings as parameters, concatenates them, and prints out all the characters of the concatenated String separated with a dash (-) in a single line using a while-loop and printf.

The method signature should be:
plain
Copy code
public static void printConcatenatedString(String str1, String str2)
The method should concatenate str1 and str2, and then iterate through the concatenated String using a while loop to print out each character separated with a dash (-) in a single line.

Return Type: void

Example #1:
Parameters:

plain
Copy code
String word1 = "hello"
String word2 = "world"
Output:

plain
Copy code
h-e-l-l-o-w-o-r-l-d-
Example #2:
Parameters:

plain
Copy code
String word1 = "Java"
String word2 = "is easy"
Output:

plain
Copy code
J-a-v-a-i-s- -e-a-s-y-
 */

//public static void printConcatenatedString(String str1, String str2) {
//
//       for(char c : str1.toCharArray() {
//              System.out.print(c + "-");
//            }
//        for (char c : str2.toCharArray()) {
//            System.out.print(c + "-");
//        }
//    }
//}



public class Week4_6_2_ConcatAndPrint {
    public static void main(String[] args) {

        printConcatenatedString("hello", "world");
        printConcatenatedString("Java", "is easy");

    }

    public static void printConcatenatedString(String str1, String str2) {

        String combined = str1.concat(str2);
        int counter = 0;

        while (counter < combined.length()) {
            System.out.printf("%s-", combined.substring(counter, counter + 1));
            counter++;
        }
        System.out.println();
    }
}
