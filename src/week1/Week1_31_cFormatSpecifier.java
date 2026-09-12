package week1;

/*
1.31 %c Format Specifier
Discover the use of the %c format specifier in Java for
formatting characters, including how to use it with the
printf method, placeholders, and more, in this comprehensive
%c Format Specifier tutorial.

Important note: Almost all of our exercises expect you to use
"System.out.println()", so use "print" or "printf" only when
the requirements ask for it, otherwise exercise will be
considered as wrong.
 */

public class Week1_31_cFormatSpecifier {
    public static void main(String[] args) {
        char upShiftSign = '+';
        char downShiftSign = '-';

        String upShiftDescription = "paddle, the gearbox will shift up to the next higher gear";
        String downShiftDescription = "paddle will result in a downshift to a lower gear";

        System.out.printf(
                "%c %s\n" +
                        "%c %s",
                upShiftSign, upShiftDescription,
                downShiftSign, downShiftDescription
        );
    }
}

