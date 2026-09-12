package week4;

/*
4.19 For Loop Practice
Put your For Loop skills into practice with this hands-on video,
which offers a range of coding exercises to help you master this
fundamental building block of Java programming
 */

//write a method that returns int number and takes a String input
//the method should count the number of words in a String

public class Week4_19_ForLoopPractice {
    public static void main(String[] args)             {
        System.out.println(countWords("      "));

    }

    public static int countWords(String str) {
        //str = "hello world superstars java";
        //if the String is not empty, and there are no spaces, then it is one world
        //if there is 1 or more spaces, it means the number of words will number of spaces +1

        if (str.trim().isEmpty()) {
            return 0;
        }

        int spaceCounter = 0;

        for (int index = 0; index <= str.length()-1; index++) {

            if (str.charAt(index) == ' ') {
                spaceCounter++;
            }
        }

        return spaceCounter + 1;
    }

}
