package week4;

/*
4.2.3 Receive an Offer*
easy
|
30 min
|
Share
Exercise Description
Write a program that prints out $150k/year Job Offer Loading... 6 times using a while loop, followed by Offer from JPMorgan Chase Received! printed once.

Inputs
This program does not take any inputs.

Output
The program should output the following:

plain
Copy code
$150k/year Job Offer Loading...
$150k/year Job Offer Loading...
$150k/year Job Offer Loading...
$150k/year Job Offer Loading...
$150k/year Job Offer Loading...
$150k/year Job Offer Loading...
Offer from JPMorgan Chase Received!
 */

public class Week4_2_3_ReceiveAnOffer {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 6) {
            System.out.println("$150k/year Job Offer Loading...");
            counter++;
        }

        System.out.println("Offer from JPMorgan Chase Received!");
    }
}
