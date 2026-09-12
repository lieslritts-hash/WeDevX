package week4;

/*
4.12 While Loop with switch statement
 */

//write a method that takes a String
//and prints out all of the vowels in that String
//method doesn't return anything

public class Week4_12_WhileLoopWithSwitchStatement {
    public static void main(String[] args) {

        vowel("Hello");
        System.out.println("===========================");
        vowel("Superstar");
    }

    public static void vowel(String str) {

        //str = "Hello";
        int counter = 0;

        while (counter <= str.length()-1)  {
            switch (str.charAt(counter)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    System.out.println(str.charAt(counter));
                    counter++;
                    break;
                default:
                    counter++;
            }
        }
    }
}
