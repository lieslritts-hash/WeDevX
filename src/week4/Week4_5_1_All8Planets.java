package week4;

/*
4.5.1 All 8 planets*
easy
|
30 min
|
Share
Write a Java program that prints out each character of 8 planets
Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, and Neptune
in separate lines using 8 while loops. After printing all the
characters of each planet, print out "=========" to separate
each planet. Input: There is no input required for this program.
Output: The program should output each character of the 8 planets,
with each character printed on a separate line. After each planet's
characters have been printed, the program should print out "========="
to separate each planet.

plain
Copy code
Output:
M
e
r
c
u
r
y
=========
V
e
n
u
s
=========
E
a
r
t
h
=========
M
a
r
s
=========
J
u
p
i
t
e
r
=========
S
a
t
u
r
n
=========
U
r
a
n
u
s
=========
N
e
p
t
u
n
e
=========
 */

public class Week4_5_1_All8Planets {
    public static void main(String[] args) {

        String planet = "Mercury";
        int counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Venus";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Earth";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Mars";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Jupiter";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Saturn";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Uranus";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");

        planet = "Neptune";
        counter = 0;

        while (counter < planet.length()) {
            System.out.println(planet.charAt(counter));
            counter++;
        }
        System.out.println("=========");
    }
}