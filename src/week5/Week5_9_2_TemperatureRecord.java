package week5;

/*
5.9.2 Temperature Record*
easy
|
30 min
|
Share
Create a static method findMaxTemperature() that takes an array int[]
parameter with daily temperatures for a week. The program should find the highest
temperature recorded during that week and display it along with the corresponding day (not index).

Example:
Parameter: int[] = {75, 82, 79, 88, 92, 86, 78} Return: void Output: The highest temperature was 92 on day 5
 */

//write your static method here. No need to add Main class or main method.

public class Week5_9_2_TemperatureRecord {
    public static void main(String[] args) {

        int[] tempArray = {75, 82, 79, 88, 92, 86, 78};

        findMaxTemperature(tempArray);

    }

    public static void findMaxTemperature(int[] tempArray) {

        int maxTemp = tempArray[0];
        int maxDay = 1;

        for (int i = 0; i < tempArray.length; i++) {

            if (tempArray[i] > maxTemp) {
                maxTemp = tempArray[i];
                maxDay = i + 1;
            }

        }
        System.out.println("The highest temperature was " + maxTemp + " on day " + maxDay);
    }
}
