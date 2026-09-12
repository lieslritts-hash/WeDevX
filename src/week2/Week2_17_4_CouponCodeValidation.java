package week2;

import java.util.Scanner;

/*
2.17.4 Coupon code validation*
easy
|
30 min
|
Share
Write a program that validates a coupon code entered by a customer. If the customer enters a code that matches a valid code, they are eligible for a discount. The program should compare the entered code with a list of valid codes. Valid codes are:

10OFFNOW

SPRINGSALE

SAVEBIG2022

FEBRUARY25

SUMMERSALE21

plain
Copy code
____ customerEnteredCoupon = ____;
____ isValidCoupon = _____;
Expected output:

plain
Copy code
Please enter your coupon:
The Coupon is valid: X
Where X is a true of false value. Note: All coupons should be
in Upper case.


 */

public class Week2_17_4_CouponCodeValidation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your coupon:");
        String customerEnteredCoupon = sc.nextLine();

        boolean isValidCoupon = customerEnteredCoupon.equals("10OFFNOW") || customerEnteredCoupon.equals("SPRINGSALE") || customerEnteredCoupon.equals("SAVEBIG2022") || customerEnteredCoupon.equals("FEBRUARY25") || customerEnteredCoupon.equals("SUMMERSALE21");

        System.out.println("The Coupon is valid: " + isValidCoupon);
    }
}
