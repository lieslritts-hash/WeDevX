package week5;

/*
5.34.2 Population Tracker*
easy
|
30 min
|
Share
Create a static method named printPopulationData() that takes an
ArrayList of Integer values (ArrayList) as a parameter. This method
should to print each population value along with its corresponding index
in the ArrayList on a new line. For example: 0 - 1000, 1 - 1200, 2 - 1500.
Use for-loop and print current loop's index to indicate the index in ArrayList.

Return Type: void

Example #1:
Parameter:

plain
Copy code
ArrayList<Integer> population = new ArrayList<>({100000, 120000, 150000})
Output:

plain
Copy code
0 - 100000
1 - 120000
2 - 150000
Example of solution
plain
Copy code
static void printPopulationData(ArrayList<Integer> population) {
    // Iterates through the population ArrayList
    for (int i = 0; i < population.size(); i++) {
        // Retrieves the population value at the current index
        int populationValue = population.get(i);
        // Prints the index and the corresponding population value
        System.out.println(i + " - " + populationValue);
    }
}
 */
//write your static method here. No need to add Main class or main method.

public class Week5_34_2_PopulationTracker {
    public static void main(String[] args) {

    }
}
