package week5;

/*
5.5.1 Check letter in last word*
easy
|
30 min
|
Share
Description: Write a method called checkLetter() that takes a String array
and a char and checks if the last string in the array contains that char.
Return true or false. Make the method case-insensitive. Params: A String array, a char.
Return: Boolean of a result. Example: checkLetter(["Combo", "wedevx", "", " ", "This is the longer string"], 'G');
// Returns True checkLetter(["Some characters in the array", "**#12!$%", " "], '$');
// Returns False checkLetter(["1", "2", "3", "4", "5"], '5'); // Returns True Note: No input is needed for this exercise.
Arrays are already created at the back.
 */
//write your static method here. No need to add Main class or main method.

public class Week5_5_1_CheckLetterInLastWord {
    public static void main(String[] args) {
            System.out.println(checkLetter(
                    new String[]{"Combo", "wedevx", "", " ", "This is the longer string"}, 'G'));
            System.out.println(checkLetter(
                    new String[]{"Some characters in the array", "**#12!$%", " "}, '$'));
            System.out.println(checkLetter(
                    new String[]{"1", "2", "3", "4", "5"}, '5'));

    }
    public static boolean checkLetter(String[] str, char letter) {
        String lastWord = str[str.length -1];

        return lastWord.toLowerCase().contains(String.valueOf(letter).toLowerCase());
    }
}
