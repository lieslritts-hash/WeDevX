package week1;

/*
1.20.5 Create an invoice*
easy
|
30 min
|
Share
Write a program that generates an invoice for a product.
The invoice should include the following information:

plain
Copy code
___ productName  = ____;
___ quantity = _____;
____ price = _____;
Every parameter should be printed on the separate line,
use string concatenation to generate the invoice in the
following format.

plain
Copy code
Invoice for: [Product Name]
Quantity: [Quantity]
Price: $[Price]
Total: $[Total Amount]
 */

public class Week1_20_5_CreateAnInvoice {
    public static void main(String[] args) {
        String productName = "Notebook";
        String quantity = "2";
        String price = "$1500.0";
        String total = "$3000.0";

        String productInvoice = "Invoice for: " + productName + "\nQuantity: " + quantity + "\nPrice: " + price + "\nTotal: " + total;
        System.out.println(productInvoice);
    }
}

