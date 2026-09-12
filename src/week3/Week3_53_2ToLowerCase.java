package week3;

/*
3.53.2 To Lower Case*
easy
|
30 min
|
Share
Description: Write a static method called convertToLowerCase() that prompts the user to enter a sentence, converts all letters in the sentence to lowercase, and prints the modified sentence. Params:

A sentence input from the user
Return

The modified sentence with all letters converted to lowercase
Expected Output:

plain
Copy code
convertToLowerCase("I LOvE tO CodE");// "i love to code"
convertToLowerCase("JAVA iS aN ObJEcT oRieNTed PrOGraMMiNG LaNGuaGE"); //"java is an object oriented programming language"
convertToLowerCase("I aM A sENiOr sOFtware eNgINeeR");//"i am a senior software engineer"
 */
//write your static method here. No need to add Main class or main method.


public class Week3_53_2ToLowerCase {
    public static void main(String[] args) {

        System.out.println(convertToLowerCase("I LOvE tO CodE")); // "i love to code"
        System.out.println(convertToLowerCase("JAVA iS aN ObJEcT oRieNTed PrOGraMMiNG LaNGuaGE")); //"java is an object oriented programming language"
        System.out.println(convertToLowerCase("I aM A sENiOr sOFtware eNgINeeR")); //"i am a senior software engineer")

    }

    public static String convertToLowerCase(String sentence) {
        return sentence.toLowerCase();
    }

}
