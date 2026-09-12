package week1;

/*
1.30.2 Diablo*
easy
|
30 min
|
Share
Lamborghini is famous for its high-performance sports cars,
such as the Countach, Diablo, and Murciélago, which are known
for their distinctive designs and powerful engines. Write a
program that will print out Countach, Diablo, and Murcielago
using 3 %s format specifiers and a single printf()

plain
Copy code
____ countach = ____;
_____ diablo = _____;
_____ murcielago = _____;

//write a printf statement with 3 %s
Expected output:

plain
Copy code
Countach, Diablo, and Murcielago

 */

public class Week1_30_2_Diablo {
    public static void main(String[] args) {
        String countach = "Countach";
        String diablo = "Diablo";
        String murcielago = "Murcielago";

        System.out.printf(
                "%s, %s, and %s",
                countach,
                diablo,
                murcielago
        );
    }
}

