package week1;

/*
1.18.1 Some facts about United States*
easy
|
30 min
|
Share
The following are some facts about the United States:

The United States is the third largest country in the
world by land area,
covering over 9 million square kilometers.

The United States is a federal constitutional republic
with a democratic system of government.

The United States has a population of over 330 million
people, making it the third most populous country in the world.

The economy of the United States is one of the largest and
most developed in the world, with a Gross Domestic Product
(GDP) of over $21 trillion.

Write a program that stores the information about
totalLandAreaInSqKm, isDemoctatic, totalPopulation,
totalGDP assigns the values from the above facts then
prints them out in the same order with the descriptions.

plain
Copy code
____ totalLandAreaInSqKm = ____;
 ____ isDemocratic        = ____;
 ____ totalPopulation     = ____;
 ____ totalGDP            = ____;
The expected output of the program: The United States covers 9000000 square kilometers of land Is The United States a democratic country? true The United States has a population of over 330000000 people Gross Domestic Product (GDP) is over $21000000000000


 */

public class Week1_18_1_SomeFactsAboutUnitedStates {
    public static void main(String[] args) {
        int totalLandAreaInSqKm = 9_000_000;
        boolean isDemocratic = true;
        int totalPopulation = 330_000_000;
        long totalGDP = 21_000_000_000_000L;

        System.out.println("The United States covers " + totalLandAreaInSqKm + " square kilometers of land");
        System.out.println("Is The United States a democratic country? " + isDemocratic);
        System.out.println("The United States has a population of over " + totalPopulation + " people");
        System.out.println("Gross Domestic Product (GDP) is over $" + totalGDP);
    }
}

