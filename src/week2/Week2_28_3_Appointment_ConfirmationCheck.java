package week2;

import java.util.Scanner;

/*
2.28.3 Appointment confirmation check*
easy
|
30 min
|
Share
Write a Java program that checks if a user has confirmed their appointment and prints a message if they have not. Ask the user You have an appointment at 13:45, do you confirm it? Enter true/false

Required Variables:
plain
Copy code
____ isConfirmed = ___;
if the user enters true print out:

plain
Copy code
Appointment status: Confirmed! See you Soon.
if the user enters false print out:

plain
Copy code
Appointment status: Not confirmed Please confirm your appointment as soon as possible.
Example #1:
Input:

plain
Copy code
true
Output:

plain
Copy code
You have an appointment at 13:45, do you confirm it? Enter true/false
Appointment status: Confirmed! See you Soon.
Example #2:
Input:

plain
Copy code
false
Output:

plain
Copy code
You have an appointment at 13:45, do you confirm it? Enter true/false
Appointment status: Not confirmed Please confirm your appointment as soon as possible.
 */

public class Week2_28_3_Appointment_ConfirmationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("You have an appointment at 13:45, do you confirm it? Enter true/false");
        boolean confirm = sc.nextBoolean();

        if(confirm) {
            System.out.println("Appointment status: Confirmed! See you Soon.");
        }

        if(!confirm) {
            System.out.println("Appointment status: Not confirmed Please confirm your appointment as soon as possible.");
        }
    }
}
