package week4;

/*
4.6 While Loop With Strings 1

 */

public class Week4_6_WhileLoopWithStrings1 {
    public static void main(String[] args) {

        //write a program that prints all characters in "Superstar" string
        //from the last character till the first character

        String str = "Superstar";

        System.out.println(str.charAt(8)); //-1
        System.out.println(str.charAt(7)); //-1
        System.out.println(str.charAt(6)); //-1
        System.out.println(str.charAt(5)); //-1
        System.out.println(str.charAt(4)); //-1
        System.out.println(str.charAt(3)); //-1
        System.out.println(str.charAt(2)); //-1
        System.out.println(str.charAt(1)); //-1
        System.out.println(str.charAt(0)); //-1

        System.out.println("============================");

        int counter = 8;

        while (counter >= 0) {
            System.out.println(str.charAt(counter));
            counter--;

        }

        System.out.println("============================");

        //write a program that prints out any String characters in reverse order

        String str2 = "I Love Java So Much";

        int counter2 = str2.length()-1;

        while (counter2 >= 0) {
            System.out.println(str2.charAt(counter2));
            counter2--;
        }

    }
}
