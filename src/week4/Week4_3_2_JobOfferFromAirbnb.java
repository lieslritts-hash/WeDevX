package week4;
/*
4.3.2 Job Offer from Airbnb*
easy
|
30 min
|
Share
Write a program that prints out "$150k/year Job Offer Loading...
at wedevx month n" 6 times using a while loop, where n starts from
1 and goes until 6, and then prints "Offer from Airbnb Received!" one
time. Task:

Write a program that uses a while loop to print out "$150k/year Job
Offer Loading... at wedevx month n" six times, with n ranging from 1 to 6.

After printing out the six statements, print "Offer from Airbnb Received!" once.

Examples of using the method with different inputs:

plain
Copy code
$150k/year Job Offer Loading... at wedevx month 1
$150k/year Job Offer Loading... at wedevx month 2
$150k/year Job Offer Loading... at wedevx month 3
$150k/year Job Offer Loading... at wedevx month 4
$150k/year Job Offer Loading... at wedevx month 5
$150k/year Job Offer Loading... at wedevx month 6
Offer from Airbnb Received!
 */

public class Week4_3_2_JobOfferFromAirbnb {
    public static void main(String[] args) {

        int counter = 1;
        while (counter <= 6) {
            System.out.println("$150k/year Job Offer Loading... at wedevx month " + counter);
            counter++;
        }

        System.out.println("Offer from Airbnb Received!");

    }
}
