package week4;

/*
4.24 Continue Statements practice
Strengthen your understanding of continue statements in Java with this hands-on video
to master this essential control flow statement.
 */

public class Week4_24_ContinueStatementsPractice {
    public static void main(String[] args) {

        //write a program that prints out just even numbers
        //2,4,6,8,10

        int counter = 1;
        while (counter <= 10) {

            if (counter % 2 != 0) {
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }

        System.out.println("========================");

        //write a program that prints out every
        // character in a String except spaces

        String str = "Hello Future SDET Superstar";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {
                continue;
            }
            System.out.println(str.charAt(i));
        }
    }
}
