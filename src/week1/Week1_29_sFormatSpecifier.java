package week1;

/*
1.29 %s - Format Specifier
Learn about the use of the %s format specifier in Java for
formatting string values, including how to use it with the
printf method, placeholders, and more, in this comprehensive
 %s Format Specifier tutorial.

Important note: Almost all of our exercises expect you to use
"System.out.println()", so use "print" or "printf" only when
the requirements ask for it, otherwise exercise will be
considered as wrong.
 */

public class Week1_29_sFormatSpecifier {
    public static void main(String[] args) {
        String make = "Lamborghini";
        String huracanModel = "Huracan";
        String huracanPrice = "222k";

        System.out.printf("%s %s: $%s", make, huracanModel, huracanPrice);
    }
}

