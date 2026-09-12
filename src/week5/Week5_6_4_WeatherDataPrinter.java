package week5;

/*
5.6.6 Weather Data Printer
easy
|
30 min
|
Share
Create a static method named printWeatherData() that takes a
double array of daily temperatures in Fahrenheit as input.
The method should print all temperature values in the following format:
{ i + 1 } - { arr[i] } (e.g. 1 - 75.2), where i+1 is a month's number and arr[i]
is the value of the current month under index i. The array can have from 1 to 12 values.

Example:
Parameters:

plain
Copy code
double[] {75.2, 82.5, 78.9, 85.1, 79.4}
Return: void Output:

plain
Copy code
1 - 75.2
2 - 82.5
3 - 78.9
4 - 85.1
5 - 79.4
 */
//write your static method here. No need to add Main class or main method.


public class Week5_6_4_WeatherDataPrinter {
    public static void main(String[] args) {

        printWeatherData(new double[] {75.2, 82.5, 78.9, 85.1, 79.4});

    }

    public static void printWeatherData(double[] dailyTemp) {

        for(int i = 0; i < dailyTemp.length; i++) {
            System.out.println((i + 1) + " - " + dailyTemp[i]);
        }
    }
}
