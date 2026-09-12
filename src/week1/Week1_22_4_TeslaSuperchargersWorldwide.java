package week1;

/*
1.22.4 Tesla Superchargers Worldwide*
easy
|
30 min
|
Share
In 2022 Tesla installed 19000 supercharger stations.
In 2023 Tesla is planning to install 10000 more.
How many Tesla supercharger stations are going to be
there by the end of 2023?

java
Copy code
___ numTeslaSuperchargers2022 = ____;
___ numTeslaSuperchargers2023 = ____;

___ total = ____;
System.out.println(total);

 */

public class Week1_22_4_TeslaSuperchargersWorldwide {
    public static void main(String[] args) {
        int numTeslaSuperchargers2022 = 19_000;
        int numTeslaSuperchargers2023 = 10_000;

        int total = numTeslaSuperchargers2022 + numTeslaSuperchargers2023;

        System.out.println(total);
    }
}

