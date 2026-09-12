package week1;

/*
1.23.3 How much does Tesla save?*
easy
|
30 min
|
Share
Write a program that calculates the amount of
money saved by using a Tesla Model 3 compared to a
gasoline Camry. given both cars drive 15000 miles in a
year. It costs $555 for Tesla Model 3 to drive 15k miles
and $1,589 for Camry to cover the same distance.

java
Copy code
____ model3Cost = ___;
____ camryCost = ____;
____ savedAmount = ____;

System.out.println(savedAmount);
 */

public class Week1_23_3_HowMuchDoesTeslaSave {
    public static void main(String[] args) {
        int model3Cost = 555;
        int camryCost = 1_589;

        int savedAmount = camryCost - model3Cost;

        System.out.println(savedAmount);
    }
}

