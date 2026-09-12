package week3;
/*
3.51.1 Replace like with love*
easy
|
30 min
|
Share
Write a static method named replaceLikeWithLove() that takes a String parameter
representing a sentence entered by the user. The method should replace all occurrences
of the word "like" with "love", and then return the modified String. Param: String parameter
representing a sentence. Return the modified String. Here's an example of how to call the method:

plain
Copy code
String sentence = "I like to code like a boss";
replaceLikeWithLove(sentence);
The output of the method call should be:

plain
Copy code
I love to code love a boss
You can test the method with different input values to ensure that it properly replaces all
occurrences of the word "like" with "love".
 */
//write your static method here. No need to add Main class or main method.

public class Week3_51_1_ReplaceLikeWithLove {
    public static void main(String[] args) {

        System.out.println(replaceLikeWithLove("I like to code like a boss"));
    }

    public static String replaceLikeWithLove(String str) {
        return str.replace("like", "love");
    }
}
