package week1;

/*
1.19.1 Steve Jobs' Profile
easy
|
30 min
|
Share
Write a program that stores Steve Jobs' Profile
Info in a variable with the most suitable data type.

firstName of type String - value "Steve"

lastName of type String - value "Jobs"

birthDate of type String - value "February 24, 1955"

deathDate of type String - value "October 5, 2011"

occupation of type String - value "Entrepreneur,
inventor, and industrial designer"

Then print all the following info: Expected Output:

plain
Copy code
First name: Steve
Last name: Jobs
Birth date: February 24, 1955
Death date: October 5, 2011
Occupation: Entrepreneur, inventor, and industrial designer
 */

public class Week1_19_1_SteveJobsProfile {
    public static void main(String[] args) {
        String firstName = "Steve";
        String lastName = "Jobs";
        String birthDate = "February 24, 1955";
        String deathDate = "October 5, 2011";
        String occupation = "Entrepreneur, inventor, and industrial designer";

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Death date: " + deathDate);
        System.out.println("Occupation: " + occupation);
    }
}

