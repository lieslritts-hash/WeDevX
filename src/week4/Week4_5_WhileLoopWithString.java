package week4;

/*
4.5 While Loop With String
 */

public class Week4_5_WhileLoopWithString {
    public static void main(String[] args) {

        //Given a Hello Superstar String
        //print out each character of a String in a new line

        String str = "Hello Superstar";

        System.out.println(str.charAt(0)); //+1
        System.out.println(str.charAt(1)); //+1
        System.out.println(str.charAt(2)); //+1
        System.out.println(str.charAt(3)); //+1
        System.out.println(str.charAt(4)); //+1
        System.out.println(str.charAt(5)); //+1
        System.out.println(str.charAt(6)); //+1
        System.out.println(str.charAt(7)); //+1
        System.out.println(str.charAt(8)); //+1
        System.out.println(str.charAt(9)); //+1
        System.out.println(str.charAt(10)); //+1
        System.out.println(str.charAt(11)); //+1
        System.out.println(str.charAt(12)); //+1
        System.out.println(str.charAt(13)); //+1
        System.out.println(str.charAt(14)); //+1

        System.out.println("=========================");

        int counter = 0;

        while (counter <= 14) {
            System.out.println(str.charAt(counter));
            counter++;
        }

        System.out.println("=========================");

        //write a program that will print out each character in a String "Mars"
        String str2 = "Mars";

        int counter2 = 0;

        while (counter2 <= 3) {
            System.out.println(str2.charAt(counter2));
            counter2++;
        }

        System.out.println("=========================");

        //write a program that will print out each character in a String "Mars"
        String str3 = "Mars Ellon SpaceX Wedevx";

        int counter3 = 0;

        while (counter3 <= str3.length()-1) {
            System.out.println(str3.charAt(counter3));
            counter3++;
        }
    }
}
