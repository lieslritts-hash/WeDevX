package week1;

/*
1.29.1 Lamborghini*
easy
|
30 min
|
Share
Lamborghini model and it's starting price include:

Lamborghini Huracan: $222k
Write a program that will print out the Lamborghini
Model: price by declaring a make, model and price
variables and using printf()

plain
Copy code
______ make = _____;
______ huracanModel = ____;
______ hurancanPrice = _____;

//add a system printf statement
Expected Output:

plain
Copy code
Lamborghini Huracan: $222k
 */

public class Week1_29_1_Lamborghini {
    public static void main(String[] args) {
        String make = "Lamborghini";
        String huracanModel = "Huracan";
        String huracanPrice = "222k";

        System.out.printf("%s %s: $%s", make, huracanModel, huracanPrice);
    }
}

