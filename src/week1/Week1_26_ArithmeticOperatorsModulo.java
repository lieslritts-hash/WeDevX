package week1;

/*
Learn about the modulo (%) operator in Java, its use for
finding the remainder in division operations, its precedence,
associativity, and how to use it in expressions, in this
comprehensive Modulo Arithmetic Operator tutorial.
 */

public class Week1_26_ArithmeticOperatorsModulo {
    public static void main(String[] args) {
        int originalBatteryCapacity = 100;
        int batterySpent = 85;

        int remainingBatteryLife = originalBatteryCapacity % batterySpent;

        System.out.println("The remaining battery life is: " + remainingBatteryLife + "%");
    }
}

