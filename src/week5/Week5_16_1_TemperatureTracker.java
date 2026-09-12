package week5;

/*
5.16.1 Temperature Tracker*
easy
|
30 min
|
Share
In this exercise, you need to explore a pre-implemented program that simulates a temperature tracker for a week. The program utilizes a two-dimensional array to store daily temperatures for each day of the week. The temperatures are displayed in a tabular format, allowing you to view the weekly temperature records.

Instructions:
Run the provided Java program by clicking Submit button to see what will print the program. No need to edit the code.

Observe the displayed temperatures for each day and the maximum, minimum, and average temperatures for the entire week.

Examine the code structure and try to understand the implemented methods for calculating maximum, minimum, and average temperatures using 2D arrays.

Code editor
java
Copy code
public class Main {
  public static void main(String[] args) {
    // Pre-implemented Temperature Tracker program
    // No manual code modifications needed
    // Simply Submit the program to view the temperature records
    displayTemperatureTracker();
  }

  // Pre-implemented method to display temperature tracker
  public static void displayTemperatureTracker() {
    int[][] weeklyTemperatures = {
      {23, 25, 22, 24, 27}, // Monday
      {24, 26, 21, 23, 25}, // Tuesday
      {22, 24, 20, 23, 26}, // Wednesday
      {25, 27, 23, 26, 28}, // Thursday
      {26, 28, 25, 27, 29}, // Friday
      {24, 26, 22, 25, 28}, // Saturday
      {25, 27, 24, 26, 30}  // Sunday
    };

    // Displaying the temperatures for each day of the week
    System.out.println("Date\tTime 1\tTime 2\tTime 3\tTime 4\tTime 5");
    for (int i = 0; i < weeklyTemperatures.length; i++) {
      System.out.printf("Day %d:\t", i + 1);
      for (int j = 0; j < weeklyTemperatures[i].length; j++) {
        System.out.printf("%d°C", weeklyTemperatures[i][j]);
        if (j < weeklyTemperatures[i].length - 1) System.out.print("\t");
      }
      System.out.println();
    }

    // Calculate and display the maximum, minimum, and average temperatures for the week
    int maxTemp = getMaxTemperature(weeklyTemperatures);
    int minTemp = getMinTemperature(weeklyTemperatures);
    double avgTemp = getAverageTemperature(weeklyTemperatures);

    System.out.printf("Maximum Temperature for the Week: %d°C\n", maxTemp);
    System.out.printf("Minimum Temperature for the Week: %d°C\n", minTemp);
    System.out.printf("Average Temperature for the Week: %.2f°C\n", avgTemp);
  }

  // Pre-implemented method to calculate the maximum temperature for the week
  public static int getMaxTemperature(int[][] temperatures) {
    int max = temperatures[0][0];
    for (int[] dailyTemps : temperatures) {
      for (int temp : dailyTemps) {
        if (temp > max) {
          max = temp;
        }
      }
    }
    return max;
  }

  // Pre-implemented method to calculate the minimum temperature for the week
  public static int getMinTemperature(int[][] temperatures) {
    int min = temperatures[0][0];
    for (int[] dailyTemps : temperatures) {
      for (int temp : dailyTemps) {
        if (temp < min) {
          min = temp;
        }
      }
    }
    return min;
  }

  // Pre-implemented method to calculate the average temperature for the week
  public static double getAverageTemperature(int[][] temperatures) {
    int total = 0;
    int count = 0;
    for (int[] dailyTemps : temperatures) {
      for (int temp : dailyTemps) {
        total += temp;
        count++;
      }
    }
    return (double) total / count;
  }
}
 */


public class Week5_16_1_TemperatureTracker {
    public static void main(String[] args) {
        // Pre-implemented Temperature Tracker program
        // No manual code modifications needed
        // Simply Submit the program to view the temperature records
        displayTemperatureTracker();
    }

    // Pre-implemented method to display temperature tracker
    public static void displayTemperatureTracker() {
        int[][] weeklyTemperatures = {
                {23, 25, 22, 24, 27}, // Monday
                {24, 26, 21, 23, 25}, // Tuesday
                {22, 24, 20, 23, 26}, // Wednesday
                {25, 27, 23, 26, 28}, // Thursday
                {26, 28, 25, 27, 29}, // Friday
                {24, 26, 22, 25, 28}, // Saturday
                {25, 27, 24, 26, 30}  // Sunday
        };

        // Displaying the temperatures for each day of the week
        System.out.println("Date\tTime 1\tTime 2\tTime 3\tTime 4\tTime 5");
        for (int i = 0; i < weeklyTemperatures.length; i++) {
            System.out.printf("Day %d:\t", i + 1);
            for (int j = 0; j < weeklyTemperatures[i].length; j++) {
                System.out.printf("%d°C", weeklyTemperatures[i][j]);
                if (j < weeklyTemperatures[i].length - 1) System.out.print("\t");
            }
            System.out.println();
        }

        // Calculate and display the maximum, minimum, and average temperatures for the week
        int maxTemp = getMaxTemperature(weeklyTemperatures);
        int minTemp = getMinTemperature(weeklyTemperatures);
        double avgTemp = getAverageTemperature(weeklyTemperatures);

        System.out.printf("Maximum Temperature for the Week: %d°C\n", maxTemp);
        System.out.printf("Minimum Temperature for the Week: %d°C\n", minTemp);
        System.out.printf("Average Temperature for the Week: %.2f°C\n", avgTemp);
    }

    // Pre-implemented method to calculate the maximum temperature for the week
    public static int getMaxTemperature(int[][] temperatures) {
        int max = temperatures[0][0];
        for (int[] dailyTemps : temperatures) {
            for (int temp : dailyTemps) {
                if (temp > max) {
                    max = temp;
                }
            }
        }
        return max;
    }

    // Pre-implemented method to calculate the minimum temperature for the week
    public static int getMinTemperature(int[][] temperatures) {
        int min = temperatures[0][0];
        for (int[] dailyTemps : temperatures) {
            for (int temp : dailyTemps) {
                if (temp < min) {
                    min = temp;
                }
            }
        }
        return min;
    }

    // Pre-implemented method to calculate the average temperature for the week
    public static double getAverageTemperature(int[][] temperatures) {
        int total = 0;
        int count = 0;
        for (int[] dailyTemps : temperatures) {
            for (int temp : dailyTemps) {
                total += temp;
                count++;
            }
        }
        return (double) total / count;
    }
}