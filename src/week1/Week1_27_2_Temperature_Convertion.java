package week1;

/*
1.27.2 Temperature Convertion*
easy
|
30 min
|
Share
In this exercise, you will convert a temperature from
Celsius to Fahrenheit using arithmetic operations. Given
the positive 25.5 degrees in celsius. Write a java program
that will convert it to Fahrenheit; Calculate the temperature
in Fahrenheit using the following formula:

plain
Copy code
fahrenheit = (temperature * 9 / 5) + 32;
Expected output:

plain
Copy code
Temperature in Fahrenheit: X
Where X is the converted value of the temperature.


 */

public class Week1_27_2_Temperature_Convertion {
    public static void main(String[] args) {
        double temperature = 25.5;
        double fahrenheit = (temperature * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}
