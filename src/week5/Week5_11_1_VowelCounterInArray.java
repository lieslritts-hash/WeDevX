package week5;

/*
5.11.1 Vowel Counter in Array*
easy
|
30 min
|
Share
Create a static method named countVowelsInArray() that takes an
array of strings as a parameter. The method should count and return the
total number of vowels (A, E, I, O, U) among all the elements in the array,
regardless of letter case (uppercase or lowercase).

Example:
Parameters:

plain
Copy code
String[] arr = ["Hello", "world", "AI"]
Return:

plain
Copy code
5
 */
//write your static method here. No need to add Main class or main method.


public class Week5_11_1_VowelCounterInArray {
    public static void main(String[] args) {

        String[] arr = {"Hello", "world", "AI"};

        System.out.println(countVowelsInArray(arr));
    }

    public static int countVowelsInArray(String[] arr) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];

            for (int x = 0; x < str.length(); x++) {
                if (str.charAt(x) == 'a' || str.charAt(x) == 'e' || str.charAt(x) == 'i'
                        || str.charAt(x) == 'o' || str.charAt(x) == 'u'
                        || str.charAt(x) == 'A' || str.charAt(x) == 'E' || str.charAt(x) == 'I'
                        || str.charAt(x) == 'O' || str.charAt(x) == 'U') {

                    counter++;
                }
            }
        }

        return counter;
    }
}