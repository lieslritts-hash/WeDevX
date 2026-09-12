package week3;

/*
3.29.5 Gas Station
easy
|
30 min
|
Share
You are a gas station owner. You want to set the price of gasoline for your station in a way that will attract customers from other gas stations. Your competitor's gas price is $2.60 per gallon, to be more competitive you need to set the price to 2.55 per gallon and print the following information by calling the setGasPrice() method, for example: setGasPrice("2.55")

plain
Copy code
The price of gasoline at your station is 2.55 per gallon.
Hint
plain
Copy code
You need to call setGasPrice() method and put inside it a String with a number as a parameter.

Don't forget that this method just returns the String, it doesn't print it.

You can store the result of this method into a variable or put it directly to System.out.println()
 */

public class Week3_29_5_GasStation {
    public static void main(String[] args) {
        // write below to complete the program
        String gasPrice = "2.55";
        System.out.println(setGasPrice(gasPrice));

    }

    public static String setGasPrice(String gasPrice) {
        String info = "The price of gasoline at your station is " + gasPrice + " per gallon.";
        return info;
    }
}

