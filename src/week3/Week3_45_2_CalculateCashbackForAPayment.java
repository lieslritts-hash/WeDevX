package week3;

/*
3.45.2 Calculate Cashback for a Payment*
easy
|
30 min
|
Share
Write a method called calculateCashback() that calculates the cashback amount for a customer's purchase based on certain conditions. The method accepts two parameters: paymentMethod (a String indicating the payment method) and purchaseAmount (a double representing the purchase amount). The method returns a double representing the cashback amount that will be credited to the customer's account after the purchase.

Conditions for cashback calculation:
If the paymentMethod is "cash" and the purchaseAmount is greater than 0, the customer receives 3% cashback on the purchaseAmount.

If the paymentMethod is "credit card" and the purchaseAmount is greater than 0, the customer receives 2% cashback on the purchaseAmount.

If the purchaseAmount is 0 or less, the customer does not receive any cashback.

If the paymentMethod is empty (i.e., an empty string), the customer does not receive any cashback.

Use the String isEmpty() method to check if the parameters are empty or not.

Example of result:
plain
Copy code
Input: paymentMethod = "cash", purchaseAmount = 100.0
Output: 3.0

Input: paymentMethod = "credit card", purchaseAmount = 50.0
Output: 1.0

Input: paymentMethod = "", purchaseAmount = 200.0
Output: 0.0

Input: paymentMethod = "credit card", purchaseAmount = 0.0
Output: 0.0
Hint
You can use switch statement to switch between cash, credit card and other
payment methods and if statement to compare the purchase amount. Or you can
use if statement for both of them
 */
//write your static method here. No need to add Main class or main method.

public class Week3_45_2_CalculateCashbackForAPayment {
    public static void main(String[] args) {

        System.out.println(calculateCashback("cash", 100.0));
        System.out.println(calculateCashback("credit card", 50.0));
        System.out.println(calculateCashback("", 200.0));
        System.out.println(calculateCashback("credit card", 0.0));

    }

    public static double calculateCashback(String paymentMethod, double purchaseAmount) {
        if (paymentMethod.isEmpty()) {
            return 0.0;
        } else if (paymentMethod.equals("cash") && purchaseAmount > 0) {
            return purchaseAmount * 0.03;
        } else if (paymentMethod.equals("credit card") && purchaseAmount > 0) {
            return purchaseAmount * 0.02;
        } else if (purchaseAmount <= 0) {
            return 0.0;
        } else {
            return 0.0;
        }
    }
}
