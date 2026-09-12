package week3;

/*
3.26.2 Fastest Internet*
easy
|
30 min
|
Share
The fastest internet speed ever recorded was achieved in 2020
by a team of researchers from University College London.
They were able to achieve a data transmission speed of 178
terabits per second (Tbps), which is equivalent to downloading
the entire Netflix library in under a second! This was achieved
using a new type of fiber-optic cable and amplifier that allows
more data to be transmitted over a single strand of glass fiber.
Create a class called Main that has a public static method called
getFastestInternetSpeed() that returns the fastest internet speed
ever recorded in terabits per second (Tbps). The value of the fastest
internet speed should be hardcoded inside the method and returned
to the calling code when the method is invoked. Call the
getFastestInternetSpeed() in main method. Expected Output:

plain
Copy code
The fastest internet speed ever recorded was 178 Tbps!
 */

public class Week3_26_1_FastestInternet {
    public static void main(String[] args) {
        int fastestSpeed = getFastestInternetSpeed();
        System.out.println("The fastest internet speed ever recorded was " + fastestSpeed + " Tbps!");
    }

    public static int getFastestInternetSpeed() {
        return 178;
    }

}
