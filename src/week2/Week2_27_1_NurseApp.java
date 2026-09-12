package week2;

import java.util.Scanner;

/*
2.27.1 Nurse App*
easy
|
30 min
|
Share
The average body temperature for an adult can vary slightly depending on a variety of factors, including age, sex, and time of day. In general, the accepted normal body temperature range for an adult is between 97.7°F (36.5°C) and 99.5°F (37.5°C). Write a program that asks the nurse users to enter the body temperature of the patient as a double: If the temperature is less than 97.7 then print out Drink Some Hot Tea to Warm Up if the temperature is more than 99.5 then print out Take Tylenol to Bring Your Temperature Down if the temperature is between 97.7 and 99.5 then the program should do nothing. Required Variables:

plain
Copy code
____ temperature = ____;
Expected Result: Possibility 1:

plain
Copy code
Please Enter Your Body Temperature:
Drink Some Hot Tea to Warm Up
Possibility 2:

plain
Copy code
Please Enter Your Body Temperature:
Take Tylenol to Bring Your Temperature Down
Possibility 3:

plain
Copy code
Please Enter Your Body Temperature:
 */

public class Week2_27_1_NurseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Body Temperature:");
        double temperature = sc.nextDouble();

        if(temperature < 97.7) {
            System.out.println("Drink Some Hot Tea to Warm Up");
        }

        if(temperature > 99.5) {
            System.out.println("Take Tylenol to Bring Your Temperature Down");
        }
    }
}
