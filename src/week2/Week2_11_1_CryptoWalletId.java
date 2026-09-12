package week2;

import java.util.Scanner;

/*
2.11.1 Crypto Wallet Id
easy
|
30 min
|
Share
A crypto wallet ID is a unique identifier to access a
cryptocurrency wallet. It is similar to a bank account
number and is used to receive, store, and manage digital
assets such as Bitcoin, Ethereum, and other cryptocurrencies.
it looks like 0x742d35Cc6634C0532925a3b844Bc454e4438f44e Write
a program that asks the user to enter the crypto wallet ID of
a receiver, then compares the entered value to
0x742d35Cc6634C0532925a3b844Bc454e4438f44e and
prints out the following message: Expected Output:

plain
Copy code
Please enter the crypto wallet ID of a receiver:
Transaction Approved: X
Where X is a boolean value.


 */

public class Week2_11_1_CryptoWalletId {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the crypto wallet ID of a receiver:");
        String cryptoWalletID = input.nextLine();

        boolean matchesValue = cryptoWalletID.equals("0x742d35Cc6634C0532925a3b844Bc454e4438f44e");
        System.out.println("Transaction Approved: " + matchesValue);
    }
}
