package week3;

/*
3.41.1 Determine the Season*
easy
|
30 min
|
Share
Write a static method called determineSeason() that accepts a month number as an int parameter and returns the String - season for that month. If the month does not match any of the seasons, return Invalid month.

For example:
plain
Copy code
Input: 1
Output: Winter

Input: 2
Output: Winter

Input: 3
Output: Spring

Input: 9
Output: Fall

Input: 13
Output: Invalid month
Hint
Partial solution
If this exercise raises some questions for you, look at this code and try to add cases here for spring, summer, and fall.

java
Copy code
public static String determineSeason(int month) {
    switch (month) {
        case 1:
        case 2:
        case 12:
            return "Winter";
        default:
            return "Invalid month";
    }
}
 */
//write your static method here. No need to add Main class or main method.

public class Week3_41_1_DetermineTheSeason {
    public static void main(String[] args) {
        String season = determineSeason(1);
        System.out.println(season);

        String season2 = determineSeason(2);
        System.out.println(season2);

        String season3 = determineSeason(3);
        System.out.println(season3);

        String season4 = determineSeason(9);
        System.out.println(season4);

        String season5 = determineSeason(13);
        System.out.println(season5);

    }

    public static String determineSeason(int month) {
        switch (month) {
            case 12:
                return "Winter";
            case 1:
                return "Winter";
            case 2:
                return "Winter";
            case 3:
                return "Spring";
            case 4:
                return "Spring";
            case 5:
                return "Spring";
            case 6:
                return "Summer";
            case 7:
                return "Summer";
            case 8:
                return "Summer";
            case 9:
                return "Fall";
            case 10:
                return "Fall";
            case 11:
                return "Fall";
            default:
                return "Invalid month";
        }
    }
}
