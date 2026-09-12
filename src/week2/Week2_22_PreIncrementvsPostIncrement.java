package week2;

/*
2.22 Pre-Increment vs Post-Increment
Master the concepts of pre-increment and post-increment
operators in Java and their practical use in this detailed class.
 */

public class Week2_22_PreIncrementvsPostIncrement {
    public static void main(String args[]) {
        int hour = 11;
        int minute = 59;
        int second = 53;

        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++second;
        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++second;
        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++second;
        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++second;
        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++second;
        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++second;
        System.out.println(hour + ":" + minute + ":" + second + " PM");

        ++hour;
        minute = 0;
        second = 0;
        System.out.printf("%d:%02d:%02d AM%n", hour, minute, second);

        System.out.println("Happy New Year! Let's make this year our best year yet. Let's set goals that scare us, take massive action towards them, and refuse to settle for anything less than our absolute best. Remember, success is your duty, your obligation, and your responsibility. Let's dominate our goals and make this year one for the record books. Let's do whatever it takes to make it happen!");
    }
}
