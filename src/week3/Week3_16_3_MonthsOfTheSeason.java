package week3;

/*
3.16.3 Months of the Season*
easy
|
30 min
|
Share
Write a Java program that asks the user to input a season
(e.g. winter, summer). The program should then use a switch
statement to determine the corresponding months in the season,
and output them to the console. For example, if the user inputs
"winter", the program should output December January February
If the user inputs "summer", the program should output June
July August Your program should use appropriate variable names
and include comments to explain the logic behind the switch
statement. Test your program with various inputs to ensure it
works correctly. Sample Output 1: spring

plain
Copy code
Enter a season:
March
April
May
Sample Output 2: fall

plain
Copy code
Enter a season:
September
October
November
Sample Output 3: summer

plain
Copy code
Enter a season:
June
July
August
Sample Output 4: winter

plain
Copy code
Enter a season:
December
January
February

 */

import java.util.Scanner;

public class Week3_16_3_MonthsOfTheSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a season:");
       String season = sc.nextLine();

        switch (season) {
            case "winter":
                System.out.println("December");
                System.out.println("January");
                System.out.println("February");
                break;
            case "spring":
                System.out.println("March");
                System.out.println("April");
                System.out.println("May");
                break;
            case "summer":
                System.out.println("June");
                System.out.println("July");
                System.out.println("August");
                break;
            case "fall":
                System.out.println("September");
                System.out.println("October");
                System.out.println("November");
                break;
            default:
                System.out.println("Invalid season. Please enter winter, spring, summer, or fall.");
        }

    }
}
