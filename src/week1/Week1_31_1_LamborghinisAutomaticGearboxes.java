package week1;

/*
1.31.1 Lamborghini's automatic gearboxes*
easy
|
30 min
|
Share
Lamborghini's automatic gearboxes typically use gear shift paddles mounted behind the steering wheel to allow the driver to control the gear selection manually. The gear shift paddles are typically labeled with "+" and "-" signs, indicating upshift and downshift, respectively. When the driver pulls the "+" paddle, the gearbox will shift up to the next higher gear, while pulling the "-" paddle will result in a downshift to a lower gear. This allows the driver to have more control over the engine's power and torque, especially during high-performance driving. Write a program that will store + and - characters in a char variable and prints out the values with a description of what each sign means and does.

plain
Copy code
____ upShiftSign = _____;
____ downShiftSign = _____;

____ upShiftDescription = _____;
____ downShiftDescription = _____;

//add a system printf() to print out upShiftSign and
 upShiftDescription
//add a system printf() to print out downShiftSign and
downShiftDescription
Expected Output:

plain
Copy code
+ paddle, the gearbox will shift up to the next higher gear
- paddle will result in a downshift to a lower gear
 */

public class Week1_31_1_LamborghinisAutomaticGearboxes {
    public static void main(String[] args) {
        char upShiftSign = '+';
        char downShiftSign = '-';

        String upShiftDescription = "paddle, the gearbox will shift up to the next higher gear";
        String downShiftDescription = "paddle will result in a downshift to a lower gear";

        System.out.printf(
                "%c %s\n" +
                        "%c %s",
                upShiftSign, upShiftDescription,
                downShiftSign, downShiftDescription
        );
    }
}

