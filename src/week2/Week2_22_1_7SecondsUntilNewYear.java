package week2;

/*
2.22.1 7 seconds until New Year 🎆*
easy
|
30 min
|
Share
Write a program that counts the number of seconds until the New Year. Use pre-increment to increment the number of seconds after each passing second and print them out.

plain
Copy code
___ hour = ___;
___ minute = ___;
___ second = ____;
Expected Output:

plain
Copy code
11:59:53 PM
11:59:54 PM
11:59:55 PM
11:59:56 PM
11:59:57 PM
11:59:58 PM
11:59:59 PM
12:00:00 AM
Happy New Year! Let's make this year our best year yet. Let's set goals that scare us, take massive action towards them, and refuse to settle for anything less than our absolute best. Remember, success is your duty, your obligation, and your responsibility. Let's dominate our goals and make this year one for the record books. Let's do whatever it takes to make it happen!
Print the last massage in one println statement.
 */
public class Week2_22_1_7SecondsUntilNewYear {
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
