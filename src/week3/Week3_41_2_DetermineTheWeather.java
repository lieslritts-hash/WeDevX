package week3;

/*
3.41.2 Determine the Weather*
easy
|
30 min
|
Share
Write a static method called determineWeather() that accepts a temperature as an int parameter and returns the weather for that temperature as a String. In case of some other option, return the string: Not found

Expected result:
plain
Copy code
Input: 20
Output: Sunny

Input: 10
Output: Cloudy

Input: 0
Output: Snowy

Input: -20
Output: Freezing
 */
//write your static method here. No need to add Main class or main method.

public class Week3_41_2_DetermineTheWeather {
    public static void main(String[] args) {
       String weather = determineWeather(20);
       System.out.println(weather);

        String weather2 = determineWeather(10);
        System.out.println(weather2);

        String weather3 = determineWeather(0);
        System.out.println(weather3);

        String weather4 = determineWeather(-20);
        System.out.println(weather4);

    }
    public static String determineWeather(int temperature) {
        switch (temperature) {
            case -20:
                return "Freezing";
            case 0:
                return "Snowy";
            case 10:
                return "Cloudy";
            case 20:
                return "Sunny";
            default:
                return "Not found";
        }
    }
}
