package week3;

/*
3.34.3 GPD
easy
|
30 min
|
Share
Create a Java program that includes a static method named calculateGDP(). The method should take four doubles as params - consumption (C), investment (I), governmentSpending (G), and netExports (NX) in the same exact order - and calculate the Gross domestic product (GDP) using the formula Y = consumption + investment + governmentSpending + netExports. The method should have a void return type, which means it does not return a value but simply performs the calculation and prints the result to the console. Expected Output: consumption (C): 2000.0 investment (I): 1000.0 government spending (G): 1500.0 net exports (NX): 500.0

plain
Copy code
5000.0
 */

public class Week3_34_3_GPD {
    public static void main(String[] args) {
        calculateGDP(2000.0, 1000.0, 1500.0, 500.0);
    }

    public static void calculateGDP(double C, double I, double G, double NX) {
        double Y = C + I + G + NX;
        System.out.println(Y);
    }
}
