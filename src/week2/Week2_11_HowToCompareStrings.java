package week2;

import java.util.Scanner;

/*
Explore the different methods for comparing strings in
Java, including using the equals method in this comprehensive
How to Compare Strings tutorial.
 */

public class Week2_11_HowToCompareStrings {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the crypto wallet ID of a receiver:");
        String cryptoWalletID = input.nextLine();

        boolean matchesValue = cryptoWalletID.equals("0x742d35Cc6634C0532925a3b844Bc454e4438f44e");
        System.out.println("Transaction Approved: " + matchesValue);
    }
}