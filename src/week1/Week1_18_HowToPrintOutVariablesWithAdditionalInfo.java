package week1;

/*
In this video lecture, we will learn how to print out
variables in Java programming language effectively.
You will learn about the different ways to print variables
and how to include additional information (e.g. labels,
formatting, etc.) for better readability. By the end of
this lecture, you will have the skills to create clear
and informative output in your programs.
 */
public class Week1_18_HowToPrintOutVariablesWithAdditionalInfo {
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

