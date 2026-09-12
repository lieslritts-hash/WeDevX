package week1;

/*
1.29.2 3 Lamborghini Models*
easy
|
30 min
|
Share
Some popular Lamborghini models and their starting prices include:

Lamborghini Huracan: $222k

Lamborghini Aventador: $460k

Lamborghini Urus: $214k

Write a program that will print out the Lamborghini Model: price by declaring a make, model and price variables and using printf()

plain
Copy code
______ make = _____;
______ huracanModel = ____;
______ huracanPrice = _____;

______ aventadorModel = ____;
______ aventadorPrice = _____;

______ urusModel = ____;
______ urusPrice = _____;

//add a system printf statement to print Huracan info
//add a system printf statement to print Aventador info
//add a system printf statement to print Urus info
Expected Output:

plain
Copy code
Lamborghini Huracan: $222k
Lamborghini Aventador: $460k
Lamborghini Urus: $214k
use \n to break the line
 */

public class Week1_29_2_3LamborghiniModels {
    public static void main(String[] args) {
        String make = "Lamborghini";
        String huracanModel = "Huracan";
        String huracanPrice = "222";

        String aventadorModel = "Aventador";
        String aventadorPrice = "460";

        String urusModel = "Urus";
        String urusPrice = "214";

        System.out.printf("%s %s: $%sk", make, huracanModel, huracanPrice);
        System.out.printf("\n%s %s: $%sk", make, aventadorModel, aventadorPrice);
        System.out.printf("\n%s %s: $%sk", make, urusModel, urusPrice);
    }
}

